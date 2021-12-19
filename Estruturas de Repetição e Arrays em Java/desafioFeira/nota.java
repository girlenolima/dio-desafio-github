package br.com.projeto.desafioFeira;

import java.util.Scanner;

public class nota {

    public static void main(String[] args) {


        Scanner leitor = new Scanner(System.in);
        int nota;


        System.out.println("Digite uma nota : ");
        nota = leitor.nextInt();


        while(nota < 0 || nota >10){

            System.out.println("Nota invalida, digite entre  0 e 10");
            nota = leitor.nextInt();
        }
    }
}
