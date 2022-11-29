package practice.prac8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Capacity boundedList:");
        int capacity = scanner.nextInt();
        BoundedWaitList b = new BoundedWaitList(capacity);
        for(int i = 0; i < capacity; i++){
            b.add(i);
        }
        b.add(100);
        System.out.println(b);

        UnfairWaitList u = new UnfairWaitList();
        for(int i = 0; i < capacity; i++){
            u.add(i);
        }
        System.out.println(u);
        u.remove(3);
        System.out.println(u);
        u.add(3);
    }
}
