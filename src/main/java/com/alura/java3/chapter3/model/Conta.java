package com.alura.java3.chapter3.model;

import com.alura.java3.chapter3.exception.ValorInvalidoException;

/**
 * Created by MarcosNami on 6/24/2017.
 */
public abstract class Conta {
    protected double saldo;
    private int numero;
    private String nome;

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void deposita(double valor) {
        if (valor < 0) {
            //throw new IllegalArgumentException("O valor depositado e negativo R%" + valor);
            throw new ValorInvalidoException(valor);
        } else {
            this.saldo += valor;
        }
    }

    public void saca(double valor) {
        this.saldo -= valor;
    }

    public abstract void atualiza(double taxa);

    public boolean equals(Object obj) {
        Conta outraConta = (Conta) obj;
        return this.numero == outraConta.numero && this.nome.equals(outraConta.nome);
    }

    @Override
    public String toString() {
        return "esse objeto é uma conta com saldo R$" + getSaldo();
    }
}
