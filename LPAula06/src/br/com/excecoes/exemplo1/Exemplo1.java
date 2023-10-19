package br.com.excecoes.exemplo1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import static java.lang.System.in;

public class Exemplo1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Exceções");
        try {
// Código que pode lançar uma exceção
            int resultado = 10 / 0;
            System.out.println("Resultado: " + resultado);
        } catch (Exception e) {
            System.err.println("Ocorreu uma exceção: " + e.getMessage());
            escritor("Ocorreu uma exceção: " + e.getMessage());
        }
    }

    private static void escritor(String path) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter("src\\br\\com\\excecoes\\exemplo1\\log.txt", true));
        buffWrite.append(path + "\n");
        buffWrite.close();
    }
}