package labs.lab9.Exception7;

import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() throws Exception {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter Key ");
        String key = myScanner.nextLine();
        printDetails(key);
    }

    public static void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private static String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }
}