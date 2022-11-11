package practice.prac13_14.task1;

import java.util.Date;

public class Develop {
    private String name;
    private String start_time;
    private Date end_time;

    public Develop(String name, String start_time, Date end_time){
        this.name = name;
        this.start_time = start_time;
        this.end_time = end_time;
    }

    public String toString(){
        return "Фамилия: " + name + "\n" + "Дата получения: " + start_time + "\n" + "Дата окончания: " + end_time;
    }
}
