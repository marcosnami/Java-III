package com.alura.java3.chapter3;

import com.alura.java3.chapter3.model.Conta;
import com.alura.java3.chapter3.model.ContaCorrente;

/**
 * Created by MarcosNami on 6/25/2017.
 */
public class TestaConta {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.deposita(1000);
        cc.setNumero(12345);
        cc.setNome("Marcos");
        System.out.println(cc);

        ContaCorrente cc2 = new ContaCorrente();
        cc2.deposita(1000);
        cc2.setNumero(12345);
        cc2.setNome("Marcos");
        System.out.println(cc2);

        if (cc == cc2) {
            System.out.println("Contas iguais == ");
        } else {
            System.out.println("Contas deferentes == ");
        }

        if (cc.equals(cc2)) {
            System.out.println("Contas iguais");
        } else {
            System.out.println("Contas deferentes");
        }

    }
}
