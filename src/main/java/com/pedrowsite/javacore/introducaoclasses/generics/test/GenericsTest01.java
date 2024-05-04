package main.java.com.pedrowsite.javacore.introducaoclasses.generics.test;

import main.java.com.pedrowsite.javacore.introducaoclasses.generics.domain.Animal;
import main.java.com.pedrowsite.javacore.introducaoclasses.generics.domain.Cachorro;
import main.java.com.pedrowsite.javacore.introducaoclasses.generics.domain.Gato;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        List allObjects = new ArrayList(Arrays.asList("          Pedrow Melo    ", new Gato(), new Cachorro(), 19)); //Aceita tod tipo de objeto
        for (Object o : allObjects){
            if (o instanceof String oString){
                System.out.println("String.toUpperCase().strip(): " + oString.toUpperCase().strip());
                System.out.println("oString.toLowerCase().trim(): "+ oString.toLowerCase().trim());
            } else if (o instanceof Cachorro dog) {
                System.out.print("Dogzão Latindo: ");
                dog.som();
            }
        }
        System.out.println("===================== // =====================");
        List<Cachorro> dogs = new ArrayList<>(Arrays.asList(new Cachorro(), new Cachorro(), new Cachorro())); // So aceita objetos do tipo cachorro
        for (Cachorro dog : dogs) {
            dog.som();
        }
        System.out.println("===================== // =====================");
        List<Gato> cats = new ArrayList<>(Arrays.asList(new Gato(), new Gato(), new Gato())); // So aceita objetos do tipo gato
        for (Gato cat : cats) {
            cat.som();
        }
    }
}
