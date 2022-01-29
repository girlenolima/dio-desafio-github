package br.com.projeto.tratamentoDeExecoes;

import javax.swing.*;

public class unChecked {

    public static void main(String[] args) {


        String a = JOptionPane.showInputDialog("Numerador");
        String b = JOptionPane.showInputDialog("Denominador");


        try {
            int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
            System.out.println(resultado);

        } catch (NumberFormatException | ArithmeticException e) {
            //e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Entrada invalida");
        }  finally {
            System.out.println("Chegamos no finaly");
        }

        System.out.println("O codigo continua");

    }


    public static int dividir(int a, int b) {

        return a / b;

    }


}
