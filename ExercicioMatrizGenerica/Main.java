package ExercicioMatrizGenerica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a ordem da matriz (ex: 3): ");
        int n = Integer.parseInt(leitor.nextLine());

        System.out.print("Digite os elementos separados por espaço: ");
        String[] entrada = leitor.nextLine().split("\\s+");

        MatrizGenerica MatrizApp = new MatrizGenerica(n, entrada);

        MatrizApp.mostrarOriginal();
        MatrizApp.mostrarDiagonal();
        MatrizApp.mostrarTransposta();

        leitor.close();
    }
}
