package org.example;


import java.util.Random;

public class ExercicioTutoriaC3 {
    public static void main(String[] args) {
        int linhas = 5;
        int colunas = 4;
        int [][] perimetroMatriz = new int [linhas][colunas];
        Random random = new Random();

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                perimetroMatriz[i][j] = random.nextInt(99) + 1;
            }
        }
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (i == 0 || i == linhas - 1 || j == 0 || j == colunas - 1) {
                    System.out.printf("%3d ", perimetroMatriz[i][j]);

                }  else {
                    System.out.print("    ");
                }
            }
            System.out.println();
        }
    }
}
