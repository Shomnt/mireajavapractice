package practice.prac11_12.task1;

import java.util.Objects;

public class Person {

    private final String first_name;
    private final String second_name;
    private final String third_name;

    public Person(String first_name, String second_name, String third_name){
        this.first_name = first_name;
        this.second_name = second_name;
        this.third_name = third_name;
    }
    public Person(String first_name, String second_name){
        this.first_name = first_name;
        this.second_name = second_name;
        this.third_name = "";
    }
    public Person(String first_name){
        this.first_name = first_name;
        this.second_name = "";
        this.third_name = "";
    }

    public String get_fio(){
        if(Objects.equals(third_name, "") && Objects.equals(second_name, "")){
            return first_name;
        }
        else if (Objects.equals(third_name, "")){
            return first_name + " " + second_name;
        }
        else{
            return first_name + " " + second_name + " " + third_name;
        }

    }

}
