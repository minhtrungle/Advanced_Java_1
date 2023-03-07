package Exercises4.Ex11_Extends_4_5;

public class Circle extends Shape{
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
    public double getArea() {
        return radius * radius * Math.PI;
    }
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle[Shape[" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                "],"+
                "radius=" + radius +
                ']';
    }
}
