package main.java.com.pedrowsite.colecoes.test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListConvertionArrayTest {
    public static List<Integer> getIdadesList() {
        List<Integer> idadesList = new ArrayList<>();
        idadesList.add(19);
        idadesList.add(15);
        idadesList.add(29);
        return idadesList;

    }

    public static Integer[] getIdadesArray() {
        Integer[] idadesArray = new Integer[3];
        idadesArray[0] = 12;
        idadesArray[1] = 21;
        idadesArray[2] = 17;
        return idadesArray;
    }

    public static Integer[] getIdadesArray2() {
        Integer[] idadesArray2 = new Integer[3];
        idadesArray2[0] = 1322;
        idadesArray2[1] = 251;
        idadesArray2[2] = 197;
        return idadesArray2;
    }

    public static void main(String[] args) {
        List<Integer> idadesList = getIdadesList();
        Integer[] idadesArray = getIdadesArray();
        Integer[] idadesArray2 = getIdadesArray2();

        Integer[] listToArray = idadesList.toArray(new Integer[0]); // List to Array
        List<Integer> arrayToList = Arrays.asList(idadesArray);// Array to List ( Cria um LINK com o array)
        List<Integer> arrayToList2 = new ArrayList<>(Arrays.asList(idadesArray2));// Array to List (NÃO Cria um Link com o Array)

        System.out.println("idadesArray: " + idadesArray[0]);
        arrayToList.set(0, -999);// Alteradando a posição 0 do arrayToList
        System.out.println("idadesArray: " + idadesArray[0]); // mesmo alterando a posição 0 apenas do arrayToList, o idadesArray é alterado tambem pois eles estão linkados
        System.out.println("arrayToList: " + arrayToList.getFirst());
        System.out.println("Idades Array (Sem o Arrays.toString()): " + listToArray);
        System.out.println("Idades Array (Arrays.toString()): " + Arrays.toString(listToArray));
        System.out.println("Idades List: " + idadesList);
        System.out.println("===================== // =====================");
        arrayToList2.set(0, -333);// Alteradando a posição 0 do arrayToList2
        System.out.println("arrayToList2: " + Arrays.toString(idadesArray2));
        System.out.println("Idades Array: " + arrayToList2);// NÃO altera o idadesArray2 porque eles não estão linkados
        System.out.println("===================== // =====================");

        // M E L H O R   F O R M A   D E   C R I A R   U M   A R R A Y
        System.out.println("M E L H O R   F O R M A   D E   C R I A R   U M   A R R A Y");
        List<String> nomes = new ArrayList<>(Arrays.asList("Pedrow", "João", "Maria", "José"));
        nomes.add(1,"Lucas");
        System.out.println(nomes);
        for (String nome : nomes) {
            System.out.println(nome);
        }
        z
    }
}