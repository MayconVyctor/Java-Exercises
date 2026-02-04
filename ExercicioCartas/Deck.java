package ExercicioCartas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Carta> cartas;

    public Deck() {
        cartas = new ArrayList<>();
        for (Suite suite: Suite.values()) {
            for(Valor valor : Valor.values()) {
                cartas.add(new Carta(suite, valor));
            }
        }
        Collections.shuffle(cartas);
    }

    public Carta getCarta() {
        if (!cartas.isEmpty()) {
            return  cartas.removeFirst();
        } else {
            throw new RuntimeException();
        }
    }
}
