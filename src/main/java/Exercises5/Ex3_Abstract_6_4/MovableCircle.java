package Exercises5.Ex3_Abstract_6_4;

public class MovableCircle implements Movable{
    private int radius;
    private   final MovablePoint center;

    public MovableCircle() {
        center = new MovablePoint();
    }

    public MovableCircle(int radius) {
        this.radius = radius;
        center = null;
    }

    public MovableCircle(int radius, MovablePoint center) {
        if(radius <= 0){
            throw new RuntimeException("Error");
        }
        this.radius = radius;
        this.center = center;
    }
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        super();
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }
    @Override
    public void moveUp() {

    }

    @Override
    public void moveDown() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void moveRight() {

    }

}
