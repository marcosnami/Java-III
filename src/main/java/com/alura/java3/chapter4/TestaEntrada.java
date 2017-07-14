package com.alura.java3.chapter4;

import java.io.*;

/**
 * Created by MarcosNami on 6/25/2017.
 */
public class TestaEntrada {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("data/arquivo.txt");
        //InputStream is = System.in; // ObjectInputStream, AudioInputStream, ByteArrayInputStream, ou FileInputStream
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        while (s != null) {
            System.out.println(s);
            s = br.readLine();
        }

        br.close();

        System.out.println();

        tryWithResources();
    }

    public static void tryWithResources() {
        try (
                BufferedReader br = new BufferedReader(new FileReader("data/arquivo.txt"))
                ) {
            String s = br.readLine();
            while (s != null) {
                System.out.println(s);
                s = br.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
