package labs.lab12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task2_5 {
    public static void main(String[] args){
        String stringpatern = "(?=^.{8,}$)(?=.*\\d)|(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$";
        String text = "TrySpy1";
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
