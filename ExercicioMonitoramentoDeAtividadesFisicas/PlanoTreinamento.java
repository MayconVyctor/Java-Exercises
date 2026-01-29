package ExercicioMonitoramentoDeAtividadesFisicas;

import java.util.ArrayList;
import java.util.List;

public class PlanoTreinamento {
    private String nome;
    private List<Exercicio> exerciciosSugeridos;

    public PlanoTreinamento(String nome) {
        this.nome = nome;
        this.exerciciosSugeridos = new ArrayList<>();
    }

    public void adicionarExercicioSugerido(Exercicio exercicio) {
        exerciciosSugeridos.add(exercicio);
    }

    public String getNome() { return nome; }
    public List<Exercicio> getExerciciosSugeridos() {
        return new ArrayList<>(exerciciosSugeridos);
    }
}
