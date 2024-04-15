package main.java.com.pedrowsite.javacore.introducaoclasses.construtor.test;

import main.java.com.pedrowsite.javacore.introducaoclasses.construtor.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime1 = new Anime("Bleach", "Shounen", 366);
        Anime anime2 = new Anime("Solo Leveling",  "Isekai", 12, "Manhwa");
        anime1.setTipo("Anime");
        anime1.displayAll();
        System.out.println("================================");
        anime2.displayAll();
    }
}