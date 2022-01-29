package br.com.projeto.arvoreEstudo2;

public class main {

    public static void main(String[] args) {

        Arvore<Integer> arvore = new Arvore<Integer>();

        arvore.adicionar(10);
        arvore.adicionar(50);
        arvore.adicionar(12);
        arvore.adicionar(6);
        arvore.adicionar(15);
        arvore.adicionar(2);
        arvore.adicionar(1);
        arvore.adicionar(36);

        System.out.println("EM ORDEM");
        arvore.emOrdem(arvore.getRaiz());

        System.out.println("EM PRE-ORDEM");
        arvore.preOrdem(arvore.getRaiz());

        System.out.println("EM POS-ORDEM");
        arvore.posOrdem(arvore.getRaiz());






    }
}
