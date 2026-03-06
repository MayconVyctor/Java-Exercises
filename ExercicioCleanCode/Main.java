package ExercicioCleanCode;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        System.out.println("Calcular Área de Figuras");

        while (opcao != 7) {
            mostrarMenu();
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(scanner.nextLine());

            try {
                processarOpcao(opcao, scanner);
            } catch (IllegalArgumentException erro) {
                System.out.println("Erro: " + erro.getMessage());
            }

            if (opcao != 7 && opcao >= 1 && opcao <= 6) {
                System.out.println("Pressione Enter para continuar.");
                scanner.nextLine();
                System.out.println();
            }
        }

        System.out.println("Encerrando");
        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("1. Retângulo");
        System.out.println("2. Círculo");
        System.out.println("3. Triângulo");
        System.out.println("4. Quadrado");
        System.out.println("5. Esfera");
        System.out.println("6. Cubo");
        System.out.println("7. Sair");
    }

    private static void processarOpcao(int opcao, Scanner scanner) {
        switch (opcao) {
            case 1:
                criarRetangulo(scanner);
                break;
            case 2:
                criarCirculo(scanner);
                break;
            case 3:
                criarTriangulo(scanner);
                break;
            case 4:
                criarQuadrado(scanner);
                break;
            case 5:
                criarEsfera(scanner);
                break;
            case 6:
                criarCubo(scanner);
                break;
            case 7:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção invalida! Escolha entre 1 e 7.");
        }
    }

    private static void criarRetangulo(Scanner scanner) {
        System.out.println(" Retângulo");
        System.out.print("Digite o lado A: ");
        double ladoA = Double.parseDouble(scanner.nextLine());
        System.out.print("Digite o lado B: ");
        double ladoB = Double.parseDouble(scanner.nextLine());

        Rectangle retangulo = new Rectangle(ladoA, ladoB);
        mostrarResultados(retangulo);
    }

    private static void criarCirculo(Scanner scanner) {
        System.out.println(" Círculo");
        System.out.print("Digite o raio: ");
        double raio = Double.parseDouble(scanner.nextLine());

        Circle circulo = new Circle(raio);
        mostrarResultados(circulo);
    }

    private static void criarTriangulo(Scanner scanner) {
        System.out.println("Triângulo");
        System.out.print("Digite a base: ");
        double base = Double.parseDouble(scanner.nextLine());
        System.out.print("Digite a altura: ");
        double altura = Double.parseDouble(scanner.nextLine());
        System.out.print("Digite o lado A: ");
        double ladoA = Double.parseDouble(scanner.nextLine());
        System.out.print("Digite o lado B: ");
        double ladoB = Double.parseDouble(scanner.nextLine());

        Triangle triangulo = new Triangle(base, altura, ladoA, ladoB);
        mostrarResultados(triangulo);
    }

    private static void criarQuadrado(Scanner scanner) {
        System.out.println("Quadrado");
        System.out.print("Digite o lado: ");
        double lado = Double.parseDouble(scanner.nextLine());

        Square quadrado = new Square(lado);
        mostrarResultados(quadrado);
    }

    private static void criarEsfera(Scanner scanner) {
        System.out.println("Esfera ");
        System.out.print("Digite o raio: ");
        double raio = Double.parseDouble(scanner.nextLine());

        Sphere esfera = new Sphere(raio);
        mostrarResultados(esfera);
    }

    private static void criarCubo(Scanner scanner) {
        System.out.println("Cubo");
        System.out.print("Digite o lado: ");
        double lado = Double.parseDouble(scanner.nextLine());

        Cube cubo = new Cube(lado);
        mostrarResultados(cubo);
    }

    private static void mostrarResultados(Shape forma) {
        System.out.println("Resultados ");
        System.out.println("Figura: " + forma.getName());
        System.out.printf("Área: %.2f%n", forma.calculateArea());
        System.out.printf("Perímetro: %.2f%n", forma.calculatePerimeter());
    }
}