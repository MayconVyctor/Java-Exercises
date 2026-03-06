package ExercicioGestadeEventos;

import ExercicioGestadeEventos.Evento;

import java.util.*;
import java.util.stream.Collectors;

public class ProcessadorEventos {
    private final Set<Evento> repositorioEventos;
    private final Queue<Evento> fila;

    public ProcessadorEventos() {
        this.repositorioEventos = new HashSet<>();
        this.fila = new LinkedList<>();
    }

    public boolean enqueue(Evento novoEvento) {
        if (repositorioEventos.add(novoEvento)) {
            fila.add(novoEvento);
            return true;
        }
        return false;
    }

    public Evento dequeue() {
        return fila.poll();
    }

    public void processEvent(Evento evento) {
        if (evento != null) {
            evento.marcarComoProcessado();
        }
    }

    public List<Evento> getFilaAtual() {
        return new ArrayList<>(fila);
    }

    public List<Evento> getEventosProcessados() {
        return repositorioEventos.stream()
                .filter(Evento::isProcessado)
                .collect(Collectors.toList());
    }
}