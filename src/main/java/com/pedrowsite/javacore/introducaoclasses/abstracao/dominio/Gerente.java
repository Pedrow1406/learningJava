package main.java.com.pedrowsite.javacore.introducaoclasses.abstracao.dominio;

public class Gerente extends Funcionario{
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void displayInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Salario: " + salario);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
