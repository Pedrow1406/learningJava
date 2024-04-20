package main.java.com.pedrowsite.javacore.introducaoclasses.abstracao.dominio;

public abstract class Funcionario extends Pessoa {
    protected double salario;

    public Funcionario(String nome, double salario) {
        super(nome);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
