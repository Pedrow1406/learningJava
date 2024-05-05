package main.java.com.pedrowsite.javacore.introducaoclasses.generics.test;

import main.java.com.pedrowsite.javacore.introducaoclasses.generics.domain.Animal;
import main.java.com.pedrowsite.javacore.introducaoclasses.generics.domain.Cachorro;
import main.java.com.pedrowsite.javacore.introducaoclasses.generics.domain.Doberman;
import main.java.com.pedrowsite.javacore.introducaoclasses.generics.domain.Gato;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildcardTest {
    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>(Arrays.asList(new Cachorro(), new Gato()));
        List<Cachorro> dogs = new ArrayList<>(Arrays.asList(new Cachorro()));
        List<Gato> cats = new ArrayList<>(Arrays.asList(new Gato(), new Gato()));
        List<Object> objetos = new ArrayList<>(Arrays.asList("Pedrow", dogs, new Gato()));

        addElementSuper(dogs);
        System.out.println("======================= // =======================");
        addElementSuper(animais);
        System.out.println("======================= // =======================");
        addElementSuper(objetos);
        System.out.println("======================= // =======================");
        addElementExtends(cats);
        System.out.println("======================= // =======================");
        addElementExtends(dogs);
        System.out.println("======================= // =======================");
        // addElementExtends(objetos); NÃO pode passar como parâmetro objetos que tenha um generic Object por conta que tem q passar apenas subclasses de Animal

    }

    private static void addElementSuper(List<? super Cachorro> animals) {
        System.out.println("SUPER");
        animals.add(new Doberman()); // So pode adicionar objetos do tipo Cachorro ou subtipos de Cachorro por conta que se voce passar algo acima vai da erro de compilação
        short i = 1;
        for (Object animal : animals) {
            System.out.println("-" + i + " " + animal);
            i++;
        }
    }
    private static void addElementExtends(List<? extends Animal> animals) { // Não pode adicionar nada na lista animals se não da erro da compilação
        System.out.println("EXTENDS");
        short i = 1;
        for (Object animal : animals) {
            System.out.println("-" + i + " " + animal);
            i++;
        }
    }
}
