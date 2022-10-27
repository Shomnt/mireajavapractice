package labs.lab4;

public class Car implements Nameable{
    private String name;
    private int maxSpeed;

    public Car(){
        this.name = "audi";
        this.maxSpeed = 120;
    }

    public Car(String name){
        this.name = name;
        this.maxSpeed = 120;
    }

    public Car(String name, int maxSpeed){
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
