package br.com.projeto.desafioFeira;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class media {


    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int nota;
        int contador = 0;
        int maior = 0;
        int soma = 0;

        do {

            System.out.println("Numero : ");
            nota = leitor.nextInt();

            if(nota > maior){
                maior = nota;
            }


            soma += nota;
            contador ++;

        } while (contador < 5 );



        System.out.println("Numero maior: " + maior);
        System.out.println("Media é : "+ (soma/5));
    }

}
