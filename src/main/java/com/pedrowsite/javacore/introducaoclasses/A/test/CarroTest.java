package main.java.com.pedrowsite.javacore.introducaoclasses.A.test;

import main.java.com.pedrowsite.javacore.introducaoclasses.A.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro mustang = new Carro();
        mustang.nome = "Ford Mustang";
        mustang.modelo = "GT";
        mustang.ano = 2023;

        Carro teslaModel = new Carro();
        teslaModel.nome = "Tesla Model S";
        teslaModel.modelo = "Plaid";
        teslaModel.ano = 2022;

        System.out.println("O nome do carro é " + mustang.nome + " do modelo " + mustang.modelo + " e do ano de " + mustang.ano);
        System.out.println("O nome do carro é " + teslaModel.nome + " do modelo " + teslaModel.modelo + " e do ano de " + teslaModel.ano);
    }
}
