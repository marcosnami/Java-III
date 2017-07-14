package com.alura.java3.chapter3.model;

/**
 * Created by MarcosNami on 6/24/2017.
 */
public class ContaCorrente extends Conta implements Comparable<ContaCorrente> {
    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 2;
    }

    @Override
    public int compareTo(ContaCorrente o) {
        if (this.getNumero() > o.getNumero() || this.getSaldo() > o.getSaldo()) return 1;
        if (this.getNumero() < o.getNumero() || this.getSaldo() < o.getSaldo()) return -1;
        return 0;
    }
}
