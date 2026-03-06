package ExercicioCleanCode;

public class Cube implements Shape {
    private double side;

    public Cube(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("o lado tem que ser um numero positivo");
        }
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return 6 * side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 12 * side;
    }

    @Override
    public String getName() {
        return "Cube";
    }

    public double getSide() {
        return side;
    }

    public double calculateVolume() {
        return Math.pow(side, 3);
    }
}
