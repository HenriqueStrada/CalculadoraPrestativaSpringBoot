package com.calc.prestativa;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {

    @GetMapping("/soma")
    public double calcular(@RequestParam double valor1, @RequestParam double valor2) {
        // Realizar a soma dos valores
        System.out.println("Primeiro valor: " + valor1);
        System.out.println("Segundo valor: " + valor2);
        double resultado = valor1 + valor2;
        System.out.println("Resultado: " + resultado);
        return resultado;
    }

    @GetMapping("/sub")
    public double sub(@RequestParam double valor1, @RequestParam double valor2) {
        // Realizar a subtração dos valores
        System.out.println("Primeiro valor: " + valor1);
        System.out.println("Segundo valor: " + valor2);
        double resultado = valor1 - valor2;
        System.out.println("Resultado: " + resultado);
        return resultado;
    }

    @GetMapping("/multi")
    public double multi(@RequestParam double valor1, @RequestParam double valor2) {
        // Realizar a multiplicação dos valores
        System.out.println("Primeiro valor: " + valor1);
        System.out.println("Segundo valor: " + valor2);
        double resultado = valor1 * valor2;
        System.out.println("Resultado: " + resultado);
        return resultado;
    }

    @GetMapping("/div")
    public double div(@RequestParam double valor1, @RequestParam double valor2) {
        // Realizar a divisão dos valores
        System.out.println("Primeiro valor: " + valor1);
        System.out.println("Segundo valor: " + valor2);
        double resultado = valor1 / valor2;
        System.out.println("Resultado: " + resultado);
        return resultado;
    }
    @GetMapping("/raiz")
    public double raiz(@RequestParam double valor1) {
        // Calcular a raiz quadrada do valor
        System.out.println("Primeiro valor: " + valor1);
        double resultado = Math.sqrt(valor1);
        System.out.println("Resultado: " + resultado);
        return resultado;
    }
    @GetMapping("/circu")
    public double circu(@RequestParam double valor1) {
            double resultado;
            double raioDim = valor1 * 2;
            resultado = raioDim * Math.PI;
        System.out.println("Resultado: " + resultado);
        return resultado;
    }
    @GetMapping("/hipo")
    public double hipo(@RequestParam double valor1, @RequestParam double valor2) {
        double resultado = (valor1 * valor1) + (valor2 * valor2);
        resultado = Math.sqrt(resultado);
        System.out.println("Resultado: " + resultado);
        return resultado;
    }
    @GetMapping("/metPes")
    public double metPes(@RequestParam double valor1) {
        double resultado = (valor1 * 3.28084);
        System.out.println("Resultado: " + resultado);
        return resultado;
    }
    @GetMapping("/pesMet")
    public double pesMet(@RequestParam double valor1) {
        double resultado = (valor1 * 0.3048);
        System.out.println("Resultado: " + resultado);
        return resultado;
    }
    @GetMapping("/quiMil")
    public double quiMil(@RequestParam double valor1) {
        double resultado = (valor1 * 0.621371);
        System.out.println("Resultado: " + resultado);
        return resultado;
    }
    @GetMapping("/milQui")
    public double milQui(@RequestParam double valor1) {
        double resultado = (valor1 * 1.60934);
        System.out.println("Resultado: " + resultado);
        return resultado;
    }
    @GetMapping("/polCen")
    public double polCen(@RequestParam double valor1) {
        double resultado = (valor1 * 2.54);
        System.out.println("Resultado: " + resultado);
        return resultado;
    }
    @GetMapping("/cenPol")
    public double cenPol(@RequestParam double valor1) {
        double resultado = (valor1 * 0.393701);
        System.out.println("Resultado: " + resultado);
        return resultado;
    }
    @GetMapping("/seno")
    public double seno(@RequestParam double valor1, @RequestParam double valor2) {
        double resultado = valor1 / valor2;
        System.out.println("Resultado: " + resultado);
        return resultado;
        //catopost / catohipo
    }
    @GetMapping("/cos")
    public double cos(@RequestParam double valor1, @RequestParam double valor2) {
        double resultado = valor1 / valor2;
        System.out.println("Resultado: " + resultado);
        return resultado;
        //catoAdj / catohipot
    }
    @GetMapping("/tan")
    public double tan(@RequestParam double valor1, @RequestParam double valor2) {
        double resultado = valor1 / valor2;
        System.out.println("Resultado: " + resultado);
        return resultado;
    }
}
