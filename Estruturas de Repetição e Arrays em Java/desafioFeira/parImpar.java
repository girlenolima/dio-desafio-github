package br.com.projeto.desafioFeira;

import java.util.Scanner;

public class parImpar {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int quantidadeNumeros;
        int numero;
        int quantidadePares = 0;
        int quantidadeImpares = 0;

        System.out.println("Quantidade de numeros : ");
        quantidadeNumeros = scanner.nextInt();

        int contador = 0;
        do {

            System.out.println("Numero : ");
            numero = scanner.nextInt();

            if (numero % 2 == 0) {
                quantidadePares++;
            } else {
                quantidadeImpares++;
            }

            contador++;

        } while (contador < quantidadeNumeros);


        System.out.println("Quantidade de pares : " + quantidadePares);
        System.out.println("Quantidade de impares : " + quantidadeImpares);
    }
}
