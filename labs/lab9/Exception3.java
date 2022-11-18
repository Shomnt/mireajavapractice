package labs.lab9;

import java.util.Scanner;

public class Exception3 {
    public static void main(String[] args){
        exceptionDemo();
    }

    public static void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        try {
            System.out.println( 2 / i );
        } catch (Error e) {
        } catch (RuntimeException e) {
            System.err.print("На " + i + " делить нельзя");
        }

    }
}
