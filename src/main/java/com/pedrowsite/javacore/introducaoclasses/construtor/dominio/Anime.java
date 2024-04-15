package main.java.com.pedrowsite.javacore.introducaoclasses.construtor.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private String genero;
    private int episodios;

    public Anime(String nome, String genero, int episodios) {
        this.nome = nome;
        this.genero = genero;
        this.episodios = episodios;
    }

    public Anime(String nome, String genero, int episodios, String tipo) {
        this(nome, genero, episodios);
        this.tipo = tipo;
    }

    public void displayAll() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Genero: " + this.genero);
        System.out.println("Total de Episódios: " + this.episodios);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
}

