package practice.prac6.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        List<Student> students = new ArrayList<>();
        students.add(new Student("Lavka" , 113));
        students.add(new Student("Bormincev" , 111));
        students.add(new Student("Ivanov" , 12));
        students.add(new Student("Andreev" , 154));
        students.add(new Student("Kuzya" , 3));

        SortingStudentsByGPA a = new SortingStudentsByGPA(students);

        System.out.println(a.sort());
    }

}
