package main.java.com.pedrowsite.introducao;

/**
 * Existe 8 tipos primitivos
 * int , double, float, char, byte, short, long, boolean
 */
public class VariableTypes {
    public static void main(String[] args) {
        // T I P O S  P R I M I T I V O S

        // boolean
        boolean verdadeiro = true; // 1 bit
        System.out.println(verdadeiro);
        boolean falso = false; // 1 bit
        System.out.println(falso);
        // byte
        byte numeroByte = -128; // suporta de -128 ate 127 ( 1 Byte || 8 bits)
        System.out.println(numeroByte);
        // char
        char varChar = 'M'; // Aspas Simples ( 2 Bytes || 16 bits)
        System.out.println(varChar);
        // short
        short numeroShort = 9999; // ( 2 Bytes || 16 bits)
        System.out.println(numeroShort);
        // int
        int numeroInt = 999999999; // ( 4 Bytes || 32 bits)
        System.out.println(numeroInt);
        // float
        float numeroFloat = 9.999999999999f; // Sufixo f indica que é um float ( 4 Bytes || 32 bits)
        System.out.println("Valor float: " + numeroFloat);
        // double
        double numeroDouble = 9.999999999999999; // ( 8 Bytes || 64 bits) double é bem mais preciso do que o float
        System.out.println("Valor double: " + numeroDouble);
        // long
        long numeroLong = 999999999999999999L; // Sufixo L indica que é um long (8 Bytes || 64 bits)
        System.out.println(numeroLong);

        // T I P O S  D E  R E F E R Ê N C I A

        // String
        String nome = "Pedrow";
        System.out.println("Meu nome é " + nome + "!");
    }
}