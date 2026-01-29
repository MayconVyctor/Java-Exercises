package org.example;

public class ExercicioTutoriaC2 {
    public static void main(String[] args) {
        int linhas = 5;
        int colunas = 5;
        int [][] matrizX= new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (i == j||i + j == colunas - 1) {
                    matrizX[i][j] = 1;
                }
            }
        }
        for(int i = 0; i < linhas; i++) {
            for(int j = 0; j < colunas; j++) {
                System.out.print(matrizX[i][j] + " ");
            }
            System.out.println();
        }
    }
}
