package labs.lab3;

public class plate extends Dish{

    private String pattern;

    public plate(){
        this.name = "Тарелка";
        this.color = "Белый";
        this.depth = 3;
        this.radius = 5;
        this.pattern = "шарики";
    }

    public plate(String name, String color, int depth, int radius, String pattern){
        this.name = name;
        this.color = color;
        this.depth = depth;
        this.radius = radius;
        this.pattern = pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getPattern() {
        return pattern;
    }

    @Override
    void setColor(String color) {
        this.color = color;
    }

    @Override
    void setName(String name) {
        this.name = name;
    }

    @Override
    void setDepth(int depth) {
        this.depth = depth;
    }

    @Override
    void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    String getColor() {
        return color;
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    int getDepth() {
        return depth;
    }

    @Override
    int getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Name: "+ name + " color:" + color + " depth: " + depth + " radius: " + radius + " pattern: " + pattern;
    }

}
