package ExercicioCartas;

public enum Valor {
    DOIS(2, "2"),
    TRES(3, "3"),
    QUATRO(4, "4"),
    CINCO(5, "5"),
    SEIS(6, "6"),
    SETE(7, "7"),
    OITO(8, "8"),
    NOVE(9, "9"),
    DEZ(10, "10"),
    VALETE(11, "J"),
    DAMA(12, "Q"),
    REI(13, "K"),
    AS(14, "A");

    private final int pontuacao;
    private final String simbolo;

    Valor (int pontuacao, String simbolo) {
        this.pontuacao = pontuacao;
        this.simbolo = simbolo;
    }

    public int getPontuacao(){
        return pontuacao;
    }

    public String getSimbolo() {
        return simbolo;
    }
}
