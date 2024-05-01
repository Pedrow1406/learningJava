package main.java.com.pedrowsite.colecoes.test;

import main.java.com.pedrowsite.colecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingListTest {
    static class OrderByName implements Comparator<Manga> {
        @Override
        public int compare(Manga manga1, Manga manga2) {
            return manga1.getNome().compareTo(manga2.getNome());
        }
    }

    public static void main(String[] args) {
        ArrayList<Manga> mangas = getMangas();

        System.out.println("Ordem de Inserção");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        System.out.println();


        System.out.println("Ordenado pelo ID");
        Collections.sort(mangas);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        System.out.println();

        System.out.println("Ordem pelo Nome");
        OrderByName ordenedByName = new OrderByName();
        Collections.sort(mangas, ordenedByName);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        System.out.println();


        System.out.println("Ordem de preço");
        Collections.sort(mangas,  (Manga m1, Manga m2) -> m1.getPreco().compareTo(m2.getPreco()));
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }

    private static ArrayList<Manga> getMangas() {
        Manga manga1 = new Manga(3, "Attack on Titan", 95.4);
        Manga manga2 = new Manga(5, "Bleach", 78.5);
        Manga manga3 = new Manga(2, "Uzumaki", 120.5);
        Manga manga4 = new Manga(4, "Code Guass", 71.2);
        Manga manga5 = new Manga(1, "One Punch Man", 89.5);

        ArrayList<Manga> mangas = new ArrayList<>();
        mangas.add(manga1);
        mangas.add(manga2);
        mangas.add(manga3);
        mangas.add(manga4);
        mangas.add(manga5);
        return mangas;
    }
}
