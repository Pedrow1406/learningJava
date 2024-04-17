package main.java.com.pedrowsite.javacore.introducaoclasses.associacao.exercicio.domain;

public class Seminario {
    private String nome;
    private Estudante[] estudantes;
    private Professor professor;
    private Local local;
    private static Estudante[] estudantesEmSeminario = new Estudante[0];

    public Seminario(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
        professor.setSeminarios(this);
    }

    public void displayInfo() {
        System.out.println("====================================");
        System.out.println("*** Nome do Seminário: " + nome + " ***");
        if (professor != null) {
            System.out.println("Professor Auxiliar: " + professor.getNome());
        }
        if (estudantes != null) {

            System.out.println("-------- E Q U I P E --------");
            int i = 1;
            for (Estudante estudante : estudantes) {
                if (estudante != null) {
                    System.out.println("Aluno 0" + i + ": " + estudante.getNome());
                }
                i++;
            }
        }
        if (local != null) {
            System.out.println("------------------------------------");
            System.out.println("Local: " + local.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estudante[] getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(Estudante... estudantes) {
        Estudante[] estudantesNaoRepetidos = new Estudante[0];
        int i = 0;
        for (int c = 0; c < estudantes.length; c++) {
            boolean isEstudantesEmSeminario = false;
            for (Estudante estudanteExistente : estudantesEmSeminario) {
                if (estudantes[c] == estudanteExistente) {
                    isEstudantesEmSeminario = true;
                    System.out.println(estudantes[c].getNome() + " ja está em um seminário");
                    break;
                }
            }
            if (!isEstudantesEmSeminario) {
                Estudante[] estudantesEmSeminarioAntigo = estudantesEmSeminario;
                estudantesEmSeminario = new Estudante[estudantesEmSeminario.length + 1];
                for (int j = 0; j < estudantesEmSeminarioAntigo.length; j++) {
                    estudantesEmSeminario[j] = estudantesEmSeminarioAntigo[j];
                }
                estudantesEmSeminario[estudantesEmSeminario.length - 1] = estudantes[c];

                Estudante[] estudantesNaoRepetidosAntigo = estudantesNaoRepetidos;
                estudantesNaoRepetidos = new Estudante[estudantesNaoRepetidos.length + 1];
                for (int j = 0; j < estudantesNaoRepetidosAntigo.length; j++) {
                    estudantesNaoRepetidos[j] = estudantesNaoRepetidosAntigo[j];
                }
                estudantesNaoRepetidos[estudantesNaoRepetidos.length - 1] = estudantes[c];

                estudantes[c].setSeminario(this);
                i++;
            }
        }

        this.estudantes = estudantesNaoRepetidos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
        professor.setSeminarios(this);
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
        local.setSeminarios(this);
    }
}
