package main.java.com.pedrowsite.javacore.introducaoclasses.generics.test;

import main.java.com.pedrowsite.javacore.introducaoclasses.generics.domain.Barco;
import main.java.com.pedrowsite.javacore.introducaoclasses.generics.domain.Carro;
import main.java.com.pedrowsite.javacore.introducaoclasses.generics.service.CarroRentService;
import main.java.com.pedrowsite.javacore.introducaoclasses.generics.service.RentService;

import java.util.ArrayList;
import java.util.List;

public class ClassGenericsTest {
    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<>(List.of(
                new Carro("Volkswagen Gol"),
                new Carro("Hyundai HB20"),
                new Carro("Chevrolet Onix")
        ));
        List<Barco> barcos = new ArrayList<>(List.of(
                new Barco("Lancha"),
                new Barco("Navio")
        ));
        
        RentService<Barco> barcosAlugaveis = new RentService<>(barcos);
        List<Barco> barcosDisponiveis = barcosAlugaveis.AvailableObject();
        System.out.println(barcosDisponiveis);
        barcosAlugaveis.RentObject(0);
        System.out.println(barcosDisponiveis);
        barcosAlugaveis.RentObject(0);
        System.out.println(barcosDisponiveis);

        System.out.println("============================= // =============================");

        RentService<Carro> carrosAlugaveis = new RentService<>(carros);
        List<Carro> carrosDisponiveis = carrosAlugaveis.AvailableObject();
        System.out.println(carrosDisponiveis);
        carrosAlugaveis.RentObject(1);
        System.out.println(carrosDisponiveis);
        carrosAlugaveis.RentObject(0);
        System.out.println(carrosDisponiveis);
    }
}
