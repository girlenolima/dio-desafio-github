package br.com.projeto.agenda;

import java.util.Scanner;

public class estrturaRepetica {


    public static void main(String[] ars){

        Scanner leitor = new Scanner(System.in);
        String nome;
        int idade = 1;


        while(idade != 0){

            System.out.println("Digite um nome");
            nome = leitor.next();

            System.out.println("Digite sua idade");
            idade = leitor.nextInt();

        }


    }


}
