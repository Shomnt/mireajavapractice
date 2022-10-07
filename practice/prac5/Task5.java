package practice.prac5;

import java.io.IOException;
//number 13
public class Task5 {
    public static void recursion() throws IOException {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        if(n != 0){
            System.out.println(n);
            int m = in.nextInt();
            if(m != 0){
                recursion();
            }

        }


    }

    public static void main(String[] args) throws IOException {

        recursion();
    }
}
