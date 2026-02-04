package ExercicioCartas;

public enum Suite {
    PAUS('T'),
    OUROS('D'),
    COPAS('C'),
    ESPADAS('E');

    public final char simbolo;

    Suite (char simbolo) {
        this.simbolo = simbolo;
    }

    public char getSimbolo() {
        return simbolo;
    }
}
