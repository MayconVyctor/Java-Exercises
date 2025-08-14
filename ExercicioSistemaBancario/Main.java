
package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            double depositoUsuario;
            double saldoUsuario = 0;

            System.out.println("Informe a quantidade a ser depositada");
            Scanner input = new Scanner(System.in);
            depositoUsuario = input.nextDouble();

            SistemaBancario sistemaBancario = new SistemaBancario();
            sistemaBancario.setConta(new Depositar());
            double deposito = sistemaBancario.depositar(depositoUsuario);

            saldoUsuario += depositoUsuario;
            System.out.println("Deposito feito com sucesso");
            System.out.println("Saldo atual: " + saldoUsuario);

    }
}