package Exercises4.Ex2;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        try {
            if (radius > 0) {
                this.radius = radius;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("always printed");
        }
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
    public double getCircumference() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
