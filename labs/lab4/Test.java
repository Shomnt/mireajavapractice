package labs.lab4;

public class Test {
    public static void main(String[] args) {

        Nameable nameable = new Car("BMV", 120);
        System.out.println(nameable.getName());

        Nameable p1 = new Planet("Jupiter", 69911);
        System.out.println(p1.getName());
    }
}
