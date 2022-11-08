package practice.prac9;

public class Person {
    private String first_name;
    private String second_name;
    private String inn;

    public Person(String first_name, String second_name, String inn){
        this.first_name = first_name;
        this.second_name = second_name;
        this.inn = inn;
    }

    public String getInn() {
        return inn;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getSecond_name() {
        return second_name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "first_name='" + first_name + '\'' +
                ", second_name='" + second_name + '\'' +
                ", inn='" + inn + '\'' +
                '}';
    }
}
