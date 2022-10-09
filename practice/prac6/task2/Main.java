package practice.prac6.task2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args){

        List<Student> students = new ArrayList<>();
        students.add(new Student("Lavka" , 113));
        students.add(new Student("Bormincev" , 111));
        students.add(new Student("Ivanov" , 12));
        students.add(new Student("Andreev" , 154));
        students.add(new Student("Kuzya" , 3));

        List<Student> students2 = new ArrayList<>();
        students2.add(new Student("Lavka" , 133));
        students2.add(new Student("Bormincev" , 121));
        students2.add(new Student("Ivanov" , 42));
        students2.add(new Student("Andreev" , 110));
        students2.add(new Student("Kuzya" , 4));

        List<Student> students11;

        SortingStudentsByGPA a = new SortingStudentsByGPA();
        students11 = a.sort(students, 0, students.size()-1);
        System.out.println(students11);

    }

}
