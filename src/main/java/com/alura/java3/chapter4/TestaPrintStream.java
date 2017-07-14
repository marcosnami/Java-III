package com.alura.java3.chapter4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

/**
 * Created by MarcosNami on 6/25/2017.
 */
public class TestaPrintStream {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("data/saida.txt");
        PrintStream ps = new PrintStream(os);

        ps.println("I am testing the Print Stream");
        ps.println("This is my second line.");

        ps.close();
    }
}
