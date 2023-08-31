package com.calc.prestativa;

import org.springframework.web.bind.annotation.GetMapping;
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
        double resultado;
        double raioDim = valor1 * 2;
        resultado = raioDim * Math.PI;
        System.out.println("Resultado: " + resultado);
        return resultado;

        /*
        String valorCateto = JOptionPane.showInputDialog("Digite o valor do primeiro cateto de seu triangulo");
        double catetoUm = Double.parseDouble(valorCateto);
        String valorCatetoDois = JOptionPane.showInputDialog("Digite o valor do segundo cateto de seu triangulo");
        double catetoDois = Double.parseDouble(valorCatetoDois);
        double somCatQuard = (catetoUm * catetoUm) + (catetoDois * catetoDois);
        JOptionPane.showMessageDialog(null, "A hipotenusa do seu triangulo é: " + Math.sqrt(somCatQuard));
    */
    }

}
