package labs.lab10.task4;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        List<File> list = new ArrayList<>();

        File dir = new File("C:\\Users\\lesha\\IdeaProjects\\mireajavapractice\\practice\\prac3\\task4");
        if(dir.isDirectory()){
            for(File item : dir.listFiles()){
                list.add(item);
            }
        }
        for (File file : list) {
            System.out.println(file.getName());
        }
    }

}
