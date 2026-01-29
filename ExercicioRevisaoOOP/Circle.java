package org.example.ExercicioRevisaoOOP;

public class Circle implements FiguraGeometrica {

    protected double raio;

    public Circle(double raio) {
        this.raio = raio;
    }
    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public void imprimirDados() {
        System.out.println("Figura: Corculo");
        System.out.println("Raio: " + raio);
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro());
    }
}
