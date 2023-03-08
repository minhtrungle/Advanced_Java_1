package Exercises5.Ex1_Abstract_6_1;

public class Square extends Rectangle{
    private double side;
    public Square() {
    }

    public Square(double side) {
        if (side <= 0) {
            throw new RuntimeException("Khong thoa man");
        }
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <= 0) {
            throw new RuntimeException("Khong thoa man");
        }
        this.side = side;
        super.setWidth(side);
        super.setLength(side);
    }
    //ghì đè

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() +
                ']';
    }
}
