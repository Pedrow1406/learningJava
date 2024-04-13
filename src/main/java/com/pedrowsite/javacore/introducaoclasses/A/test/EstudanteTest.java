package main.java.com.pedrowsite.javacore.introducaoclasses.A.test;

import main.java.com.pedrowsite.javacore.introducaoclasses.A.dominio.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante novoEstudante1 = new Estudante();
        Estudante novoEstudante2 = new Estudante();
        novoEstudante2.nome = "Maria";
        novoEstudante2.idade = 14;
        novoEstudante2.sexo = 'F';
        String sexo2 = novoEstudante1.sexo == 'M' ? "Masculino" : "Feminino";
        System.out.println(novoEstudante1.nome + " tem " + novoEstudante1.idade + " anos " + "e é do sexo " + novoEstudante1.sexo);
        novoEstudante1.nome = "Pedrow";
        novoEstudante1.idade = 18;
        novoEstudante1.sexo = 'M';
        String sexo1 = novoEstudante1.sexo == 'M' ? "Masculino" : "Feminino";
        System.out.println(novoEstudante1.nome + " tem " + novoEstudante1.idade + " anos " + "e é do sexo " + sexo1);
        System.out.println(novoEstudante2.nome + " tem " + novoEstudante2.idade + " anos " + "e é do sexo " + sexo2);
    }
}
