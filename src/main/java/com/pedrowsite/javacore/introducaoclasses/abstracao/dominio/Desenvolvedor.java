package main.java.com.pedrowsite.javacore.introducaoclasses.abstracao.dominio;

public class Desenvolvedor extends Funcionario {
    private LinguagensProgramacao linguagem;

    public Desenvolvedor(String nome, double salario, LinguagensProgramacao linguagem) {
        super(nome, salario);
        this.linguagem = linguagem;
    }

    @Override
    public void displayInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Salario: " + salario);
        System.out.println("Linguagem de Programação: " + linguagem);
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", linguagem=" + linguagem.getLinguagem() +
                '}';
    }

    public LinguagensProgramacao getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(LinguagensProgramacao linguagem) {
        this.linguagem = linguagem;
    }
}
