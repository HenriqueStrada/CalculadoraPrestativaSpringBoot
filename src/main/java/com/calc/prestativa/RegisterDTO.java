package com.calc.prestativa;

import jakarta.validation.constraints.NotBlank;

public class RegisterDTO {
    @NotBlank(message = "Username is required")
    private String username;

    @NotBlank(message = "Password is required")
    private String password;
    UserRole role = UserRole.fromString("ADMIN");
    RegisterDTO registerDTO = new RegisterDTO("username", "password", role.name());
    public RegisterDTO(String username, String password, String role) {
    }



    public RegisterDTO(String username, String password, UserRole role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }
}
