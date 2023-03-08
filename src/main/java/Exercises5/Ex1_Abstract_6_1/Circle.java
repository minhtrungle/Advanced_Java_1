package Exercises5.Ex1_Abstract_6_1;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        if (radius <= 0) {
            throw new RuntimeException("Khong thoa man");
        }
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        if (radius <= 0) {
            throw new RuntimeException("Khong thoa man");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new RuntimeException("Khong thoa man");
        }
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    @Override
    public String toString() {
        return "Circle[" + super.toString()
                +
                "radius=" + radius +
                ']';
    }
}
