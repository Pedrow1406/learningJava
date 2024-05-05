package main.java.com.pedrowsite.javacore.introducaoclasses.generics.domain;

import java.util.Objects;

public class Barco {
    private final String nome;

    public Barco(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Barco{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
