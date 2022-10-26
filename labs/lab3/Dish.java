package labs.lab3;

public abstract class Dish {

    protected String color;
    protected int depth;
    protected int radius;
    protected String name;

    public Dish(){
        this.name = "Тарелка";
        this.color = "Белый";
        this.depth = 3;
        this.radius = 5;
    }
    public Dish(String name, String color, int depth, int radius){
        this.name = name;
        this.color = color;
        this.depth = depth;
        this.radius = radius;
    }

    abstract void setColor(String color);
    abstract void setName(String name);
    abstract void setDepth(int depth);
    abstract void setRadius(int radius);

    abstract String getColor();
    abstract String getName();
    abstract int getDepth();
    abstract int getRadius();

    public abstract String toString();

}
