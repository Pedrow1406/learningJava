package main.java.com.pedrowsite.javacore.introducaoclasses.associacao.exercicio.domain;

public class Local {
    private String nome;
    private String pontoDeReferencia;
    private Seminario[] seminarios = new Seminario[0];


    public Local(String nome) {
        this.nome = nome;
    }

    public Local(String nome, String pontoDeReferencia) {
        this(nome);
        this.pontoDeReferencia = pontoDeReferencia;
    }

    public void displaySeminarios() {
        if (seminarios.length > 0){

            System.out.println("Seminarios Localizados no " + nome);
            for (Seminario seminario : seminarios) {
                System.out.println(" -- " + seminario.getNome());
            }
        } else {
            System.out.println("Não há seminários registrados em " + nome);
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPontoDeReferencia() {
        return pontoDeReferencia;
    }

    public void setPontoDeReferencia(String pontoDeReferencia) {
        this.pontoDeReferencia = pontoDeReferencia;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario... seminarios) {
        int j = 0;
        Seminario[] novoSeminario;
        if (this.seminarios == null) {
            this.seminarios = new Seminario[0];
            novoSeminario = new Seminario[seminarios.length];
        } else {
            novoSeminario = new Seminario[this.seminarios.length + seminarios.length];
        }
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
