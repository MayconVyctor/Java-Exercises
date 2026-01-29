package org.example.ExercicioRevisaoOOP;

public class TrianguloEscaleno extends Triangle {
    private double lado1, lado2, lado3;

    public TrianguloEscaleno(double lado1, double lado2, double lado3) {
        super(lado1, (2 * (Math.sqrt(((lado1 + lado2 + lado3) / 2)
                * (((lado1 + lado2 + lado3) / 2) - lado1) *
                (((lado1 + lado2 + lado3) / 2) - lado2) *
                (((lado1 + lado2 + lado3) / 2) - lado3)))) / lado1);

        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    @Override
    public void imprimirDados() {
        System.out.println("Figura: Triângulo Escaleno");
        System.out.println("Lados: " + lado1 + ", " + lado2 + ", " + lado3);
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}
