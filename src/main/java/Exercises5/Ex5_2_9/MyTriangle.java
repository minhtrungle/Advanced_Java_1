package Exercises5.Ex5_2_9;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle() {
        v1 = new MyPoint();
        v2 = new MyPoint();
        v3 = new MyPoint();
    }
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        if (v1.distance(v2) == 0 || v1.distance(v3) == 0 || v2.distance(v3) == 0) {
            throw new RuntimeException("Error");
        }
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    public double getPerimeter() { //chu vi
        return v1.distance(v2) + v2.distance(v3) + v1.distance(v3) ;
    }
    public String getType() {
        double AB = v1.distance(v2);
        double BC = v2.distance(v3);
        double AC = v1.distance(v3);
        if (AB == BC && BC == AC) {
            return "Equilateral";
        } else if (AB == BC || BC == AC) {
            return "Ssosceles";
        }
        return "Scalene";
    }
    @Override
    public String toString() {
        return "MyTriangle[" +
                "v1=" + v1 +
                ", v2=" + v2 +
                ", v3=" + v3 +
                ']';
    }
}
