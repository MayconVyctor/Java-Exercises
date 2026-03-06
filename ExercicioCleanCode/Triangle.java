package ExercicioCleanCode;

public class Triangle implements Shape {
    private double base;
    private double height;
    private double sideA;
    private double sideB;

    public Triangle(double base, double height, double sideA, double sideB) {
        if (base <= 0 || height <= 0 || sideA <= 0 || sideB <= 0) {
            throw new IllegalArgumentException("All sides must be positive numbers");
        }
        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public double calculatePerimeter() {
        return base + sideA + sideB;
    }

    @Override
    public String getName() {
        return "Triangle";
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }
}
