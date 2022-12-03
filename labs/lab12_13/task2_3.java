package labs.lab12_13;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class task2_3 {
    public static void main(String[] args){
        String text = "20/02/2012";
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        try {
            format.parse(text);
            System.out.println("True");
        } catch (ParseException e) {
            System.out.println("False");
        }
    }
}
