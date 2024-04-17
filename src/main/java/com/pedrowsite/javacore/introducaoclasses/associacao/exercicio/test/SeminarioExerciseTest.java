package main.java.com.pedrowsite.javacore.introducaoclasses.associacao.exercicio.test;

import main.java.com.pedrowsite.javacore.introducaoclasses.associacao.exercicio.domain.Estudante;
import main.java.com.pedrowsite.javacore.introducaoclasses.associacao.exercicio.domain.Local;
import main.java.com.pedrowsite.javacore.introducaoclasses.associacao.exercicio.domain.Professor;
import main.java.com.pedrowsite.javacore.introducaoclasses.associacao.exercicio.domain.Seminario;

public class SeminarioExerciseTest {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante("Pedrow" , 18);
        Estudante estudante02 = new Estudante("Maria" , 15);
        Estudante estudante03 = new Estudante("Felipe" , 15);
        Estudante estudante04 = new Estudante("Douglas" , 13);
        Estudante estudante05 = new Estudante("Joana" , 17);
        Estudante estudante06 = new Estudante("Pablo" , 15);
        Professor professor01 = new Professor("Luiz", 38, "História");
        Professor professor02 = new Professor("Antônia" , 52, "Matemática");
        Local eeep = new Local("EEEP");
        Local ifce = new Local("IFCE", "Próximo a Sorvetaria Pardal");
        Seminario warsGang = new Seminario("Wars Gang", professor02);
        Seminario dangersPeoples = new Seminario("Dangers Peoples" , professor02);
        Seminario nerdsTeam = new Seminario("Nerds Team", professor02);
        dangersPeoples.setEstudantes(estudante01, estudante02);
        warsGang.setEstudantes(estudante02);
        dangersPeoples.setLocal(ifce);
        warsGang.setLocal(eeep);
        nerdsTeam.setLocal(ifce);

        warsGang.displayInfo();
        dangersPeoples.displayInfo();
        nerdsTeam.setEstudantes(estudante03, estudante04, estudante01, estudante02, estudante05, estudante06);
        nerdsTeam.displayInfo();
        System.out.println("***************************** // *****************************");

        professor01.displaySeminarios();
        professor02.displaySeminarios();
        eeep.displaySeminarios();
        ifce.displaySeminarios();

    }
}
