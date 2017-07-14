package com.alura.java3.chapter4;

import java.io.*;

/**
 * Created by MarcosNami on 6/25/2017.
 */
public class TestaSaida {
    public static void main(String[] args) throws IOException {
        //OutputStream os = new FileOutputStream("data/saida.txt");
        OutputStream os = System.out;
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("Marcos Henrique Nami");
        bw.newLine();
        bw.append("Eu trabalho numa compania de cartao pre-pago");

        bw.close();

        System.out.println();

        tryWithResources();
    }

    public static void tryWithResources() {

        try (
                BufferedWriter bw = new BufferedWriter(new FileWriter("data/saida.txt"))
                ) {
            bw.write("Marcos Henrique Nami");
            bw.newLine();
            bw.append("Eu trabalho numa compania de cartao pre-pago");
            bw.newLine();
            bw.append("O nome da empresa que eu trabalho e Qui Card do Brasil.");

        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
