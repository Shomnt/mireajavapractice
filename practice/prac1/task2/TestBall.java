package practice.prac1.task2;

import java.lang.*;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(220, 47);
        Ball b2 = new Ball(284, 54);
        Ball b3 = new Ball(340, 59);
        Ball b4 = new Ball(360, 63);
        Ball b5 = new Ball(420);
        Ball b6 = new Ball(1, 3);
        b5.setCircle(69);
        System.out.println(b1);
        b1.findSize();
        b2.findSize();
        b3.findSize();
        b4.findSize();
        b5.findSize();
        b6.findSize();
    }
}
