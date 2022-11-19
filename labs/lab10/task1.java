package labs.lab10;

import java.util.LinkedList;
import java.util.List;

public class task1 {

    public static List<String> convert(String[] str){
        List<String> list = new LinkedList();
        for(int i=0;i< str.length; i++){
            list.add(str[i]);
        }
        return list;
    }
    public static void main(String[] args){
        String [] str = {"1","2","3","4","5"};

        List<String> list1 = new LinkedList();

        list1 = convert(str);
        for (String s : str) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println(list1);
    }

}
