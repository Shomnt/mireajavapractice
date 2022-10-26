package labs.lab3;

public class Tests {
    public static void main(String[] args) {
        Dish d1 = new plate("11", "yellow", 3, 5, "44");
        System.out.println(d1);
        System.out.println(d1.getDepth());
        System.out.println(d1.getName());
        System.out.println(d1.getColor());
        System.out.println(d1.getRadius());

        plate p1 = (plate)d1;
        System.out.println(p1.getPattern());

        Dish f1 = new bowl("w1ww1", "green", 6, 7, "metal");
        System.out.println(f1);
        System.out.println(f1.getDepth());
        System.out.println(f1.getName());
        System.out.println(f1.getColor());
        System.out.println(f1.getRadius());

        bowl b1 = (bowl)f1;
        System.out.println(b1.getMaterial());

    }
}
