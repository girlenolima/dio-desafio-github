package br.com.projeto.calculadora.view;

import br.com.projeto.calculadora.control.Core;
import br.com.projeto.calculadora.model.CalculadoraModel;

import java.util.Scanner;

public class CalculadoraVIEW {


    public static void main(String[] args) {

        CalculadoraModel calculadoraModel = new CalculadoraModel();

        System.out.println(" ***************** PROJETO CALCULADORA INICIO ***************** ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("DIGITE O PRIMEIRO VALOR");
        calculadoraModel.setValor1(scanner.nextDouble());

        System.out.println("DIGITE A  OPERÇAO");
        calculadoraModel.setOperacao(scanner.next());

        System.out.println("DIGITE O SEGUNDO VALOR");
        calculadoraModel.setValor2(scanner.nextDouble());

        Core core = new Core(calculadoraModel);
        Double resultado = core.calcular();

        System.out.println("O Resultado da operaçao " + calculadoraModel.getValor1() +" "+ calculadoraModel.getOperacao() +" "+ calculadoraModel.getValor2()+  " é : " +  resultado);


        System.out.println(" ***************** PROJETO CALCULADORA FIM ***************** ");


    }


}
