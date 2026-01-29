package org.example.ExercicioRevisaoOOP;

public class CalculoGeometrico {
    public static void main(String[] args) {
        FiguraGeometrica[] figuras = {
                new Circle(5),
                new Rectangle(4, 6),
                new Square(3),
                new TrianguloEquilateral(4),
                new TrianguloIsosceles(4, 5),
                new TrianguloEscaleno(3, 4, 5)
        };

        for (FiguraGeometrica f : figuras) {
            f.imprimirDados();
        }
    }
}
