package labs.lab12_13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task2_4 {
    public static void main(String[] args){
        String stringpatern = "^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$";
        String text = "root@localhost";
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
