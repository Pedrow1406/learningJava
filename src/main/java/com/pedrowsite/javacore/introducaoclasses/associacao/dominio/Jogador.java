package main.java.com.pedrowsite.javacore.introducaoclasses.associacao.dominio;

public class Jogador {
    private String nome;
    private Time time;


    public Jogador(String nome) {
        this.nome = nome;
    }

    public void displayAll() {
        System.out.println("Nome do Jogador: " + nome);
        if (time != null) {
            System.out.println("Nome do Time: " + time.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    protected void setTime(Time time) {
        this.time = time;
    }
}
