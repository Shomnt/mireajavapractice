package practice.prac5;

import java.io.IOException;
//number 12
public class Task4 {
    public static void recursion() throws IOException {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();

        if (n != 0 && n % 2 == 0){
            recursion();
        }
        else if (n % 2 == 1){

            System.out.println(n);
            recursion();
        }

    }

    public static void main(String[] args) throws IOException {

        recursion();
    }
}
