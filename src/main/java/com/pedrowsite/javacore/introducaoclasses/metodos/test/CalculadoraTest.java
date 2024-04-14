package main.java.com.pedrowsite.javacore.introducaoclasses.metodos.test;

import main.java.com.pedrowsite.javacore.introducaoclasses.metodos.dominio.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somar(13,7,23,84,12);
        calc.subtrair(1000,30, 10,660);
        calc.multiplicar(12, 5,10);
        double result = calc.dividir(13, 0);
        System.out.println(result);
    }
}
