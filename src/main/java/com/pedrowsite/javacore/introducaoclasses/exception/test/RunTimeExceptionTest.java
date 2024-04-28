package main.java.com.pedrowsite.javacore.introducaoclasses.exception.test;

public class RunTimeExceptionTest {
    public static void main(String[] args) {
        try {
            int resultado = dividir(20, 0);
            System.out.println(resultado);
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            throw e; // Relançando exception
        }
        System.out.println("Mensagem pós divisão...");
    }

    /**
     *
     * @param a Inteiro
     * @param b Inteiro diferente de zero
     * @return Resultado da divisão caso não dê erro
     * @throws IllegalArgumentException Caso b seja zero
     */
    private static int dividir(int a, int b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("Não pode divir por zero");
        }
        return a / b;

    }
}
