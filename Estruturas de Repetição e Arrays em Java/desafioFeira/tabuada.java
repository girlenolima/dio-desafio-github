package br.com.projeto.desafioFeira;


import java.util.Scanner;

public class tabuada {

    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        System.out.println("Tabuada de  : ");
        int tabuada = scanner.nextInt();



        for(int i = 1; i <= 10; i++){

            System.out.println(tabuada + " X " + i + " = " + (tabuada * i));


        }



    }
}
