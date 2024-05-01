package main.java.com.pedrowsite.colecoes.test;

import main.java.com.pedrowsite.colecoes.domain.Manga;

import java.util.ArrayList;


public class HashCodeaAndEqualsTest {
    public static void main(String[] args) {
        Manga manga2 = new Manga(5, "Bleach", 78.5);
        Manga manga6 = new Manga(5, "Bleach", 28349.5);
        System.out.println(manga2.hashCode()); // hashCode de Manga é gerado apartir do atriibuto id e nome é por isso que os 2 tem o mesmo hash mesmo com preços diferentes
        System.out.println(manga6.hashCode());
        System.out.println(manga2.equals(manga6)); // equal do Manga compara o atributo id e o atributo nome do objeto para verificar se o objeto passado e a instancia são iguais

    }
}
