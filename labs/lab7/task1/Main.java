package labs.lab7.task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> subjects = new ArrayList<String>();

        subjects.add("Программирование на языке Java");
        subjects.add("СИАОД");
        subjects.add("Иностранный язык");
        subjects.add("Архитектура вычислительных машин и систем");
        subjects.add("Вычислительная математика");
        subjects.add("Конфигурационное управление");
        subjects.add("Математический анализ 3 семестр");
        subjects.add("Философия");
        subjects.add(2, "Французский язык");

        System.out.println(subjects.get(2));
        System.out.println(subjects.get(4));
        System.out.println();
        subjects.set(6, "Математический анализ 2 семестр");

        System.out.printf("В списке %d элементов \n", subjects.size());
        System.out.println();
        for(String state : subjects){
            System.out.println(state);
        }
        System.out.println();
        if(subjects.contains("Философия")){

            System.out.println("Список содержит предмет философия");
        }
        System.out.println();
        subjects.remove("Философия");
        subjects.remove(0);

        Object[] countries = subjects.toArray();

        for(Object country : countries){
            System.out.println(country);
        }
    }
}
