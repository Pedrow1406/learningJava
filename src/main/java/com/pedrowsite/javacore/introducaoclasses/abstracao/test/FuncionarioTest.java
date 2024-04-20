package main.java.com.pedrowsite.javacore.introducaoclasses.abstracao.test;

import main.java.com.pedrowsite.javacore.introducaoclasses.abstracao.dominio.*;


public class FuncionarioTest {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Paulao", 12300.50);
        Desenvolvedor dev = new Desenvolvedor("Pedrow", 17300, LinguagensProgramacao.JAVA);
        LinguagensProgramacao python = LinguagensProgramacao.PYTHON;

        System.out.println(dev);
        dev.displayInfo();
        System.out.println("================ // ================");
        System.out.println(gerente);
        gerente.displayInfo();
    }
}
