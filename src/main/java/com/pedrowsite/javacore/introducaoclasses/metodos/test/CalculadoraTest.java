package main.java.com.pedrowsite.javacore.introducaoclasses.metodos.test;

import main.java.com.pedrowsite.javacore.introducaoclasses.metodos.dominio.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora.somar(13,7,23,84,12);
        Calculadora.subtrair(1000,30, 10,660);
        Calculadora.multiplicar(12, 5,10);
        double result = Calculadora.dividir(13, 0);
        System.out.println(result);
    }
}
