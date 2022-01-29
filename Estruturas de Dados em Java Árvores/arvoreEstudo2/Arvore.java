package br.com.projeto.arvoreEstudo2;

public class Arvore<T extends Comparable> {

    private Elemento<T> raiz;

    public Arvore() {
        this.raiz = null;
    }

    public void adicionar(T valor) {

        Elemento<T> novoElemento = new Elemento<T>(valor);

        //Primeiro verifica-se a raiz esta nula
        if (raiz == null) {
            //se a raiz estiver vazia  o novo elemento sera a raiz da arvore.
            this.raiz = novoElemento;

        } else {

            //o elemento atual recebe a raiz.
            Elemento<T> atual = this.raiz;

            //Repetiçao para caminhar entre todos os nos.
            while (true) {

                /*CompareTo devolve 3 possiveis resultado :
                -1 , o valor é menor.
                0  , o valor é igual.
                1  , o valor é maior.*/

                //Se o novo elemento for menor que valor atual ele vai para esquerda
                if (novoElemento.getValor().compareTo(atual.getValor()) == -1) {

                    //Verifica-se o no atual tem filhos a esquerda
                    if (atual.getEsquerda() != null) {
                        atual = atual.getEsquerda();

                    } else {
                        /*Se o atual nao tiver filhos a esquerda logo
                          nao existe mais caminhos a visitar. Entao
                          o novo elemento é adicionado como filho deste Nó.
                          */
                        atual.setEsquerda(novoElemento);
                        //Para o while pois o novo elemento ja foi adicionado
                        break;
                    }

                //Se o novo elemento for maior que o valor atual ele vai para direita
                } else {
                    //maior ou igual, se
                    if (atual.getDireita() != null) {
                        /*se tiver alguem na direita o codigo roda novamente do inicio
                        ate chegar aqui novamente ate nao encontrar ninguem na direita.
                        quando nao tiver ninguem na direita logo essa posiçao fica para o novo
                        elemento*/
                        atual = atual.getDireita();

                    } else {

                        atual.setDireita(novoElemento);
                        break;
                    }
                }
            }
        }
    }

    public Elemento<T> getRaiz() {
        return raiz;
    }


    //Usando recursividade
    public void emOrdem(Elemento<T> atual) {

        if (atual != null) {
            emOrdem(atual.getEsquerda());
            System.out.println(atual.getValor());
            emOrdem(atual.getDireita());
        }

    }

    public void preOrdem(Elemento<T> atual) {

        if (atual != null) {
            System.out.println(atual.getValor());
            preOrdem(atual.getEsquerda());
            preOrdem(atual.getDireita());
        }

    }

    public void posOrdem(Elemento<T> atual) {

        if (atual != null) {
            posOrdem(atual.getEsquerda());
            posOrdem(atual.getDireita());
            System.out.println(atual.getValor());
        }

    }



    


}
