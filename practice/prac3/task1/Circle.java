package practice.prac3.task1;

public class Circle extends Shape{

    private double radius;

    public Circle(){
        this.radius = 1f;
        this.color = "Blue";
        this.filled = false;
    }
    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI*radius*radius;

    }

    @Override
    double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Shape: circle, radius: "+this.radius+", color: "+this.color;
    }
}
