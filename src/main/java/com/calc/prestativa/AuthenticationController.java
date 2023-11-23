import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

@Controller
public class UserController {

    @GetMapping("/")
    public String login() {
        return "login";
    }

    @PostMapping("/auth/processForm")
    public ModelAndView processForm(@RequestParam String username, @RequestParam String password, @RequestParam String action, HttpSession session) {
        ModelAndView mv = new ModelAndView();

        if (action.equals("register")) {
            // Registration logic goes here
            // ...
        } else if (action.equals("login")) {
            // Login logic goes here
            // ...
        }

        if (session.getAttribute("loggedUser") != null) {
            mv.setViewName("home");
        } else {
            mv.setViewName("login");
            mv.addObject("mensagem", "Erro ao realizar a ação");
        }

        return mv;
    }
}