package labs.lab7.task2;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> subjects = new LinkedList<String>();

        subjects.add("Программирование на языке Java");
        subjects.add("СИАОД");
        subjects.add("Иностранный язык");
        subjects.add("Архитектура вычислительных машин и систем");
        subjects.add("Вычислительная математика");
        subjects.add("Конфигурационное управление");
        subjects.add("Математический анализ 3 семестр");
        subjects.add("Философия");
        subjects.add(2, "Французский язык");

        System.out.printf("В списке %d элементов \n", subjects.size());
        System.out.println();
        System.out.println(subjects.get(1));
        subjects.set(2, "Французский язык");
        System.out.println();
        for(String state : subjects){
            System.out.println(state);
        }
        System.out.println();
        if(subjects.contains("Французский язык")){
            System.out.println("Список содержит предмет Французский язык");
        }
        System.out.println();
        subjects.remove("Математический анализ 3 семестр");
        subjects.removeFirst();
        subjects.removeLast();
        for(String state : subjects){
            System.out.println(state);
        }
    }
}

