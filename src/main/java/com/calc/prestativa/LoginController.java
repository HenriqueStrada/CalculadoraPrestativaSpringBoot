package com.calc.prestativa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/processForm")
    public String processForm(@RequestParam("username") String username, @RequestParam("password") String password, @RequestParam("action") String action) {
        User newUser = new com.calc.prestativa.User();

        if ("register".equals(action)) {
            if (userRepository.findByUsername(username) != null) {
                return "Usuário já existe. Por favor, escolha outro nome de usuário.";
            }
            newUser.setUsername(username);
            newUser.setPassword(password);
            userRepository.save(newUser);

            return "logCad";
        } else if ("login".equals(action)) {
            User user = userRepository.findByUsername(username);
            if (user != null && user.getPassword().equals(password)) {
                return "logCad";
            } else {
                return "Falha no login. Por favor, tente novamente.";
            }
        } else {
            return "Ação inválida.";
        }
    }

    @GetMapping("/home")
    public String home(Model model, @RequestParam(value = "username", required = false) String username) {
        if (username != null) {
            model.addAttribute("username", username);
        }
        return "home"; // Certifique-se de ter uma página "home.html" em src/main/resources/templates
    }
}
