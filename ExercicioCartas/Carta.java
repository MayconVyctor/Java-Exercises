package ExercicioCartas;

public class Carta {
    private final Suite naipe;
    private final Valor valor;

    public Carta(Suite naipe, Valor valor) {
        this.naipe = naipe;
        this.valor = valor;
    }

    public Suite getNaipe() {
        return naipe;
    }

    public Valor getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return naipe.getSimbolo() + valor.getSimbolo();
    }
}
