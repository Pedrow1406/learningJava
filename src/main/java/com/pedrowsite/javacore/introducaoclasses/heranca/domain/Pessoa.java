package main.java.com.pedrowsite.javacore.introducaoclasses.heranca.domain;

public class Pessoa {
    protected String nome;
    protected int idade;
    protected String cpf;
    protected Endereco endereco;

    public Pessoa(String nome){
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cpf='" + cpf + '\'' +
                ", endereco=" + endereco +
                '}';
    }

    public void displayData(){
        System.out.println("===================================");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: "  + idade);
        System.out.println("CPF: " + cpf);
        System.out.println("-------- E N D E R E Ç 0 --------: " );
        System.out.println("Rua: " + endereco.getRua());
        System.out.println("CEP: " + endereco.getCep());
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
