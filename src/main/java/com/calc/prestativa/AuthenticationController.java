package com.calc.prestativa;

import com.calc.prestativa.regrasSpringSecurity.TokenService;
import com.calc.prestativa.userLog.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
import com.calc.prestativa.RegisterDTO;


@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserRepository repository;

    @Autowired
    private UserService userService;

    @Autowired
    private TokenService tokenService;

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody @Valid AuthenticationDTO data) {
        try {
            var usernamePassword = new UsernamePasswordAuthenticationToken(data.getUsername(), data.getPassword());
            var auth = this.authenticationManager.authenticate(usernamePassword);

            User user = (User) auth.getPrincipal();

            String token = tokenService.generateToken(user);
            return ResponseEntity.ok(new LoginResponseDTO(token));
        } catch (org.springframework.security.core.AuthenticationException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }
    @PostMapping("/processForm")
    public ResponseEntity processForm(@RequestBody @Valid AuthenticationDTO data, @RequestParam String action) {
        if ("register".equals(action)) {
            return register(new RegisterDTO(data.getUsername(), data.getPassword(), "USER"));
        } else if ("login".equals(action)) {
            return login(data);
        }

        return ResponseEntity.badRequest().build();
    }

    private ResponseEntity register(RegisterDTO data) {
        if (this.repository.findByUsername(data.getUsername()) != null) {
            return ResponseEntity.badRequest().build();
        }

        String encryptedPassword = new BCryptPasswordEncoder().encode(data.getPassword());
        User newUser = new User(data.getUsername(), encryptedPassword, UserRole.valueOf(data.getRole()));

        this.repository.save(newUser);

        return ResponseEntity.ok().build();
    }
}
