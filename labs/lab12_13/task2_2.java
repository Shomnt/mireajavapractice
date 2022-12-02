package labs.lab12_13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task2_2 {
    public static void main(String[] args){
        String stringpatern = "[0-9]+[ ]*[+]";
        String text = "(1 * 8) – 9 / 4";
        Pattern pattern = Pattern.compile(stringpatern);
        Matcher m = pattern.matcher(text);
        if(m.find()){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
