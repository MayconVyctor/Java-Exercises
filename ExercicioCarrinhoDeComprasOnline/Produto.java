package org.example.ExercicioCarrinhoDeComprasOnline;

public class Produto {
    String nome;
    double precoPorUnidade;
    static double desconto;

    public Produto(String nome, double precoPorUnidade) {
        this.nome = nome;
        this.precoPorUnidade = precoPorUnidade;
        desconto++;
    }

    public static void definirDesconto(){
        desconto = 100 / 50;
    }
}

