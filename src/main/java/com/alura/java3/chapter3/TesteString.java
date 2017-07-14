package com.alura.java3.chapter3;

/**
 * Created by MarcosNami on 6/25/2017.
 */
public class TesteString {
    public static void main(String[] args) {
        String s = "Java III";
        String outra = s.replaceAll("a", "i");
        System.out.println(s);
        System.out.println(outra);

        //contains
        boolean contem = s.contains("ava");
        System.out.println(contem);

        //trim
        String trimar = s.trim();
        System.out.println(trimar);

        //isEmpty
        boolean vazia = s.isEmpty();
        System.out.println(vazia);

        //length
        int quantidade = s.length();
        System.out.println(quantidade + "");

        String alura = "Alura";
        System.out.println("Saida: ");
        for (int i = 0 ; i < alura.length(); i++) {
            System.out.println(alura.charAt(i));
        }

        String texto = "Socorram-me, subi no ônibus em Marrocos";
        for (int i = texto.length()- 1; i >= 0; i-- ) {
            System.out.print(texto.charAt(i));
        }
        System.out.println();

        String[] quebrado = texto.split(" ");
        for (int i = quebrado.length - 1; i >= 0; i--) {
            System.out.print(quebrado[i] + " ");
        }

        System.out.println();
        StringBuilder invertido = new StringBuilder(texto).reverse();
        System.out.println(invertido);

        String numero = "762";
        System.out.println("Imprimindo a string: " + numero);

        int resultado = converteParaInt(numero);
        System.out.println("Imprimindo o int: " + resultado);
    }

    private static int converteParaInt(String numero) {
        int resultado = 0;
        while (numero.length() > 0) {
            char algarismo = numero.charAt(0);
            resultado = resultado * 10 + (algarismo - '0');
            numero = numero.substring(1);
        }
        return resultado;
    }

}
