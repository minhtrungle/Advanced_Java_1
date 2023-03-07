package Exercises4.Ex8_4_1_Composition;

public class Cylinder {
    private double height = 1;
    private final Circle circle; //khai báo từ class Circle

    public Cylinder() {
        circle = new Circle();
    }

    public Cylinder(double height, Circle circle) {
        if(height <= 0){
            throw new RuntimeException("Error");
        }
        this.height = height;
        this.circle = circle; //Circle sẽ cho bằng circle luôn
    }
    public Cylinder(double height, double radius){
        if(height <= 0){
            throw new RuntimeException("Error");
        }
        this.height = height;
        this.circle = new Circle(radius); //phải lấy bằng radius từ Circle
    }
    public Cylinder(double height, double radius, String color){
        if(height <= 0){
            throw new RuntimeException("Error");
        }
        this.height = height;
        this.circle = new Circle(radius, color);//phải lấy bằng radius, color từ Circle
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height <= 0){
            throw new RuntimeException("Error");
        }
        this.height = height;
    }

    public Circle getCircle() {
        return circle;
    }
    public double getVolume() {
        return circle.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", circle=" + circle +
                '}';
    }
    //Dien tich xq
    public double getAroundArea(){
        return circle.getPerimeter() * height;
    }
    //Dien tich tp
    public double getTotalArea(){
        return getAroundArea() + 2 * circle.getArea();
    }
}
