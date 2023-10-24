package com.calc.prestativa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/processForm")
    public ResponseEntity<String> processForm(@RequestParam("username") String username, @RequestParam("password") String password, @RequestParam("action") String action) {
        User newUser = new User();

        if ("register".equals(action)) {
            if (userRepository.findByUsername(username) != null) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Usuário já existe. Por favor, escolha outro nome de usuário.");
            }
            newUser.setUsername(username);
            newUser.setPassword(password);
            userRepository.save(newUser);

            return ResponseEntity.status(HttpStatus.OK).body("Usuário registrado com sucesso!");
        } else if ("login".equals(action)) {
            User user = userRepository.findByUsername(username);
            if (user != null && user.getPassword().equals(password)) {
                return ResponseEntity.status(HttpStatus.OK).body("Login bem sucedido!");
            } else {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Falha no login. Por favor, tente novamente.");
            }
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Ação inválida.");
        }
    }

    @GetMapping("/home")
    public String home(Model model, @RequestParam(value = "username", required = false) String username) {
        if (username != null) {
            model.addAttribute("username", username);
        }
        return "index";
    }
}