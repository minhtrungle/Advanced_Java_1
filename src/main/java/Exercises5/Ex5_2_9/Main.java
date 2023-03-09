package Exercises5.Ex5_2_9;

public class Main {
    public static void main(String[] args) {
        MyPoint v1 = new MyPoint(0, 3);
        MyPoint v2 = new MyPoint(4, 0);
        MyPoint v3 = new MyPoint(4, 3);

        MyTriangle m = new MyTriangle(v1, v2, v3);
        System.out.println(m);
        System.out.println(m.getPerimeter());
        System.out.println(m.getType());
    }
}
