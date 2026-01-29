package org.example.ExercicioRevisaoOOP;

public abstract class Triangle implements FiguraGeometrica {

    protected double base;
    protected double altura;

    public Triangle(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double calcularArea() {
        return (base * altura)/2;
    }

    @Override
    public abstract double calcularPerimetro();

    public abstract void imprimirDados();
}
