package labs.lab12;

import java.lang.reflect.Array;
import java.util.Arrays;

public class task1 {
    public static void main(String[] args){
        String text = "2e2e2 33535 tgege ewgfqw3q";
        String[] result = text.split("\\W+");
        System.out.println(Arrays.toString(result));
    }
}
