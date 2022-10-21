package labs.lab3;

public abstract class Dog {

    protected String name;
    protected int growth;
    protected String color;
    protected String breed;

    public Dog(String name, int growth, String color){
        this.name = name;
        this.growth = growth;
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setGrowth(int growth) {
        this.growth = growth;
    }

    public String getName() {
        return name;
    }

    public int getGrowth() {
        return growth;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
