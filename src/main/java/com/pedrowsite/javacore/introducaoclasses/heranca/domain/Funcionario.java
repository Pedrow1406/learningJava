package main.java.com.pedrowsite.javacore.introducaoclasses.heranca.domain;

public class Funcionario  extends Pessoa{
    private double salario;

    public Funcionario(String nome, double salario) {
        super(nome);
        this.salario = salario;
    }

    @Override
    public void displayData(){
        System.out.println("===================================");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: "  + this.idade);
        System.out.println("Salario: R$" + this.salario);
        System.out.println("CPF: " + this.cpf);
        System.out.println("-------- E N D E R E Ç 0 --------: " );
        System.out.println("Rua: " + this.endereco.getRua());
        System.out.println("CEP: " + this.endereco.getCep());
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "salario=" + salario +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cpf='" + cpf + '\'' +
                ", endereco=" + endereco +
                '}';
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
