package ExercicioImplementandoListas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite os elementos (números ou letras) separados por espaço:");
        String entrada = leitor.nextLine();

        if (entrada.trim().isEmpty()) {
            System.out.println("Entrada vazia.");
        } else {
            String[] dados = entrada.split("\\s+");

            Lista app = new Lista();
            app.processar(dados);
            app.exibirResultados();
        }

        leitor.close();
    }
}