package org.example.ExercicioRevisaoOOP;

public class TrianguloEquilateral extends Triangle {
    public TrianguloEquilateral(double lado) {
        super(lado, (Math.sqrt(3) / 2) * lado);
    }

    @Override
    public double calcularPerimetro() {
        return 3 * base;
    }

    @Override
    public void imprimirDados() {
        System.out.println("Figura: Triangulo Equilatero");
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}
