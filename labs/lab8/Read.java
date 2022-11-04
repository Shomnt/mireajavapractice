package labs.lab8;

import java.io.FileReader;
import java.util.Scanner;

public class Read {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("test.txt");
        Scanner scan = new Scanner(fr);
        while(scan.hasNextLine()){
            System.out.println(scan.nextLine());
        }
        fr.close();
    }
}
