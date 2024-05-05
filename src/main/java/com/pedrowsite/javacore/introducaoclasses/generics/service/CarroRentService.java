package main.java.com.pedrowsite.javacore.introducaoclasses.generics.service;

import main.java.com.pedrowsite.javacore.introducaoclasses.generics.domain.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentService {
    private static final List<Carro> carrosDisponiveis = new ArrayList<>(List.of(
            new Carro("Hyundai HB20"), new Carro("Chevrolet Onix")
    ));

    public static List<Carro> AvailableCar(){
        System.out.println("Buscando Carros Disponiveis");
        return carrosDisponiveis;
    }
    public static Carro RentCar(int index){
        Carro carroAlugado = carrosDisponiveis.remove(index);
        System.out.println("Alugando o Carro: " + carroAlugado);
        return carroAlugado;
    }
}
