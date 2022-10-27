package labs.lab4;

public class Planet implements Nameable{

    private String name;
    private int radius;

    public Planet(){
        this.name = "Earth";
        this.radius = 6371;
    }
    public Planet(String name, int radius){
        this.name = name;
        this.radius = radius;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
