package Day3;

import java.util.Random;

public class Example1 {
    //Hàm không có giá trị trả về và không có tham số
    public static void sayHello() {
        System.out.println("Hello");
    }
    //Hàm không có giá trị trả về và có tham số
    public static void sayHello2(String a) {
        System.out.println("sayhello" + a);
    }
    //Hàm có giá trị trả về và không có tham số
    public static int array() {
        return new Random().nextInt(1000);
    }
    //Hàm có giả trị trả về và có tham số
    public static double sum(double a, double b ) {
        return (a + b);
    }
    public static void main(String[] args) {
        sayHello();
        sayHello2("pppp");
        array();
        sum(3, 6);
    }
}
