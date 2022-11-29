package labs.lab12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task2_3 {
    public static void main(String[] args){
        String text = "29/02/2001";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        try {
            format.parse(text);
            System.out.println("True");
        } catch (ParseException e) {
            System.out.println("False");
        }
    }
}
