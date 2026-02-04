package ExercicioImplementandoListas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.Set;

public class Lista {
    private ArrayList<String> listaUnica;
    private LinkedList<String> listaDuplicados;

    public Lista() {
        this.listaUnica = new ArrayList<>();
        this.listaDuplicados = new LinkedList<>();
    }

    public void processar(String[] elementos) {
        Set<String> vistos = new HashSet<>();

        for (String elemento : elementos) {
            if (!vistos.contains(elemento)) {
                vistos.add(elemento);
                listaUnica.add(elemento);
            } else if (!listaDuplicados.contains(elemento)) {
                listaDuplicados.add(elemento);
            }
        }
    }

    public void exibirResultados() {
        System.out.print("Resultado (Lista 1 - ArrayList): ");
        listaUnica.forEach(item -> System.out.print(item + " "));

        System.out.println("\nFiltrados (Lista 2 - LinkedList): " +
                String.join(" ", listaDuplicados));
    }
}
