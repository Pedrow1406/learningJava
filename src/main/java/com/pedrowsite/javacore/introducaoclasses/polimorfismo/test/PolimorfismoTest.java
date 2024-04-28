package main.java.com.pedrowsite.javacore.introducaoclasses.polimorfismo.test;

import main.java.com.pedrowsite.javacore.introducaoclasses.polimorfismo.dominio.Computador;
import main.java.com.pedrowsite.javacore.introducaoclasses.polimorfismo.dominio.Produto;
import main.java.com.pedrowsite.javacore.introducaoclasses.polimorfismo.dominio.Tomate;
import main.java.com.pedrowsite.javacore.introducaoclasses.polimorfismo.servico.CalculadoraImposto;

public class PolimorfismoTest {
    public static void main(String[] args) {
        Produto produto1 = new Computador("Gigatron i9", 8300.50);
        Produto produto2 = new Tomate("Tomate Feira", 2);
        Tomate tomato = new Tomate("Tomate Ruim", 2);
        Computador computerzin = new Computador("Computador Gamer", 12930.30);
        System.out.println(produto1.getNome());
        System.out.println(produto1.getValor());
        System.out.println(produto1.calcularImposto());
        //  Não suporta o método ligar() da classe Computador porque na classe Produto não
        //  tem esse método então como o tipo da variavel produto1 é a classe Produto os métodos e atributos que serão executados na classe Computador
        //  são apenas os métodos e atributos
        //  que tem na classe Produto e na Classe Computador
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
        System.out.println("=================== // =====================");
        CalculadoraImposto.relatorioImposto(produto1);
        // Passando uma variavel do tipo Computador mesmo requirindo uma variavel do tipo Produto por conta que Computador herda de Produto (Polimorfismo)
        CalculadoraImposto.relatorioImposto(computerzin);
        CalculadoraImposto.relatorioImposto(tomato);
    }
}