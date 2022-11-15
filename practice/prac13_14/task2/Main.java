package practice.prac13_14.task2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        System.out.println("Формат ввода: dd-MM-yyyy");
        DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        String date = formatter.format(new Date());
        Scanner scanner = new Scanner(System.in);
        String date_2;
        date_2 = scanner.nextLine();
        if(date.equals(date_2)){
            System.out.println("Даты совпадают");
        }
        else{
            System.out.println("Даты не совпадают");
        }
    }
}
