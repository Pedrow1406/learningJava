package main.java.com.pedrowsite.javacore.introducaoclasses.metodos.dominio;

public class Impressora {
    public void imprimir(Estudante estudante){
        System.out.println(estudante.getNome());
        System.out.println(estudante.getIdade());
        System.out.println(estudante.getSexo());
    }
}
