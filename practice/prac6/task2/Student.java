package practice.prac6.task2;

public class Student {

    private String name;
    private int mark;

    public Student(String name, int mark){
        this.mark = mark;
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public String toString(){
        return "Name: " + name + ", mark: " + mark;
    }
}
