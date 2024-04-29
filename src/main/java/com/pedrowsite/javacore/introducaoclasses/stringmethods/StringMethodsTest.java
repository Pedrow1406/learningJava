package main.java.com.pedrowsite.javacore.introducaoclasses.stringmethods;

public class StringMethodsTest {
    public static void main(String[] args) {
        String nome = "Pedrow";
        String nome2 = "   Pedrow  ";
        String espacosEmBranco = "      ";
        System.out.println("String Normal: " + nome);
        System.out.println("String UpperCase: " + nome.toUpperCase());
        System.out.println("String LowerCase: " + nome.toLowerCase());
        System.out.println("Tamanho da String: " + nome.length());
        System.out.println("Caractere no Index 0: " + nome.charAt(0));
        System.out.println("String Slice: " + nome.substring(1, 5));
        System.out.println("String com espaços: " + nome2);
        System.out.println("String sem espaços: " + nome2.trim()); // Remove os caracteres vazios da esquerda e da direita da string
        System.out.println("String Contem \"dro\"? " + nome.contains("dro")); // Verifica se a String contém uma determinada sequencia de caracteres
        System.out.println("A string contando com os espaços em branco é vazia? " + espacosEmBranco.isEmpty());
        System.out.println("A string sem contar os espaços em branco é vazia? " + espacosEmBranco.trim().isEmpty());
    }

}
