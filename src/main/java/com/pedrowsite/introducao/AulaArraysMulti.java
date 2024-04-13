package main.java.com.pedrowsite.introducao;
// A R R A Y S  M U L T I D I M E N S I O N A I S

public class AulaArraysMulti {
    public static void main(String[] args) {
        // Primeira Forma
        int[][] notasAlunos = new int[3][2];
        notasAlunos[0][0] = 5;
        notasAlunos[0][1] = 3;
        notasAlunos[1][0] = 10;
        notasAlunos[1][1] = 10;
        notasAlunos[2][0] = 9;
        notasAlunos[2][1] = 6;
        String[] alunos = new String[3];
        alunos[0] = "Enzo";
        alunos[1] = "Pedrow";
        alunos[2] = "Claudio";

        // Segunda Forma
        int[][] notasAlunosSegunda = {{5,3},{10,10},{9,6}};

        // Terceira Forma
        int[][] notasAlunosTerceira = new int[2][];
        notasAlunosTerceira[0] = new int[4];
        notasAlunosTerceira[0][0] = 1;
        notasAlunosTerceira[0][1] = 2;
        notasAlunosTerceira[0][2] = 3;
        notasAlunosTerceira[0][3] = 4;
        notasAlunosTerceira[1] = new int[2];
        notasAlunosTerceira[1][0] = 10;
        notasAlunosTerceira[1][1] = 20;
        for (int[] nat: notasAlunosTerceira){
            System.out.println("=====================================");
            for (int num:nat){
                System.out.println(num);
            }
        }
        for (int i = 0; i < notasAlunos.length; i++) {
            double primeiraNota = notasAlunos[i][0];
            double segundaNota = notasAlunos[i][1];
            double mediaAluno = (primeiraNota + segundaNota) / 2;
            System.out.println("A média de " + alunos[i] + " foi " + mediaAluno);
        }
    }
}
