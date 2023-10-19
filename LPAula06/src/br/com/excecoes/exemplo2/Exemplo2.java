package br.com.excecoes.exemplo2;

import java.io.*;

public class Exemplo2 {
    public static void main(String[] args) throws IOException {
        try {
            // Código que pode lançar uma exceção
            FileReader file = new FileReader("arquivo.txt");
        } catch (FileNotFoundException e) {
            System.err.println("Arquivo não encontrado: " + e.getMessage());
            escritor("Arquivo não encontrado: " + e.getMessage());
        } catch(Exception e){
            System.err.println("Minha exceção pai: " + e.getMessage());
            escritor("Minha exceção pai: " + e.getMessage());
        }
    }

    private static void escritor(String path) throws IOException{
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter("src\\br\\com\\excecoes\\exemplo2\\log.txt", true));
        buffWrite.append(path + "\n");
        buffWrite.close();
    }
}
