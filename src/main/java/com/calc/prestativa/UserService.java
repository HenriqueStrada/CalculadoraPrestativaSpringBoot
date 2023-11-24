package com.calc.prestativa;

import com.calc.prestativa.userLog.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User createUser(String username, String password, String role) {
        if (userRepository.findByUsername(username) != null) {
            throw new IllegalArgumentException("Usuário já existe. Por favor, escolha outro nome de usuário.");
        }

        String encryptedPassword = new BCryptPasswordEncoder().encode(password);
        User newUser = new User(username, encryptedPassword, UserRole.valueOf(role));
        return userRepository.save(newUser);
    }

  //Add outros métodos User
}
