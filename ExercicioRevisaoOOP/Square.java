package org.example.ExercicioRevisaoOOP;

public class Square extends Rectangle{
    public  Square (double lado) {
        super(lado, lado);
    }

    @Override
    public void imprimirDados() {
        System.out.println("Figura: Quadrado");
        System.out.println("Lado: " + base);
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro());
    }
}
