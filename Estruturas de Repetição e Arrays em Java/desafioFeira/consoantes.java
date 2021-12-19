package br.com.projeto.desafioFeira;

import java.util.Scanner;

public class consoantes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;


        int contador = 0;
        do {
            System.out.println("Digite uma letra");
            String letras = scanner.next();

            if (!(letras.equalsIgnoreCase("a") || letras.equalsIgnoreCase("e") || letras.equalsIgnoreCase("i") || letras.equalsIgnoreCase("o") || letras.equalsIgnoreCase("u"))) {
                consoantes[contador] = letras;
                quantidadeConsoantes++;
            }

            contador++;

        } while (contador < consoantes.length);

        System.out.println("Quantidade de consoantes : " + quantidadeConsoantes);


        //para cada elemento dentro do array faça
        for (String conso : consoantes) {

            if (conso != null) {
                System.out.print(conso + " ");
            }
        }
    }
}
