package Exercises4.Ex11_Extends_4_5;

public class Test {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setFilled(c.filled);
        c.setColor("blue");
        c.setRadius(8);
        System.out.println(c);
        double a = c.getPerimeter();
        double b = c.getArea();
        System.out.printf("Chu vi la: %f va dien tich la: %f", a, b);

        Rectangle r = new Rectangle();
        r.setWidth(3);
        r.setLength(4);
        r.setColor("black");
        r.setFilled(false);
        System.out.println(r);
        double x = r.getPerimeter();
        double y = r.getArea();
        System.out.printf("Chu vi la: %f va dien tich la: %f", x, y);

        Square s = new Square();
        s.setSide(3);
        s.setWidth(3);
        s.setLength(4);
        s.setColor("black");
        s.setFilled(true);
        System.out.println(s);

    }
}
