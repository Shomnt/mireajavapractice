package practice.prac6.task3;

public class Student {
    private String name;
    private int mark;

    public Student(String name, int mark){
        this.mark = mark;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return /*"Name: " + name + ", mark: " + */"" + mark;
    }
}
