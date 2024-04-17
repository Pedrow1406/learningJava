package main.java.com.pedrowsite.javacore.introducaoclasses.associacao.exercicio.domain;

public class Professor {
    private String nome;
    private int idade;
    private String materia;
    private Seminario[] seminarios = new Seminario[0];

    public Professor(String nome, int idade, String materia) {
        this(nome, idade);
        this.materia = materia;
    }

    public Professor(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void displaySeminarios() {
        if (seminarios.length > 0){
            System.out.println("Seminarios responsáveis por Prof " + nome);
            for (Seminario seminario : seminarios) {
                System.out.println(" -- " + seminario.getNome());
            }
        } else{
            System.out.println("Prof " + nome + " não esta sendo responsável por nenhum seminário.");
        }

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

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario... seminarios) {
        int j = 0;

        Seminario[] novoSeminario = new Seminario[this.seminarios.length + seminarios.length];

        for (int i = 0; i < novoSeminario.length; i++) {
            if (i < this.seminarios.length) {
                novoSeminario[i] = this.seminarios[i];
            } else {
                if (j < seminarios.length) {
                    novoSeminario[i] = seminarios[j];
                }
                j++;
            }
        }

        this.seminarios = novoSeminario;
    }
}
