package main.java.com.pedrowsite.introducao;

public class AulaArraysSimples {
    public static void main(String[] args) {

        int[] idades = new int[3];
        idades[0] = 13;
        idades[1] = 19;
        idades[2] = 32;

        String[] nomes =  new String[3];
        nomes[0] = "Enzo";
        nomes[1] = "Pedrow";
        nomes[2] = "Claudio";

        for (int i = 0; i < idades.length; i++) {
            System.out.println("Idade de " + nomes[i] + ": " + idades[i]);
        }
        System.out.println("======================================");
        double[] valores = {3.23,5.21, 1234.2, 9640.30};
        for (double valor : valores){
            System.out.println(valor);
        }
        System.out.println("======================================");
        for (String nome: nomes){
            System.out.println(nome);
        }


    }
}
