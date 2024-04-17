package main.java.com.pedrowsite.javacore.introducaoclasses.associacao.dominio;

public class Time {
    private String nome;
    private Jogador[] jogadores;

    public Time(String nome) {
        this.nome = nome;
    }

    public void displayAllPlayers() {
        int i = 1;
        System.out.println("====================================");
        System.out.println("Time: " + nome);
        for (Jogador jogador : jogadores) {
            System.out.println("Jogador " + i + ": " + jogador.getNome());
            i++;
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador... jogadores) {
        this.jogadores = jogadores;
        for (Jogador jogador : jogadores) {
            jogador.setTime(this);
        }

    }
}
