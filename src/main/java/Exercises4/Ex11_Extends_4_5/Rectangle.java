package Exercises4.Ex11_Extends_4_5;

public class Rectangle extends Shape{ //hcn
    protected double width = 1.0;
    protected double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        if (width <= 0 && length <= 0) {
            throw new RuntimeException("Khong thoa man");
        }
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled) {
        super(color, filled);
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        if (width <= 0 && length <= 0) {
            throw new RuntimeException("Khong thoa man");
        }
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            throw new RuntimeException("Khong thoa man");
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0) {
            throw new RuntimeException("Khong thoa man");
        }
        this.length = length;
    }
    public double getArea() {
        return width * length;
    }
    public double getPerimeter() {
        return (width + length) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle[Shape[" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                "],"+
                "width=" + width +
                ", length=" + length +
                ']';
    }
}
