package com.calc.prestativa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {

    @GetMapping("/soma")
    public int calcular(@RequestParam int valor1, @RequestParam int valor2) {
        // Realizar a soma dos valores
        System.out.println("Primeiro valor: " + valor1);
        System.out.println("Segundo valor: " + valor2);
        int resultado = valor1 + valor2;
        System.out.println("Resultado: " + resultado);
        return resultado;
    }



}
