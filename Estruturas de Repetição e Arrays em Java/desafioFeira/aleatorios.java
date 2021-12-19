package br.com.projeto.desafioFeira;

import java.util.Random;

public class aleatorios {

    public static void main(String[] args) {


        Random random = new Random();

        int[] numerosAleatorios = new int[10];

        for(int i = 0; i < numerosAleatorios.length; i ++){

            int numero = random.nextInt(1000000);
            numerosAleatorios[i] = numero;
        }

        System.out.print("Numeros Aleatorios: ");
        for (int elemento:numerosAleatorios ) {
            System.out.print(elemento + "-");
        }

        System.out.print("\nNumeros Sucessores: ");
        for (int elemento:numerosAleatorios ) {
            System.out.print((elemento + 1) + "-");
        }

        System.out.print("\nNumeros Antecessor: ");
        for (int elemento:numerosAleatorios ) {
            System.out.print((elemento - 1) + "-");
        }



    }
}
