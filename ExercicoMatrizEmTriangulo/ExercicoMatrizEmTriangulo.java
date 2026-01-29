package org.example;

public class ExercicoTutoriaC {
    public static void main(String[] args) {
        int linhas = 5;
        int colunas = 5;
        int [][] matrizTriangulo = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j <= i; j++) {
                matrizTriangulo[i][j] = 1;
            }
        }
        for(int i = 0; i < linhas; i++) {
            for(int j = 0; j < colunas; j++) {
                System.out.print(matrizTriangulo[i][j] + " ");
            }
            System.out.println();
        }
    }
}
