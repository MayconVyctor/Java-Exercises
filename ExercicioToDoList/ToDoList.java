package org.example;

import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        String[] tarefas = new String[10];
        int quantidade = 0;
        Scanner entradaUser = new Scanner(System.in);

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("-----TO-DO LIST -----");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Remover tarefa");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = entradaUser.nextInt();
            entradaUser.nextLine();

            switch (opcao) {
                case 1:
                    if (quantidade < tarefas.length) {
                        System.out.print("Digite a tarefa: ");
                        tarefas[quantidade] = entradaUser.nextLine();
                        quantidade++;
                        System.out.println("Tarefa adicionada");
                    } else {
                        System.out.println("Não é possível adicionar mais tarefas.");
                    }
                    break;

                case 2:
                    if (quantidade == 0) {
                        System.out.println("Nenhuma tarefa .");
                    } else {
                        System.out.println("Tarefas:");
                        for (int i = 0; i < quantidade; i++) {
                            System.out.println((i + 1) + ". " + tarefas[i]);
                        }
                    }
                    break;

                case 3:
                    if (quantidade == 0) {
                        System.out.println("Nenhuma tarefa para remover.");
                    } else {
                        System.out.print("Digite o número da tarefa para remover: ");
                        int indice = entradaUser.nextInt();

                        if (indice >= 1 && indice <= quantidade) {
                            for (int i = indice - 1; i < quantidade - 1; i++) {
                                tarefas[i] = tarefas[i + 1];
                            }
                            quantidade--;
                            System.out.println("Tarefa removida!");
                        } else {
                            System.out.println("Número inválido.");
                        }
                    }
                    break;

                case 0:
                    System.out.println("Saindo");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
