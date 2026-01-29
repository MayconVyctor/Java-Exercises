package org.example.ExercicioRevisao;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        funcaoQuadrante();
        ultimoFatorial();
    }

    public static void funcaoQuadrante() {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a Cordenada X");
        int coordenadaX = input.nextInt();
        System.out.println("Informe a Cordenada Y");
        int coordenadaY = input.nextInt();

        if (coordenadaX == 0 || coordenadaY == 0) {
            System.out.println("Coordenadas inválidas (nenhuma pode ser zero).");
        } else {
            if (coordenadaX < 0 && coordenadaY >0 )
                System.out.println("Quadrante 1");
            else if (coordenadaX > 0 && coordenadaY > 0)
                System.out.println("Quadrante 2");
            else if (coordenadaX < 0 && coordenadaY < 0)
                System.out.println("Quadrante 3");
            else if (coordenadaX > 0 && coordenadaY < 0)
                System.out.println("Quadrante 4");
        }
        input.close();
    }

    public static void ultimoFatorial() {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        for (int caso = 0; caso < T; caso++) {
            int N = input.nextInt();
            int fatorial = 1;
            for (int i = 1; i <= N; i++) {
                fatorial = (fatorial * i) % 10;
            }
            System.out.println(fatorial);
        }

        input.close();
    }
}
