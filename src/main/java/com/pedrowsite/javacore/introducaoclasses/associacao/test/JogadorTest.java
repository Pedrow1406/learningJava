package main.java.com.pedrowsite.javacore.introducaoclasses.associacao.test;

import main.java.com.pedrowsite.javacore.introducaoclasses.associacao.dominio.Jogador;
import main.java.com.pedrowsite.javacore.introducaoclasses.associacao.dominio.Time;

public class JogadorTest {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Vinicius Jr");
        Jogador jogadorbom = new Jogador("Neymar");
        Jogador jogadornub = new Jogador("Douglas");
        Jogador jogador3 = new Jogador("Felipe");
        Time time01 = new Time("Real Madrid");
        Time time02 = new Time("Palmeiras");
        time01.setJogadores(jogador1,jogador3);
        time02.setJogadores(jogadorbom, jogadornub);
        time01.displayAllPlayers();
        time02.displayAllPlayers();
        System.out.println("=================================");
        System.out.println(jogadorbom.getTime().getNome());
    }
}
