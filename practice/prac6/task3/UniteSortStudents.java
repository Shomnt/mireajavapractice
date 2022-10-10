package practice.prac6.task3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class UniteSortStudents implements Comparator<Student> {

    public List<Student> source;

    public UniteSortStudents(List<Student> source1){
        source = source1;
    }

    public void mergeSort(int left, int right) {
        int delimiter = left + ((right - left) / 2) + 1;
        if (delimiter > 0 && right > (left + 1)) {
            mergeSort(left, delimiter - 1);
            mergeSort(delimiter, right);
        }
        List<Student> buffer = new ArrayList<>();
        int cursor = left;
        for (int i = 0; i < right - left + 1; i++) {
            if (delimiter > right || compare(source.get(cursor), source.get(delimiter)) == 1) {
                buffer.add(source.get(cursor));
                cursor++;
            } else {
                buffer.add(source.get(delimiter));
                delimiter++;
            }
        }
        for (int i = 0; i < buffer.size()-1; i++){
            source.set(left+i , buffer.get(i));
        }
    }


    @Override
    public int compare(Student o1, Student o2) {
        int mark1 = o1.getMark();
        int mark2 = o2.getMark();

        if(mark1 > mark2) return 1;
        if(mark1 < mark2) return -1;
        return 0;
    }
}
