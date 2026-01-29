package ExercicioMonitoramentoDeAtividadesFisicas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Treino {
    private LocalDate data;
    private List<Exercicio> exercicios;

    public Treino(LocalDate data) {
        this.data = data;
        this.exercicios = new ArrayList<>();
    }

    public void adicionarExercicio (Exercicio exercicio) {
        exercicios.add(exercicio);
    }
    public double getTotalCalorias() {
        double total = 0;
        for (Exercicio ex: exercicios){
            total += ex.getCaloriasEstimadas();
        }
        return total;
    }

    public List<Exercicio> getExercicios() {
        return new ArrayList<>(exercicios);
    }

    public LocalDate getData() {
        return data;
    }
}
