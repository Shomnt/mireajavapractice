package practice.prac3;

public class Rectangle extends Shape{

    private double width;

    private double length;

    public Rectangle(){
        this.color = "blue";
        this.filled = false;
        this.length = 5f;
        this.width = 3f;
    }

    public Rectangle(double width, double length){
        this.color = "blue";
        this.filled = false;
        this.length = width;
        this.width = length;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        this.color = color;
        this.filled = filled;
        this.length = width;
        this.width = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return "Shape: rectangle, width: "+this.width+" , length: "+this.length+", color: "+this.color;
    }
}