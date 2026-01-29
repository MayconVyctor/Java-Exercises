package ExercicioMonitoramentoDeAtividadesFisicas;

import java.util.ArrayList;
import java.util.List;

public class HistoricoAtividades {
    private List<Treino> treinos;

    public HistoricoAtividades() {
        this.treinos = new ArrayList<>();
    }

    public void adicionarTreino (Treino treino) {
        treinos.add(treino);
    }

    public List<Treino> getTreinos() {
        return new ArrayList<>(treinos);
    }
}
