package practice.prac11_12.task1;

public class Main {
    public static void main(String[] args){
        Person a1 = new Person("Иванов", "Александр", "Олегович");
        Person a2 = new Person("Кузнецов", "Иван");
        Person a3 = new Person("Добронравов");

        System.out.println(a1.get_fio());
        System.out.println(a2.get_fio());
        System.out.println(a3.get_fio());
    }
}
