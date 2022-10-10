package practice.prac6.task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        List<Student> students = new ArrayList<>();
        students.add(new Student("Lavka" , 113));
        students.add(new Student("Bormincev" , 111));
        students.add(new Student("Ivanov" , 12));
        students.add(new Student("Andreev" , 154));
        students.add(new Student("Kuzya" , 7));

        List<Student> students2 = new ArrayList<>();
        students2.add(new Student("Lavkaff" , 133));
        students2.add(new Student("Bormincevff" , 121));
        students2.add(new Student("Ivanffov" , 42));
        students2.add(new Student("Andreffev" , 110));
        students2.add(new Student("Kuzyadd" , 3));

        students.addAll(students2);
        System.out.println(students);

        UniteSortStudents a = new UniteSortStudents(students);

        a.mergeSort(0, students.size()-1);
        System.out.println(a.source);

    }
}
