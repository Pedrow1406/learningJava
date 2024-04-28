package main.java.com.pedrowsite.javacore.introducaoclasses.stringmethods;

public class StringComparisionTest01 {
    public static void main(String[] args) {
        String nome1 = "Pedrow";
        String nome2 = new String("Pedrow"); // String não esta no pool de string

        System.out.println(nome1 == nome2); // false
        System.out.println(nome1 == nome2.intern());// true // O método intern é usado para garantir que a string esteja no pool de String.
        System.out.println(nome1.equals(nome2)); // true
    }
}
