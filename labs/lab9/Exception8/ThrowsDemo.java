package labs.lab9.Exception8;

import java.util.Scanner;

public class ThrowsDemo {
    public static void getKey() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter Key ");
        String key = myScanner.nextLine();
        try{
            printDetails(key);
        }catch (Exception e){
            System.out.println("Error, try again");
            getKey();
        }

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