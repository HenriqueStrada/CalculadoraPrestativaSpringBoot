package com.calc.prestativa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/processForm")
    public String processForm(@RequestParam("username") String username, @RequestParam("password") String password, @RequestParam("action") String action, Model model) {
        User newUser = new User();

        if ("register".equals(action)) {
            if (userRepository.findByUsername(username) != null) {
                model.addAttribute("mensagem", "Usuário já existe. Por favor, escolha outro nome de usuário.");
            } else {
                newUser.setUsername(username);
                newUser.setPassword(password);
                userRepository.save(newUser);
                 model.addAttribute("mensagem", "Usuário registrado com sucesso!");
            }
        } else if ("login".equals(action)) {
            User user = userRepository.findByUsername(username);
            if (user != null && user.getPassword().equals(password)) {
                model.addAttribute("username", username);
                model.addAttribute("mensagem", "Login bem sucedido!");
            } else {
                model.addAttribute("mensagem", "Falha no login. Por favor, tente novamente.");
            }
        } else {
            model.addAttribute("mensagem", "Ação inválida.");
        }

        return "logCad";
    }


    @GetMapping("/home")
    public String home(Model model, @RequestParam(value = "username", required = false) String username) {
        if (username != null) {
            model.addAttribute("username", username);
        }
        return "index";
    }
}
