package Exercises4.Ex10_Extends_4_3;

public class Point2D {
    protected float x = 0.0f;
    protected float y = 0.0f;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y) {
        setX(x);
        setY(y);
    }
    public float[] getXY() {
        float[] arr = new float[2];
        return  arr;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
