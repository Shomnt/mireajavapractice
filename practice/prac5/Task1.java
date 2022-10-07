package practice.prac5;

import java.io.IOException;

//number 9
public class Task1 {
    public static int recursion(int a, int b){
        if (a > b + 1) {
            return 0;
        }
        if (a == 0 || b == 0) {
            return 1;
        }
        return recursion(a, b - 1) + recursion(a - 1, b - 1);
    }

    public static void main(String[] args) throws IOException {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println(recursion(a, b));
    }
}
