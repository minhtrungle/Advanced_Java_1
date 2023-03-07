package Exercises4.Ex1;

public class TestCircle {
    public static void main(String[] args) throws Exception {
        try {
            Circle c = new Circle();
            System.out.println(c);
            System.out.println(c.getRadius() + c.getArea());

            Circle c1 = new Circle(5);
            System.out.println(c1.getRadius() + c1.getArea());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
