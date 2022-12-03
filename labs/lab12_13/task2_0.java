package labs.lab12_13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task2_0 {
    public static void main(String[] args){
        String stringpatern = "abcdefghijklmnopqrstuv18340";
        String text = "abcdefgyhijklmnopqrstuv18340";
        Pattern pattern = Pattern.compile(stringpatern);

        Matcher matcher = pattern.matcher(text);
        if(matcher.find()){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
