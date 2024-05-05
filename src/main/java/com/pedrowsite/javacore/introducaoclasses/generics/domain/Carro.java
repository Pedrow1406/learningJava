package main.java.com.pedrowsite.javacore.introducaoclasses.generics.domain;

public class Carro {
    private final String nome;

    public Carro(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
