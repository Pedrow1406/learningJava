package main.java.com.pedrowsite.javacore.introducaoclasses.exception.test;

import main.java.com.pedrowsite.javacore.introducaoclasses.exception.dominio.UsuarioInexistenteException;

import java.util.Scanner;

public class CustomExceptionTest01 {
    private static final Scanner input = new Scanner(System.in);
    private static final String usernameDB = "Pedrow1406";

    public static void main(String[] args){
        System.out.print("Digite seu username: ");
        String username = input.next();
        try {
            usernameValidation(username);
        } catch (UsuarioInexistenteException e) {
            e.printStackTrace();
        }
    }

    public static void usernameValidation(String username) throws UsuarioInexistenteException {
        if (usernameDB.equals(username)){
            System.out.println("Logado com Sucesso");
        } else {
            throw new UsuarioInexistenteException("Esse usuario não existe no Database");
        }
    }
}
