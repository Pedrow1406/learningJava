package main.java.com.pedrowsite.javacore.introducaoclasses.polimorfismo.dominio;

public class Computador extends Produto {
    private final double PORCENTAGEM_IMPOSTO = 0.2;

    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    public void ligar(){
        System.out.println("Ligando Computador...");
    }

    @Override
    public String toString() {
        return "Computador{" +
                "PORCENTAGEM_IMPOSTO=" + PORCENTAGEM_IMPOSTO +
                ", nome='" + nome + '\'' +
                ", valor=" + valor +
                '}';
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do Computador...");
        return this.valor * PORCENTAGEM_IMPOSTO;
    }
}
