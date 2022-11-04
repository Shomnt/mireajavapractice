package labs.lab8;

import java.io.FileWriter;
import java.util.Scanner;

public class Write {
    public static void main(String[] args) throws Exception {

        FileWriter fw = new FileWriter("test.txt");
        Scanner scanner = new Scanner(System.in);
        String data;
        do{
            data = scanner.nextLine();
            fw.write(data);
            fw.write("\n");
        }while(!data.equals(""));
        fw.close();

    }
}
