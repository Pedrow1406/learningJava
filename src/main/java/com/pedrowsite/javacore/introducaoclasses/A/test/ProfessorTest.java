package main.java.com.pedrowsite.javacore.introducaoclasses.A.test;

import main.java.com.pedrowsite.javacore.introducaoclasses.A.dominio.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor01 = new Professor();
        professor01.nome = "Luiz";
        professor01.idade = 41;
        professor01.materia = "História";
        professor01.sexo = 'M';
        String sexo = professor01.sexo == 'M' ? "Masculino" : "Feminino";
    }
}
