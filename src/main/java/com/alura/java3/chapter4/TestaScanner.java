package com.alura.java3.chapter4;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by MarcosNami on 6/25/2017.
 */
public class TestaScanner {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("data/arquivo.txt");
        Scanner scanner = new Scanner(is);

        System.out.println("Digite sua menssagem:");
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}
