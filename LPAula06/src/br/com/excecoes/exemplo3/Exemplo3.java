package br.com.excecoes.exemplo3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Exemplo3 {
    public static void main(String[] args) throws IOException {
        try {
            // Código que pode lançar uma exceção
            //int[] array = new int[5];
            //int valor = array[10];
            String x = null;
            System.out.println(x.toUpperCase());
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.err.println("Exceção: " + e.getMessage());
            escritor("Exceção: " + e.getMessage());
        }
    }

    private static void escritor(String path) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter("src\\br\\com\\excecoes\\exemplo3\\log.txt", true));
        buffWrite.append(path + "\n");
        buffWrite.close();
    }
}
