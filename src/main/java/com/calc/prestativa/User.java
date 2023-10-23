package com.calc.prestativa;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "users")
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Column(nullable = false, unique = true)
    private String username;
    
    @Getter
    @Column(nullable = false)
    private String password;

}
