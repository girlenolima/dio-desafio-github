package br.com.projeto.desafioFeira;


import java.util.Scanner;

public class fatorial {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Fatorial : ");
        int fatorial = scanner.nextInt();


        int multiplicacao = 1;
        for(int i = fatorial;i >= 1; i--){

            multiplicacao = multiplicacao * i;

            System.out.println("5x");

        }



    }

}
