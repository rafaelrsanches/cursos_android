package com.example.classesemetodosnapratica;

public class Conta {
    int numeroConta;
    double saldo = 100;

    public void depositar(double valorDeposito){
        this.saldo = this.saldo + valorDeposito;
    }

    public void sacar(double valorSaque){
        this.saldo = this.saldo - valorSaque;
    }
}
