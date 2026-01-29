package ExercicioMonitoramentoDeAtividadesFisicas;

public class Usuario {
    private String nome;
    private int idade;
    private double pesoKG;
    private Meta meta;
    private HistoricoAtividades historico;

    public Usuario( String nome, int idade, double pesoKG) {
        this.nome = nome;
        this.idade = idade;
        this.pesoKG = pesoKG;
        this.historico = new HistoricoAtividades();

    }

    public void definirMeta(Meta meta) {
        this.meta = meta;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public double getPesoKG() {
        return pesoKG;
    }

    public Meta getMeta() {
        return meta;
    }

    public HistoricoAtividades getHistorico() {
        return historico;
    }
}
