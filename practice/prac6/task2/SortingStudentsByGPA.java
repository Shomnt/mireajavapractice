package practice.prac6.task2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingStudentsByGPA {

    private List<Student> students;

    public SortingStudentsByGPA(List<Student> students){
        this.students = students;
    }

    public List<Student> sort(){
        Comparator<Student> comparator = Comparator.comparing(obj -> obj.getMark());
        Collections.sort(students, comparator);
        return students;
    }

}
