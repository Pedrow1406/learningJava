package main.java.com.pedrowsite.javacore.introducaoclasses.generics.service;

import java.util.List;

public class RentService<T>{
    private final List<T> objetosDisponiveis;

    public RentService(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public List<T> AvailableObject(){
        System.out.println("Buscando Objetos Disponiveis");
        return objetosDisponiveis;
    }
    public T RentObject(int index){
        T objetoAlugado = objetosDisponiveis.remove(index);
        System.out.println("Alugando o objeto: " + objetoAlugado);
        return objetoAlugado;
    }
}
