package practice.prac2.task1;

import java.lang.*;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("James", "James_work@gmail.com", 'm');
        Author a2 = new Author("Victoria", "Victoria_work@gmail.com", 'f');
        a2.setEmail("vica@gmail.com");
        System.out.println(a1);
        System.out.println(a2);
    }
}
