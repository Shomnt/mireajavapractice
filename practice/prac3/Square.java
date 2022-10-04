package practice.prac3;

public class Square extends Rectangle {

    private double side;

    public Square(){
        this.side = 3f;
        this.color = "blue";
        this.filled = false;
    }

    public Square(double side){
        this.side = side;
        this.color = "blue";
        this.filled = false;
    }

    public Square(double side, String color, boolean filled){
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return "Shape: square, side: "+this.side+", color: "+this.color;
    }
}


