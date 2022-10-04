package practice.prac3.task4;

public class MovableCirlce implements Movable{
    private int radius;
    private MovablePoint center;

    public MovableCirlce(int x, int y, int xSpeed, int ySpeed, int radius){
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public String toString(){
        return "x: " + ", y:" + ", xSpeed: " + ", ySpeed: " + ", radius: " + this.radius;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }
}
