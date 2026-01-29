package ExercicioMonitoramentoDeAtividadesFisicas;

import java.time.LocalDate;

public class Progresso {
    private Meta meta;
    private HistoricoAtividades historico;

    public Progresso (Meta meta, HistoricoAtividades historico) {
        this.meta = meta;
        this.historico = historico;
    }

    public double getPercentualConcluido() {
            if (meta == null || meta.getTipo() != Meta.TipoMeta.CALORIAS_DIARIAS) {
                return 0.0;
            }

            double totalCaloriasHoje = 0;
            LocalDate hoje = LocalDate.now();

            for (Treino treino : historico.getTreinos()) {
                if (treino.getData().equals(hoje)) {
                    totalCaloriasHoje += treino.getTotalCalorias();
                }
            }

            double valorAlvo = meta.getValorAlvo(); // ou getCaloriasDiariasAlvo()
            if (valorAlvo <= 0) return 0.0;

            return (totalCaloriasHoje / valorAlvo) * 100;

    }

    public boolean MetaAtingida() {
        return getPercentualConcluido() >= 100.0;
    }
}
