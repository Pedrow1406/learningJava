package main.java.com.pedrowsite.javacore.introducaoclasses.abstracao.dominio;

public abstract class Pessoa {
    protected String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public abstract void displayInfo();

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
