package main.java.com.pedrowsite.javacore.introducaoclasses.sobrecargametodos.test;

import main.java.com.pedrowsite.javacore.introducaoclasses.sobrecargametodos.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime1 = new Anime();
        Anime anime2 = new Anime();
        anime2.init("Bleach", "Anime", 366);
        anime2.setGenero("Shounen");
        anime1.init("Solo Leveling", "Manhwa", 12, "Isekai");
        anime1.displayAll();
        System.out.println("================================");
        anime2.displayAll();
    }
}
