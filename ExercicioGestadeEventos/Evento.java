package ExercicioGestadeEventos;

import java.util.Objects;

public class Evento {
    private final String id;
    private final String descricao;
    private boolean processado;

    public Evento(String id, String descricao) {
        this.id = id;
        this.descricao = descricao;
        this.processado = false;
    }

    public void marcarComoProcessado() {
        this.processado = true;
    }

    public String getId() { return id; }
    public boolean isProcessado() { return processado; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Evento)) return false;
        Evento evento = (Evento) o;
        return Objects.equals(id, evento.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return String.format("[%s] %-20s | %s", id, descricao, (processado ? "Feito ✅" : "Pendente ⏳"));
    }
}