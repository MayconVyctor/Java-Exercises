package ExercicioStreams;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Distancia> distancias = Utils.lerCSV("ExercicioStreams/cidades.csv");

        boolean continuar = true;
        while (continuar) {
            exibirMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\n=== Todas as Distâncias ===");
                    distancias.stream()
                            .forEach(System.out::println);
                    break;

                case 2:
                    System.out.println("\n=== Cinco Distâncias Ímpares ===");
                    distancias.stream()
                            .filter(d -> (long)d.getDist() % 2 != 0)
                            .limit(5)
                            .forEach(System.out::println);
                    break;

                case 3:
                    System.out.println("\n=== Distâncias em Ordem Crescente ===");
                    distancias.stream()
                            .sorted()
                            .forEach(System.out::println);
                    break;

                case 4:
                    System.out.println("\n=== Distâncias em Ordem Decrescente ===");
                    distancias.stream()
                            .sorted((d1, d2) -> Double.compare(d2.getDist(), d1.getDist()))
                            .map(Distancia::getDist)
                            .forEach(d -> System.out.printf("%.1f km%n", d));
                    break;

                case 0:
                    System.out.println("Saindo...");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

            if (continuar) {
                System.out.println("\nPressione Enter para continuar...");
                scanner.nextLine();
            }
        }

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("  Menu de Opções com Streams");
        System.out.println("1 - Simples (todas as distâncias)");
        System.out.println("2 - Cinco distâncias ímpares");
        System.out.println("3 - Ordem crescente");
        System.out.println("4 - Ordem decrescente (apenas distâncias)");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }
}
