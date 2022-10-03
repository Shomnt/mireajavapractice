package labs.lab2;

import java.lang.*;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Хочу спать", 100, "Lavka", 2022);
        Book b2 = new Book("Хочу спать", 100, "Lavka");
        Book b3 = new Book("Хочу спать", 100);
        Book b4 = new Book("Хочу спать");
        Book b5 = new Book();
        b3.setPageCount(1020);
        System.out.println(b1);

    }
}