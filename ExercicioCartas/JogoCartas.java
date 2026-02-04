package ExercicioCartas;

public class JogoCartas {
    public static void main(String[] args) {
        Deck deck = new Deck();

        Carta cartaJogador1 = deck.getCarta();
        Carta cartaJogador2 = deck.getCarta();

        int valorJogador1 = cartaJogador1.getValor().getPontuacao();
        int valorJogador2 = cartaJogador2.getValor().getPontuacao();

        System.out.printf("Jogador 1: %s \nJogador 2: %s\n",cartaJogador1, cartaJogador2);


        if (valorJogador1 > valorJogador2) {
            System.out.println("Jogador 1 ganhou");
        } else if (valorJogador2 > valorJogador1) {
            System.out.println("Jogador 2 ganhou");
        } else {
            System.out.println("Ambos os jogadores empataram");
        }
    }
}
