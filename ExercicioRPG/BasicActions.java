package ExercicioRPG;

import ExercicioMonitoramentoDeAtividadesFisicas.Treino;

import java.util.ArrayList;

public interface BasicActions {

    void attack(Characterer alvo);
    void levelUp();
    void showStatus();
    void gainXp(int xp);

}
