package com.alura.java3.chapter4;

import java.io.*;

/**
 * Created by MarcosNami on 6/25/2017.
 */
public class TesteIO {
    public static void main(String[] args) throws IOException {
        /*
        * AudioInputStream, ByteArrayInputStream, FileInputStream,
        * InputStream (do CORBA), ObjectInputStream, PipedInputStream,
        * SequenceInputStream, StringBufferInputStream, FilterInputStream
        * BufferedInputStream, CheckedInputStream, CipherInputStream,
        * DataInputStream, DeflaterInputStream, DigestInputStream,
        * InflaterInputStream, LineNumberInputStream, ProgressMonitorInputStream,
        * PushbackInputStream, AudioInputStream
         */
        InputStream is = new FileInputStream("data/arquivo.txt");
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Digite sua menssagem:");
        String line = br.readLine();

        while (line != null) {
            System.out.println(line);
            line = br.readLine();
        }

        br.close();

    }
}
