package com.calc.prestativa;
import org.springframework.beans.factory.annotation.Autowired;
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

            return "Usuário registrado com sucesso!";
        } else if ("login".equals(action)) {
            User user = userRepository.findByUsername(username);
            if (user != null && user.getPassword().equals(password)) {
                return "Login bem sucedido!";
            } else {
                return "Falha no login. Por favor, tente novamente.";
            }
        } else {
            return "Ação inválida.";
        }
    }
}