package br.com.excecoes.exemplo4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Exemplo4 {
    public static void main(String[] args) throws IOException {
        try {
            // Código que pode lançar uma exceção
            // ...
        } catch (Exception e) {
            System.err.println("Exceção: " + e.getMessage());
            escritor("Exceção: " + e.getMessage());
        } finally {
            // Código a ser executado sempre, mesmo se ocorrer uma exceção
            System.out.println("Bloco finally executado.");
            escritor("Bloco finally executado.");
        }
    }

    private static void escritor(String path) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter("src\\br\\com\\excecoes\\exemplo4\\log.txt", true));
        buffWrite.append(path + "\n");
        buffWrite.close();
    }
}
