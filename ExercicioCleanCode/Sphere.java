package ExercicioCleanCode;

public class Sphere implements Shape {
    private double radius;

    public Sphere(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive number");
        }
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String getName() {
        return "Sphere";
    }

    public double getRadius() {
        return radius;
    }

    public double calculateVolume() {
        return (4.0/3.0) * Math.PI * Math.pow(radius, 3);
    }
}
