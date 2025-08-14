package org.example.ExercicioFuncionarios;

public class Funcionario {
    private String nome;
    private int id;
    private double salario;
    static int totalFuncionarios;

    public Funcionario(String nome, int id, double salario) {
        this.nome = nome;
        this.id = id;
        this.salario = salario;
        totalFuncionarios++;
    }

    public void mostraInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Id: " + id);
    }

    public static void mostrarTotalFuncionarios() {
        System.out.println("total de funcionarios: " +totalFuncionarios);
    }
}
