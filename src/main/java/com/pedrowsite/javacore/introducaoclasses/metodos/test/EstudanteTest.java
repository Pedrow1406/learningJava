package main.java.com.pedrowsite.javacore.introducaoclasses.metodos.test;

import main.java.com.pedrowsite.javacore.introducaoclasses.metodos.dominio.Estudante;
import main.java.com.pedrowsite.javacore.introducaoclasses.metodos.dominio.Impressora;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante02 = new Estudante();
        Impressora impressora = new Impressora();
        estudante.setNome("Pedrow");
        estudante.setIdade(18);
        estudante.setSexo('M');
        estudante.displayData();
        impressora.imprimir(estudante);

        System.out.println("========================================");
        estudante02.setNome("Maria");
        estudante02.setIdade(15);
        estudante02.setSexo('F');

        impressora.imprimir(estudante02);
        estudante02.displayData();

        System.out.println("========================================");

        System.out.println(estudante.getNome());
        estudante.changeName("Joana");
        System.out.println(estudante.getNome());
    }
}
