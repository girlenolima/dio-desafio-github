package br.com.projeto.listas.encadeadeDupla;

public class ListaDuplaEncadeada<T> {


    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    private int tamanhoLista;


    public ListaDuplaEncadeada(int tamanhoLista) {
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }

    public int size() {
        return this.tamanhoLista;
    }

    private NoDuplo<T> getNo(int index) {

        NoDuplo<T> noAuxiliar = primeiroNo;
        for (int i = 0; (i < index) && (noAuxiliar != null); i++) {
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;

    }

    public T get(int index) {
        return this.getNo(index).getConteudo();
    }

    //adicionar ao final da lista
    public void add(T elemento) {

        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        //adicionando ao final, por isso recebe null
        novoNo.setNoProximo(null);

        //Aponta para o antigo no da lista
        novoNo.setNoPrevio(ultimoNo);

        if (primeiroNo == null) {
            primeiroNo = novoNo;
        }

        if (ultimoNo != null) {
            ultimoNo.setNoProximo(novoNo);
        }

        ultimoNo = novoNo;
        tamanhoLista++;

    }

    public void add(int index, T elemento) {

        NoDuplo<T> noAuxiliar = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoProximo(noAuxiliar);

        if (novoNo.getNoProximo() != null) {
            novoNo.setNoPrevio(noAuxiliar.getNoPrevio());
            novoNo.getNoProximo().setNoPrevio(novoNo);

        } else {

            novoNo.setNoPrevio(ultimoNo);
            ultimoNo = novoNo;
        }

        if (index == 0) {
            primeiroNo = novoNo;

        } else {
            novoNo.getNoPrevio().setNoPrevio(novoNo);
            tamanhoLista++;
        }

    }


    public void remove(int index) {

        if (index == 0) {
            primeiroNo = primeiroNo.getNoProximo();
            if (primeiroNo != null) {
                primeiroNo.setNoPrevio(null);
            }

        } else {

            NoDuplo<T> noAuxiliar = getNo(index);
            noAuxiliar.getNoPrevio().setNoProximo(noAuxiliar.getNoProximo());

            if (noAuxiliar != ultimoNo) {
                noAuxiliar.getNoProximo().setNoPrevio(noAuxiliar.getNoPrevio());
            } else {
                ultimoNo = noAuxiliar;
            }

        }

        this.tamanhoLista--;

    }

    @Override
    public String toString() {

        String strRetorno = "";
        NoDuplo<T> noAuxiliar = primeiroNo;

        for (int i = 0; i < size(); i++) {
            strRetorno+="[No{conteudo =" +noAuxiliar.getConteudo() + "}] -->";
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}



