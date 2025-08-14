package academy.devdojo.maratonajava.introducao.ExercicioMatrizes.Condicionais;

import java.util.Random;

public class ExercicioMatrizes {
    public static void main(String[] args) {


        matrizPerimetro();
        multiplicarMatriz();
    }
    public static void matrizPerimetro() {

        int linhas = 3;
        int colunas = 6;
        int[][] matriz = new int[linhas][colunas];
        Random random = new Random();

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = random.nextInt(99) + 1;
            }
        }

        System.out.println("Perimetro de matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (i == 0 || i == linhas - 1 || j == 0 || j == colunas - 1) {
                    System.out.print(matriz[i][j] + "\t");
                } else {
                    System.out.print("-\t");
                }
            }
            System.out.println();
        }
    }
    public static void multiplicarMatriz() {
        Random random = new Random();
        int linhas = 3;
        int colunas = 3;
        int multiplicador = 2;

        int[][] matriz = new int[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }
        System.out.println("Matriz original:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz multiplicada:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] *= multiplicador;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
}




