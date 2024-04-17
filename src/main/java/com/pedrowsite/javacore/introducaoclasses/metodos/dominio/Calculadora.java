package main.java.com.pedrowsite.javacore.introducaoclasses.metodos.dominio;

public class Calculadora {
    public static void somar(double... numeros) {
        double total = 0;
        for (double num : numeros) {
            total += num;
        }
        System.out.println(total);
    }

    // Varargs
    public static void subtrair(double... numeros) {
        double total = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (i != 0) {
                total -= numeros[i];
            }
        }
        System.out.println(total);
    }

    public static void multiplicar(double... numeros) {
        double total = 1;
        for (double num:numeros){
            total *= num;
        }
        System.out.println(total);
    }

    public static double dividir(double x, double y) {
        if (y == 0) {
            System.out.println("Não pode divir por 0");
            return 0;
        }
        return x / y;
    }

}
