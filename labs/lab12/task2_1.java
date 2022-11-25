package labs.lab12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task2_1 {
    public static void main(String[] args){
        String pattern = "\\d+(?:\\.\\d+)?\\x20+(?:RUВ|USD|EU|\\$)";
        String text = "500.99 RUB";
        Pattern pattern_1 = Pattern.compile(pattern);
        Matcher matcher = pattern_1.matcher(text);
        while(matcher.find()){
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }
}
