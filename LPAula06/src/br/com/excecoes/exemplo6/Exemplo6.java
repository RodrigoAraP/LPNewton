package br.com.excecoes.exemplo6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Exemplo6 {
    public static void main(String[] args) throws IOException {
        try {
            verificarValor();
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            escritor(e.getMessage());
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
            escritor(e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
            escritor(e.getMessage());
        }
    }

    private static void verificarValor() throws IllegalArgumentException{
        int valor = -10;
        if (valor < 0) {
            throw new IllegalArgumentException("ABCDEFG 900: O valor não pode ser negativo.");
        }
    }

    private static void escritor(String path) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter("src\\br\\com\\excecoes\\exemplo6\\log.txt", true));
        buffWrite.append(path + "\n");
        buffWrite.close();
    }
}

// https://docs.oracle.com/javase/8/docs/api/java/lang/Exception.html