package com.calc.prestativa.backEnd.util;

import javax.swing.*;

public class Uteis {
    public static double[] pegaValores() {
        double[] numeros = new double[2];
        String valorUm = JOptionPane.showInputDialog("Digite o primeiro valor:");
        numeros[0] = Double.parseDouble(valorUm);
        String valorDois = JOptionPane.showInputDialog("Digite o segundo valor:");
        numeros[1] = Double.parseDouble(valorDois);
        return numeros;
    }
    public static int pergunteRefaz(int refazer) {
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja refazer?", "Refazer", JOptionPane.YES_NO_OPTION);
        refazer = 0;
        if (opcao == JOptionPane.YES_OPTION) {
            refazer = 1;
            if (refazer == 1) {refazer = 1;} else {refazer = 0;}
        }
        return refazer;
    }
    public static void mostrarImagem() {
        JFrame frame = new JFrame("Link do gitHub: https://github.com/HenriqueStrada/CalculadoraEuSabo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon imageIcon = new ImageIcon("src/main/resources/EuSabo.jpg");
        JLabel label = new JLabel(imageIcon);
        frame.add(label);
        frame.pack();
        frame.setVisible(true);
    }
}