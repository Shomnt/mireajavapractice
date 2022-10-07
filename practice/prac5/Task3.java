package practice.prac5;

import java.io.IOException;

//number 11
public class Task3 {
    public static int recursion(int n, int i){
        if(n == 0){
            return i;
        }else{
            return recursion(n/10, i*10 + n%10);
        }
    }

    public static void main(String[] args) throws IOException {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();

        System.out.println(recursion(n, 0));
    }
}
