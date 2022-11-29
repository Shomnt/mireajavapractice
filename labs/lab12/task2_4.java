package labs.lab12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task2_4 {
    public static void main(String[] args){
        String stringpatern = "^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$";
        String text = "@my.ru";
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
