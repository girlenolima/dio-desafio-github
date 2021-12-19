package br.com.projeto.desafioFeira;

import java.util.Random;

public class multDimensional {


    public static void main(String[] args) {

        Random random = new Random();

        int[][] planilha = new int[4][4];

        for (int linha = 0; linha < planilha.length; linha++) {
            for (int coluna = 0; coluna < planilha[linha].length; coluna++) {

                planilha[linha][coluna] = random.nextInt(10000000);

            }
        }

        for (int[] celula:planilha) {
            for (int conteudo:celula) {
                System.out.print(conteudo + " ");
            }

            System.out.println();

        }


    }

}
