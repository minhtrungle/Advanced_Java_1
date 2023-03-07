package Exercises4.Ex8_4_1_Composition;

public class Test {
    public static void main(String[] args) {
        Cylinder c = new Cylinder(2, 3);
        // Tinh the tich
        System.out.println(c.getVolume());
        // Tinh dien tich day
        System.out.println(c.getCircle().getArea());

        // Dien tich xung quanh
        System.out.println(c.getAroundArea());
    }
}
