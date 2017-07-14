package com.alura.java3.chapter3;

/**
 * Created by MarcosNami on 6/25/2017.
 */
public class TesteInteger {
    public static void main(String[] args) {
        Integer x1 = new Integer(10);
        Integer x2 = new Integer(10);

        if (x1 == x2) {
            System.out.println("igual");
        } else {
            System.out.println("diferente");
        }
    }
}
