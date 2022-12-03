package practice.prac10;

public class Test {
    public static void main(String[] args) {
        ChairFactory factory = new ChairFactory();
        Client client = new Client();
        System.out.println("Functional chair : ");
        client.setChair(factory.createFunctionalChair());
        client.sit();
        System.out.println("Magican chair : ");
        client.setChair(factory.createMagicChair());
        client.sit();
        System.out.println("Victorian chair : ");
        client.setChair(factory.createVictorianChair());
        client.sit();
    }
}
