package com.calc.prestativa.backEnd.util;
import javax.swing.*;


import static com.calc.prestativa.backEnd.calculos.Calc.*;
import static com.calc.prestativa.backEnd.util.Uteis.pergunteRefaz;


public class Calcula {
    //Uma calculadora bem supimpa, sabe demais..


    public static void Calculadora(){

        int respostanum = 0;
        int refazer = 1;
        System.out.println("Bem-Vindo a calculadora");
        System.out.println("Link do gitHub: https://github.com/HenriqueStrada/CalculadoraEuSabo");
        while(refazer == 1){
        System.out.println("""
                Selecione o tipo de calculadora que você quer:
                (1) Soma.
                (2) Subtração.
                (3) Multiplicação.
                (4) Divisão.
                (5) Raiz.
                (6) Circunferencia circulo.
                (7) Calcular hipotenusa.
                (8) Calculadora de Unidades de medida.
                (9) Calculadora de Angulo Seno, Cosseno, Tangente.
                """);

        String resposta = JOptionPane.showInputDialog("Responda qual conta quer fazer:");
        respostanum = Integer.parseInt(resposta);

        if(respostanum == 1){
            Soma();
            refazer = pergunteRefaz(refazer);
        } else if (respostanum == 2){
            Subtracao();
            refazer = pergunteRefaz(refazer);
        } else if (respostanum == 3){
            Multiplicacao();
            refazer = pergunteRefaz(refazer);
        } else if (respostanum == 4){
            Divisao();
            refazer = pergunteRefaz(refazer);
        } else if (respostanum == 5) {
            Raiz();
            refazer = pergunteRefaz(refazer);
        } else if (respostanum == 6) {
            Circunferencia();
            refazer = pergunteRefaz(refazer);
        } else if (respostanum == 7){
            Hipotenusa();
            refazer = pergunteRefaz(refazer);
        } else if(respostanum == 8){
            UnidadeMedida();
            refazer = pergunteRefaz(refazer);
        }else if (respostanum == 9){
            CalcAngulo();
            refazer= pergunteRefaz(refazer);
        }else {
            JOptionPane.showMessageDialog(null, "Coloque um valor valido!");
            System.out.println("Coloque um valor valido!");
            System.out.println("Link do gitHub: https://github.com/HenriqueStrada/CalculadoraEuSabo");
            refazer = 1;
            }
        }
    }
}