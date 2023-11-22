package com.calc.prestativa.regrasSpringSecurity;


import com.calc.prestativa.UserRole;

public record RegisterDTO(String Username, String password, UserRole role) {
}
