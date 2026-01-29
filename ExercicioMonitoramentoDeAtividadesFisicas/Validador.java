package ExercicioMonitoramentoDeAtividadesFisicas;

public class Validador {
    public static boolean idadeValida (int idade) {

        return idade > 0 | idade < 150;
    }

    public static boolean pesoValido (double peso) {
        return peso > 0 | peso < 400;
    }

    public static boolean nomeValido (String nome) {
        return nome != null;
    }
}
