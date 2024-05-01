package main.java.com.pedrowsite.colecoes.test;

import main.java.com.pedrowsite.colecoes.domain.Manga;

import java.util.ArrayList;

public class ListTest {
    public static void main(String[] args) {
        ArrayList<String> animes = new ArrayList<>();
        ArrayList<String> animesBons = new ArrayList<>();
        ArrayList<String> animesRuins = new ArrayList<>();

        animes.add("Boku no Hero");
        animes.add("Naruto");
        animes.add("Bleach");
        animes.add("Boruto");
        animes.add("DBZ");
        animes.add("Uzumaki");

        for (String anime : animes) {
            if (!anime.equals("Boruto") && !anime.equals("Boku no Hero") && !anime.equals("Naruto")) {
                animesBons.add(anime);
            } else {
                animesRuins.add(anime);
            }
        }

        boolean entrou = false;
        for (String animeBom : animesBons) {
            if (!entrou) {
                System.out.println("---------- Animes Bons ----------");
                entrou = true;
            }
            System.out.println(animeBom);
        }
        entrou = false;
        for (String animeRuim : animesRuins) {
            if (!entrou) {
                System.out.println("---------- Animes Ruins ----------");
                entrou = true;
            }
            System.out.println(animeRuim);
        }
        System.out.println("Array de Animes apenas com Animes Bons");
        for (int i = 0; i < animes.size(); i++) {
            String animeAtual = animes.get(i);
            if (animesRuins.contains(animes.get(i))) {
                animes.remove(animes.get(i));
                i--;
                // Quando você remove um item de uma lista em Java, os índices dos itens subsequentes são reorganizados ou seja index -1. Isso significa que o que era o segundo item agora se torna o primeiro (índice 0), o terceiro se torna o segundo (índice 1) e assim por diante. Para evitar erros ao acessar itens após a remoção, é importante decrementar o índice do loop (i--). Isso mantém a sincronia com a reorganização da lista.
            }
        }
        for (String anime : animes) {
            System.out.println(" -- " + anime);
        }


    }
}
