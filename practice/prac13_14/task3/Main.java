package practice.prac13_14.task3;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        Student a1 = new Student("Lavka", 1023, "12-11-2003 15:24:42");
        System.out.println(a1.toString(1));
        System.out.println();
        System.out.println(a1.toString(2));
        System.out.println();
        System.out.println(a1.toString(3));
    }
}
