package practice.prac13_14.task3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {

    private String name;
    private int key;
    private String birthday;

    public Student(String name, int key, String birthday){
        this.name = name;
        this.birthday = birthday;
        this.key = key;
    }

    public String toString(int form) throws ParseException {
        if(form == 1){
            SimpleDateFormat dt = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
            Date date = dt.parse(birthday);
            return "Student:\nname: " + name + "\nkey: " + key + "\nbirthday: " + dt.format(date);
        } else if (form == 2) {
            SimpleDateFormat dt1 = new SimpleDateFormat("dd-MM-yyyy");
            Date date = dt1.parse(birthday);
            return "Student:\nname: " + name + "\nkey: " + key + "\nbirthday: " + dt1.format(date);
        }
        else{
            return "Формата с таким номером не существует";
        }
    }
}
