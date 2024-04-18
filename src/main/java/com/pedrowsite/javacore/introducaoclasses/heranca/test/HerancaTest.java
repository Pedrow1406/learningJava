package main.java.com.pedrowsite.javacore.introducaoclasses.heranca.test;

import main.java.com.pedrowsite.javacore.introducaoclasses.heranca.domain.Endereco;
import main.java.com.pedrowsite.javacore.introducaoclasses.heranca.domain.Funcionario;
import main.java.com.pedrowsite.javacore.introducaoclasses.heranca.domain.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setCep("632333-00");
        endereco.setRua("Rua dos Joaos Redentos");
        Pessoa pessoa = new Pessoa("Pedrow");
        pessoa.setIdade(19);
        pessoa.setCpf("053.673.389-85");
        pessoa.setEndereco(endereco);
        pessoa.displayData();

        Funcionario funcionario = new Funcionario("Pedrowzin", 7300);
        funcionario.setIdade(23);
        funcionario.setCpf("052.653.319-65");
        funcionario.setEndereco(endereco);
        funcionario.displayData();


        System.out.println("================= // ================= ");
        System.out.println(funcionario);
        System.out.println(pessoa);
    }
}
