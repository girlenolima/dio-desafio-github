package br.com.projeto.desafioFeira;

public class prova {

    public static void main(String[] args) {

        int num = 5, count = 1;
        while(count <= 3) {
            ++count;
            num += count;
        }
        System.out.println(num);
    }
}
