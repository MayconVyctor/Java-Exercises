package ExercicioVotaçaoEletronica;

public class Main {
    public static void main(String[] args) {
        GerenciadorVotacao sistema = new GerenciadorVotacao();
        sistema.registrarVoto("A", "101");
        sistema.registrarVoto("A", "101");
        sistema.registrarVoto("B", "102");
        sistema.registrarVoto("C", "103");
        sistema.registrarVoto("A", "104");
        sistema.registrarVoto("C", "105");
        sistema.registrarVoto("B", "106");
        sistema.registrarVoto("B", "107");
        sistema.registrarVoto("A", "108");
        sistema.registrarVoto("A", "109");
        sistema.exibirResultados();
    }
}