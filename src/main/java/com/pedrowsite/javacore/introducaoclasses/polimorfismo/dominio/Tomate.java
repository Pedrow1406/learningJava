package main.java.com.pedrowsite.javacore.introducaoclasses.polimorfismo.dominio;

public class Tomate extends Produto {

    private final double PORCENTAGEM_IMPOSTO = 0.05;
    private String DATA_VALIDADE = "24/04/2024";

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando o imposto do Tomate...");
        return this.valor * PORCENTAGEM_IMPOSTO;
    }

    public String getDATA_VALIDADE(){
        return DATA_VALIDADE;
    }
    public void setDATA_VALIDADE(String DATA_VALIDADE){
        this.DATA_VALIDADE = DATA_VALIDADE;
    }

}