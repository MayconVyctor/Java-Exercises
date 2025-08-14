package org.example.ExercicioFuncionarios;




public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Maycon", 0203, 1200.00);
        Funcionario funcionario2 = new Funcionario("Mike", 020304, 1200.00);

        funcionario1.mostraInformacoes();
        funcionario2.mostraInformacoes();

        Funcionario.mostrarTotalFuncionarios();

    }
}
