package br.com.projeto.ImplementacoesJava;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class main {


    public static void main(String[] args) {


       /* List<Carro> list = new ArrayList<>();

        list.add(new Carro("Ford"));
        list.add(new Carro("GM"));
        list.add(new Carro("WG"));
        list.add(new Carro("CHEVROLET"));
        list.add(new Carro("LAMBORGUINE"));
        list.add(new Carro("FIAT"));
        list.add(new Carro("HYUNDAI"));
        list.add(new Carro("HONDA"));

        System.out.println(list.contains(new Carro("Ford")));
        System.out.println( new Carro("Ford").hashCode());

        System.out.println("------------------------------------");
        Carro carro = new Carro("KIA");
        System.out.println(carro.hashCode());

        Carro carro2 = new Carro("KIA2");
        System.out.println(carro2.hashCode());

        System.out.println(carro.equals(carro2));

        System.out.println("------------------------------------");*/


        //O jova contem um estrtu
       /* Stack<Carro> carroStack = new Stack<>();
        carroStack.push(new Carro("Ford"));
        carroStack.push(new Carro("GM"));
        carroStack.push(new Carro("WG"));
        carroStack.push(new Carro("CHEVROLET"));
        carroStack.push(new Carro("LAMBORGUINE"));
        carroStack.push(new Carro("FIAT"));
        carroStack.push(new Carro("HYUNDAI"));
        carroStack.push(new Carro("HONDA"));

        System.out.println(carroStack);

        System.out.println(carroStack.pop());
        System.out.println(carroStack.peek());
        System.out.println(carroStack.empty());*/

     /*   Queue<Carro> carros = new LinkedList<>();
        carros.add(new Carro("Ford"));
        carros.add(new Carro("GM"));
        carros.add(new Carro("WG"));
        carros.add(new Carro("CHEVROLET"));
        carros.add(new Carro("LAMBORGUINE"));
        carros.add(new Carro("FIAT"));
        carros.add(new Carro("HYUNDAI"));
        carros.add(new Carro("HONDA"));

        System.out.println(carros.add(new Carro("Peugeote")));
        System.out.println(carros.offer(new Carro("Reunolt")));
        System.out.println(carros.peek());
        System.out.println(carros.remove());
        System.out.println(carros.poll());*/

       /* List<Carro> list = new ArrayList<>();

        list.add(new Carro("Ford"));
        list.add(new Carro("GM"));
        list.add(new Carro("WG"));
        list.add(new Carro("CHEVROLET"));
        list.add(new Carro("LAMBORGUINE"));
        list.add(new Carro("FIAT"));
        list.add(new Carro("HYUNDAI"));
        list.add(new Carro("HONDA"));

        System.out.println();*/


        /*Set<Carro> conjunto = new HashSet<>();
        conjunto.add(new Carro("Ford"));
        conjunto.add(new Carro("GM"));
        conjunto.add(new Carro("WG"));
        conjunto.add(new Carro("CHEVROLET"));
        conjunto.add(new Carro("LAMBORGUINE"));
        conjunto.add(new Carro("FIAT"));
        conjunto.add(new Carro("HYUNDAI"));
        conjunto.add(new Carro("HONDA"));

        System.out.println(conjunto);

        Set<Carro> treeSetCarro = new TreeSet<>();
        treeSetCarro.add(new Carro("Ford"));
        treeSetCarro.add(new Carro("GM"));
        treeSetCarro.add(new Carro("WG"));
        treeSetCarro.add(new Carro("CHEVROLET"));
        treeSetCarro.add(new Carro("LAMBORGUINE"));
        treeSetCarro.add(new Carro("FIAT"));
        treeSetCarro.add(new Carro("HYUNDAI"));
        treeSetCarro.add(new Carro("HONDA"));

        System.out.println(treeSetCarro);*/

        Map<String, String> aluno = new HashMap<>();
        aluno.put("Nome", "Leno");
        aluno.put("Idade", "25");
        aluno.put("Media", "8.5");
        aluno.put("Turma", "A");

        Map<String, String> aluno2 = new HashMap<>();
        aluno2.put("Nome", "x");
        aluno2.put("Idade", "25");
        aluno2.put("Media", "8.5");
        aluno2.put("Turma", "A");

        Map<String, String> aluno3 = new HashMap<>();
        aluno3.put("Nome", "b");
        aluno3.put("Idade", "25");
        aluno3.put("Media", "8.5");
        aluno3.put("Turma", "A");

        System.out.println(aluno);

        System.out.println(aluno.keySet());
        System.out.println(aluno.values());

        List<Map<String, String> > listaALunos = new ArrayList<>();
        listaALunos.add(aluno);
        listaALunos.add(aluno2);
        listaALunos.add(aluno3);

        System.out.println(listaALunos);

        System.out.println(aluno.containsKey("Nome"));


    }
}
