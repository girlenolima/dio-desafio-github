package br.com.projeto.arvores;

public class main {

    public static void main(String[] args) {

        ArvoreBinaria<Obj> minhArvore = new ArvoreBinaria<>();
        minhArvore.inserir(new Obj(13));
        minhArvore.inserir(new Obj(10));
        minhArvore.inserir(new Obj(25));
        minhArvore.inserir(new Obj(2));
        minhArvore.inserir(new Obj(12));
        minhArvore.inserir(new Obj(20));
        minhArvore.inserir(new Obj(31));
        minhArvore.inserir(new Obj(29));


        minhArvore.exibirEmOrdem();
        minhArvore.exibirPreOrdem();
        minhArvore.exibirPosOrdem();









    }
}
