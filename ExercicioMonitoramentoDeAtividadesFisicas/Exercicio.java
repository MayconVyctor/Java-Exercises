package ExercicioMonitoramentoDeAtividadesFisicas;

public class Exercicio implements AtividadeCalculavel{
    private String nome;
    private int duracaoMinutos; // duração da sessão
    private double caloriasEstimadas;
    private String categoria;

    public Exercicio(String nome, int duracaoMinutos, String categoria) {
        this.nome = nome;
        this.duracaoMinutos = duracaoMinutos;
        this.categoria = categoria;
        this.caloriasEstimadas = calcularCalorias();
    }

    private double calcularCalorias() {
        switch (this.categoria) {
            case "cardio":
                return this.duracaoMinutos * 8.0;
            case "força":
            case "forca":
                return this.duracaoMinutos * 5.0;
            case "flexibilidade":
                return this.duracaoMinutos * 3.0;
            case "equilíbrio":
            case "equilibrio":
                return this.duracaoMinutos * 2.5;
            default:
                return this.duracaoMinutos * 4.0;
        }
    }

    @Override
    public double calcularCaloriasQueimadas() {
        return this.caloriasEstimadas;
    }

    public String getNome() { return nome; }
    public int getDuracaoMinutos() { return duracaoMinutos; }
    public double getCaloriasEstimadas() { return caloriasEstimadas; }
    public String getCategoria() { return categoria; }
}

