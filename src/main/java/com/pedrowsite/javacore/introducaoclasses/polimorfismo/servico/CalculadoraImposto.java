package main.java.com.pedrowsite.javacore.introducaoclasses.polimorfismo.servico;

import main.java.com.pedrowsite.javacore.introducaoclasses.polimorfismo.dominio.Produto;
import main.java.com.pedrowsite.javacore.introducaoclasses.polimorfismo.dominio.Tomate;


public class CalculadoraImposto {

    private static double valorImposto(double valor, double imposto){
        return valor + imposto;
    }
    public static void relatorioImposto(Produto produto){
        double imposto = produto.calcularImposto();
        double valorImposto = valorImposto(produto.getValor(), imposto);
        System.out.println("Relatório do Calculo do Imposto de " + produto.getClass().getSimpleName());
        System.out.println("Nome: " + produto.getNome());

        if (produto instanceof Tomate tomate){
            System.out.println("Data de Validade: " + tomate.getDATA_VALIDADE());
        }
        System.out.println("Valor S/Imposto: R$" + produto.getValor());
        System.out.println("Valor C/Imposto: R$" + valorImposto);
        System.out.println("--------------------------------------");
    }
}