package main.java.com.pedrowsite.javacore.introducaoclasses.abstracao.dominio;

public enum LinguagensProgramacao {
    PYTHON("python"),
    JAVA("java"),
    JAVASCRIPT("javascript"),
    PHP("php"),
    KOTLIN("kotlin");

    private final String linguagem;

    LinguagensProgramacao(String linguagem){
        this.linguagem = linguagem;
    }

    public String getLinguagem() {
        return linguagem;
    }
}
