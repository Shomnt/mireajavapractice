package labs.lab1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num;
        num = console.nextInt();

        garmonik a = new garmonik(num);

        a.printgarm();
    }
}
