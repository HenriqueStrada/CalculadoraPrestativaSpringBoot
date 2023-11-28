
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

    @GetMapping("/login/logCad")
    public String logCad(@RequestParam(value = "acao", required = false, defaultValue = "login") String acao, Model model) {
        model.addAttribute("acao", acao);
        return "logCad";
    }

    @PostMapping("/processForm")
    public String processForm(@RequestParam("username") String username,
                              @RequestParam("password") String password,
                              @RequestParam("action") String action,
                              Model model) {

        if ("register".equals(action)) {
            // Lógica para registro de usuário
            if (userRepository.findByUsername(username) != null) {
                model.addAttribute("mensagem", "Usuário já existe. Por favor, escolha outro nome de usuário.");
            } else {
                User newUser = new User();
                newUser.setUsername(username);
                newUser.setPassword(password);
                userRepository.save(newUser);
                model.addAttribute("mensagem", "Usuário registrado com sucesso!");
            }
        } else if ("login".equals(action)) {
            // Lógica para login
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

    @PostMapping("/alterarNome")
    public String alterarNome(@RequestParam("username") String username,
                              @RequestParam("alterar_username") String novoUsername,
                              Model model) {

        // Buscar o usuário no banco de dados pelo nome de usuário atual
        User user = userRepository.findByUsername(username);

        if (user != null) {
            // Atualizar o nome do usuário
            user.setUsername(novoUsername);

            // Salvar a entidade atualizada no banco de dados
            userRepository.save(user);

            // Atualizar o model com as informações necessárias
            model.addAttribute("username", novoUsername);
            model.addAttribute("mensagem", "Nome de usuário alterado com sucesso!");
        } else {
            model.addAttribute("mensagem", "Usuário não encontrado.");
        }

        return "logCad";
    }
}