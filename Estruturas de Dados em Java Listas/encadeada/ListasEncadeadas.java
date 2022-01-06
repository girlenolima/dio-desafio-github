package br.com.projeto.listas.encadeada;

public class ListasEncadeadas<T> {

    No<T> referenciEntrada;

    public ListasEncadeadas() {
        this.referenciEntrada = null;
    }

    public boolean isEmpty() {

        if (referenciEntrada == null) {
            return true;
        }else{

            return false;
        }

    }

    public int size() {

        int tamanhoLista = 0;
        No<T> referenciaAux = referenciEntrada;

        while (true) {
            if (referenciaAux != null) {
                tamanhoLista++;
                if (referenciaAux.getProximoNo() != null) {
                    referenciaAux = referenciaAux.getProximoNo();

                } else {
                    break;
                }

            } else {
                break;
            }
            break;
        }

        return tamanhoLista;
    }

    public void add(T conteudo) {

        No<T> novoNo = new No<>(conteudo);
        if (this.isEmpty()) {
            referenciEntrada = novoNo;
            return;
        }

        No<T> noAuxiliar = referenciEntrada;
        for (int i = 0; i < this.size() - 1; i++) {
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        noAuxiliar.setProximoNo(novoNo);


    }

    private void validaIndice(int index) {

        if (index >= size()) {
            throw new IndexOutOfBoundsException("Indice informado é maior que a lista");
        }


    }

    private No<T> getNo(int index) {

        validaIndice(index);

        No<T> noAuxiliar = referenciEntrada;
        No<T> noRetorno = null;

        for (int i = 0; i <= index; i++) {
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }

    public T get(int index) {

        return getNo(index).getConteudo();

    }

    public T remove(int index) {

        No<T> noPivo = this.getNo(index);
        if (index == 0) {
            referenciEntrada = noPivo.getProximoNo();
            return noPivo.getConteudo();

        }

        No<T> noAnterior = getNo(index - 1);
        noAnterior.setProximoNo(noPivo.getProximoNo());
        return noPivo.getConteudo();

    }

    @Override
    public String toString() {

        String strRetorno = "";
        No<T> noAuxiliar = referenciEntrada;

        for (int i = 0; i < this.size(); i++) {

            strRetorno += "No{ conteudo = " + noAuxiliar.getConteudo() + "} -->";
            noAuxiliar = noAuxiliar.getProximoNo();

        }

        strRetorno += "null";

        return strRetorno;
    }
}
