package main.java.com.pedrowsite.javacore.introducaoclasses.metodos.dominio;

public class Estudante {
    private String nome;
    private int idade;
    private char sexo;

    public void displayData(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
    public void changeName(String novoNome){
        this.nome = novoNome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setSexo(char sexo){
        this.sexo = sexo;
    }
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public char getSexo(){
        return this.sexo;
    }
}
