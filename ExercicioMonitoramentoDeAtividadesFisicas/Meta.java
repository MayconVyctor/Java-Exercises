package ExercicioMonitoramentoDeAtividadesFisicas;

public class Meta {
    public enum TipoMeta {
        CALORIAS_DIARIAS,
        PASSOS_DIARIOS,
        MINUTOS_SEMANAIS
    }

    private TipoMeta tipo;
    private double valorAlvo;

    public Meta(TipoMeta tipo, double valorAlvo) {
        this.tipo = tipo;
        this.valorAlvo = valorAlvo;
    }

    public TipoMeta getTipo() { return tipo; }
    public double getValorAlvo() { return valorAlvo; }
}

