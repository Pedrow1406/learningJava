package main.java.com.pedrowsite.javacore.introducaoclasses.generics.domain;

public class Doberman extends Cachorro{
    @Override
    public void som() {
        System.out.print("Doberman Latindo: ");
        super.som();
    }
}