package main.java.com.pedrowsite.introducao;
import java.time.LocalDate;

/**
 * Exercício 1:
 * Crie varáveis para os campos descritos abaixo entre < > e imprima a seguinte mensagem:
 * Eu <nome>, mornado no endereço <endereco>, confirmo que recebi o salário de <salario>, na data <data>
 * */
public class ExercicioTiposPrimitivos {
    public static void main(String[] args) {
        String nome = "Pedrow";
        String endereco = "Rua Desconhecida, Nº 323";
        double salario = 2100.50;
        LocalDate dataRecebimento = LocalDate.now();
        System.out.println(dataRecebimento);
        System.out.println("Eu " + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salário de " + "R$" + salario + ", na data " + dataRecebimento);
    }
}
