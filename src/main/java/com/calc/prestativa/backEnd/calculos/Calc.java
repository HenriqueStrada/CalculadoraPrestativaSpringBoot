package com.calc.prestativa.backEnd.calculos;

import javax.swing.*;

import static com.calc.prestativa.backEnd.util.Uteis.pegaValores;


public class Calc {
    public static void Soma(){
        double[] numeros = pegaValores();
        JOptionPane.showMessageDialog(null, "A soma de: " + numeros[0] + " por " + numeros[1] + " é " + (numeros[0] + numeros[1]));
        System.out.println("O resultado da soma é: " + (numeros[0]+ numeros[1]));
        System.out.println("Link do gitHub: https://github.com/HenriqueStrada/CalculadoraEuSabo");
    }
    public static void Subtracao(){
        double[] numeros = pegaValores();
        JOptionPane.showMessageDialog(null, "A subtração de " + numeros[0] + " por " + numeros[1] + " é " + (numeros[0] - numeros[1]));
        System.out.println("O resultado da subtração é: " + (numeros[0] - numeros[1]));
        System.out.println("Link do gitHub: https://github.com/HenriqueStrada/CalculadoraEuSabo");
    }
    public static void Multiplicacao(){
        double[] numeros = pegaValores();
        JOptionPane.showMessageDialog(null, "A multiplicação de " + numeros[0] + " por " + numeros[1] + " é " + (numeros[0] * numeros[1]));
        System.out.println("O resultado da multiplicação é: " + (numeros[0] * numeros[1]));
        System.out.println("Link do gitHub: https://github.com/HenriqueStrada/CalculadoraEuSabo");
    }
    public static void Divisao(){
        String valorUm = JOptionPane.showInputDialog("Digite o valor do numero que quer descobrir a raiz:");
        double raiz = Double.parseDouble(valorUm);
        JOptionPane.showMessageDialog(null, "A raiz de " + raiz + " é: " + Math.sqrt(raiz));
        System.out.println("A raiz de " + raiz + " é: " + Math.sqrt(raiz));
        System.out.println("Link do gitHub: https://github.com/HenriqueStrada/CalculadoraEuSabo");
    }
    public static void Raiz(){
        String valorUm = JOptionPane.showInputDialog("Digite o numero que deseja descobrir a raiz: ");
        double raiz = Double.parseDouble(valorUm);
        JOptionPane.showMessageDialog(null, "A raiz de " + raiz + " é: " + Math.sqrt(raiz));
        System.out.println("Link do gitHub: https://github.com/HenriqueStrada/CalculadoraEuSabo");
    }
    public static void Circunferencia(){
        Object[] opcoes = {"Raio", "Diametro"};
        int escolha = JOptionPane.showOptionDialog(null, "Você possui o valor do diametro, ou do raio?", "Opções",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
        if(escolha == 0){
            String valorRaio = JOptionPane.showInputDialog("Digite o valor do raio de seu circulo.");
            double raio = Double.parseDouble(valorRaio);
            double raioDim = raio * 2;
            JOptionPane.showMessageDialog(null, "A circunferencia de um circulo com raio igual a " + raio + " é: " + (raioDim * Math.PI));
        } else {
            String valorDiametro = JOptionPane.showInputDialog("Digite o valor do diametro de seu circulo");
            double diametro = Double.parseDouble(valorDiametro);
            JOptionPane.showMessageDialog(null, "A circunferencia de um circulo com diametro igual a " + diametro + " é: " + (diametro * Math.PI));
        }
    }
    public static void Hipotenusa(){
        String valorCateto = JOptionPane.showInputDialog("Digite o valor do primeiro cateto de seu triangulo");
        double catetoUm = Double.parseDouble(valorCateto);
        String valorCatetoDois = JOptionPane.showInputDialog("Digite o valor do segundo cateto de seu triangulo");
        double catetoDois = Double.parseDouble(valorCatetoDois);
        double somCatQuard = (catetoUm * catetoUm) + (catetoDois * catetoDois);
        JOptionPane.showMessageDialog(null, "A hipotenusa do seu triangulo é: " + Math.sqrt(somCatQuard));
    }
    public static void UnidadeMedida(){
        Object[] opcoes = {"Metro para pes", "Pes para metros", "Quilômetros para milhas", "Milhas para quilômetros", "Polegadas para Centimetro", "Centimetro para polegada"};
        int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Opções de medidas", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
        switch (escolha){
            case 0:
                String valorMetro = JOptionPane.showInputDialog("Digite quantos metros quer converter para pés: ");
                double metros = Double.parseDouble(valorMetro);
                JOptionPane.showMessageDialog(null, "O valor de metros convertidos para pés são de: " + (metros * 3.28084) + " pés");
                break;
            case 1:
                String valorPes = JOptionPane.showInputDialog("Digite quantos pés quer converter para metros: ");
                double pes = Double.parseDouble(valorPes);
                JOptionPane.showMessageDialog(null, "O valor de pés convertidos para metros são de: " + (pes * 0.3048) + " metros");
                break;
            case 2:
                String valorKm = JOptionPane.showInputDialog("Digite quantos quilômetros quer converter para milhas: ");
                double km = Double.parseDouble(valorKm);
                JOptionPane.showMessageDialog(null, "O valor de quilômetros convertidos para milhas são de: " + (km * 0.621371) + " milhas");
                break;
            case 3:
                String valorMilha = JOptionPane.showInputDialog("Digite quantas milhas quer converter para quilômetros: ");
                double milha = Double.parseDouble(valorMilha);
                JOptionPane.showMessageDialog(null, "O valor de milhas convertidas para quilômetros são de: " + (milha * 1.60934) + " quilômetros");
                break;
            case 4:
                String valorPolegada = JOptionPane.showInputDialog("Digite quantas polegadas quer converter para centimetros: ");
                double polegada = Double.parseDouble(valorPolegada);
                JOptionPane.showMessageDialog(null, "O valor de polegadas convertidas para centimetros são de: " + (polegada * 2.54) + " centimetros");
                break;
            case 5:
                String valorCentimetro = JOptionPane.showInputDialog("Digite quantos centimetros quer converter para polegadas: ");
                double centimetro = Double.parseDouble(valorCentimetro);
                JOptionPane.showMessageDialog(null, "O valor de centimetros convertidas para polegadas são de: " + (centimetro * 0.393701) + " polegadas");
                break;
        }
    }
    public static void CalcAngulo(){
        Object[] opcoes = {"Seno", "Cosseno", "Tangente"};
        int escolha = JOptionPane.showOptionDialog(null, "Escolha o que quer descobrir", "Medidas de angulo", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
        switch (escolha) {
            case 0:
                String valorCatOpost = JOptionPane.showInputDialog("Digite o cateto oposto da hipotenusa: ");
                double catopost = Double.parseDouble(valorCatOpost);
                String valorHipotenusa = JOptionPane.showInputDialog("Digite o valor da hipotenusa: ");
                double catohipo = Double.parseDouble(valorHipotenusa);
                JOptionPane.showMessageDialog(null, "O valor do Seno é: " + (catopost / catohipo) + " Graus");
                break;
            case 1:
                String valorCateAdja = JOptionPane.showInputDialog("Digite o cateto adjacente da hipotenusa: ");
                double catoAdj = Double.parseDouble(valorCateAdja);
                String valorHipotenus = JOptionPane.showInputDialog("Digite o valor da hipotenusa: ");
                double catohipot = Double.parseDouble(valorHipotenus);
                JOptionPane.showMessageDialog(null, "O valor do Cosseno é: " + (catoAdj / catohipot) + " Graus");
                break;
            case 2:
                String valorCateOposto = JOptionPane.showInputDialog("Digite o cateto oposto da hipotenusa: ");
                double catoOposto = Double.parseDouble(valorCateOposto);
                String valorAdjas = JOptionPane.showInputDialog("Digite o cateto adjacente da hipotenusa: ");
                double catoAdjas = Double.parseDouble(valorAdjas);
                JOptionPane.showMessageDialog(null, "O valor da Tangente é: " + (catoOposto / catoAdjas) + " Graus");
                break;
        }
    }
}
