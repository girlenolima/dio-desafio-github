package br.com.projeto.arvores;

public abstract class ObjtArvore<T> implements Comparable<T>{

    public abstract boolean equals(Object o);
    public abstract int hashCode();
    public abstract int compareTo(T outro);
    public abstract String toString();


}
