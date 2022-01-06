package br.com.projeto.listas.encadeada;

import br.com.projeto.listas.encadeada.ListasEncadeadas;

public class teste {

    public static void main(String[] args) {

        ListasEncadeadas<String> lista = new ListasEncadeadas<>();
        lista.add("1");
        lista.add("2");
        lista.add("3");
        lista.add("4");


        System.out.println(lista.toString());



    }
}
