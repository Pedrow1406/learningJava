package main.java.com.pedrowsite.javacore.introducaoclasses.exception.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExeceptionFileTest {

    public static void main(String[] args) {
        String path = "files\\teste.txt";
        File file = new File(path);
        if (file.exists()) {
            file.delete();
        }
        try{
            file.createNewFile();
        } catch (IOException e){
            e.printStackTrace();
        }
        // file.setReadOnly();
        try (FileWriter writer = new FileWriter(path, true)) { // try-with-resourses ja faz o trabalho de fechar o file e deve ser passado apenas classes que herdam de clousere
            System.out.println("Arquivo Aberto");
            writer.flush();
            writer.write("Primeira linha do arquivo\n");
            writer.write("Segunda Linha do Arquivo\n");
            writer.write("Terceira linha HAhahah");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Arquivo Fechado");
        }
    }
}
