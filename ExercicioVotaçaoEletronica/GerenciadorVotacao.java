package ExercicioVotaçaoEletronica;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GerenciadorVotacao {
    private Map<String, Integer> urna;
    private Set<String> eleitoresQueVotaram;

    public GerenciadorVotacao() {
        this.urna = new HashMap<>();
        this.eleitoresQueVotaram = new HashSet<>();
    }

    public void registrarVoto(String candidato, String idEleitor) {
        if (eleitoresQueVotaram.contains(idEleitor)) {
            System.out.println("!: Voto duplicado detectado para o ID: " + idEleitor);
            return;
        }
        eleitoresQueVotaram.add(idEleitor);
        urna.put(candidato, urna.getOrDefault(candidato, 0) + 1);
    }

    public void exibirResultados() {
        System.out.println("\n--- Resultado da Apuração ---");
        for (Map.Entry<String, Integer> entry : urna.entrySet()) {
            System.out.println("Candidato " + entry.getKey() + ", " + entry.getValue());
        }
    }
}
