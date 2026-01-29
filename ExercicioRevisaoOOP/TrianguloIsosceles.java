package org.example.ExercicioRevisaoOOP;

public class TrianguloIsosceles extends Triangle{
    private double ladoIgual;
    public TrianguloIsosceles(double base, double ladoIgual) {
        super(base, Math.sqrt(ladoIgual * ladoIgual - (base/2)*(base/2)));
        this.ladoIgual = ladoIgual;
    }
    @Override
    public double calcularPerimetro() {
        return 2 * ladoIgual + base;
    }
    @Override
    public void imprimirDados() {
        System.out.println("Figura: Triângulo Isósceles");
        System.out.println("Base: " + base);
        System.out.println("Lado igual: " + ladoIgual);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}
