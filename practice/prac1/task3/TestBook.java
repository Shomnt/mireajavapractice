package practice.prac1.task3;

import java.lang.*;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Хочу спать", 100 );
        Book b2 = new Book("Хочу спать 2", 250 );
        Book b3 = new Book("Хочу спать 3");
        Book b4 = new Book();
        b3.setPageCount(300);
        System.out.println(b1);
        b1.small_or_big();
        b2.small_or_big();
        b3.small_or_big();
        b4.small_or_big();
    }
}
