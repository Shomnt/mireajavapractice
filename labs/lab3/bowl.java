package labs.lab3;

public class bowl extends Dish{

    private String material;

    public bowl(){
        this.name = "Чаша";
        this.color = "жёлтый";
        this.depth = 7;
        this.radius = 7;
        this.material = "металл";
    }
    public bowl(String name, String color, int depth, int radius, String material){
        this.name = name;
        this.color = color;
        this.depth = depth;
        this.radius = radius;
        this.material = material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
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
        return "Name: "+ name + " color:" + color + " depth: " + depth + " radius: " + radius + " material: " + material;
    }
}
