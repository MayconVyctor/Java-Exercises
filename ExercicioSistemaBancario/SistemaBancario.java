package org.example;

public class SistemaBancario {
    private ContaBancaria contaBancaria;
    public void setConta(ContaBancaria contaBancaria) {
        this.contaBancaria = contaBancaria;
    }
    public double depositar(double num1) {
        return contaBancaria.depositar(num1);
    }
}
