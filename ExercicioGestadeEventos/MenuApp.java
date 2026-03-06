package ExercicioGestadeEventos;

import java.util.Scanner;

public class MenuApp {
    private final ProcessadorEventos processador = new ProcessadorEventos();
    private final Scanner scanner = new Scanner(System.in);

    public void iniciar() {
        int opcao;
        do {
            exibirMenu();
            opcao = lerInteiro();
            executarAcao(opcao);
        } while (opcao != 0);
    }

    private void exibirMenu() {
        System.out.println("\n--- GERENCIADOR DE EVENTOS ---");
        System.out.println("1. Novo Evento (Enqueue)");
        System.out.println("2. Ver Fila");
        System.out.println("3. Processar Próximo (Dequeue)");
        System.out.println("4. Ver Processados");
        System.out.println("0. Sair");
        System.out.print("Opção: ");
    }

    private void executarAcao(int opcao) {
        switch (opcao) {
            case 1 -> adicionarEvento();
            case 2 -> {
                System.out.println("\n--- FILA ATUAL ---");
                processador.getFilaAtual().forEach(System.out::println);
            }
            case 3 -> {
                Evento e = processador.dequeue();
                if (e != null) {
                    processador.processEvent(e);
                    System.out.println("Evento processado com sucesso!");
                } else {
                    System.out.println("Nada para processar.");
                }
            }
            case 4 -> {
                System.out.println("\n--- HISTÓRICO ---");
                processador.getEventosProcessados().forEach(System.out::println);
            }
            case 0 -> System.out.println("Encerrando...");
            default -> System.out.println("Opção inválida!");
        }
    }

    private void adicionarEvento() {
        System.out.print("ID: ");
        String id = scanner.nextLine();
        System.out.print("Descrição: ");
        String desc = scanner.nextLine();

        if (processador.enqueue(new Evento(id, desc))) {
            System.out.println("Adicionado!");
        } else {
            System.out.println("Erro: ID duplicado.");
        }
    }

    private int lerInteiro() {
        try {
            String entrada = scanner.nextLine();
            return Integer.parseInt(entrada);
        } catch (Exception e) {
            return -1;
        }
    }

    public static void main(String[] args) {
        new MenuApp().iniciar();
    }
}