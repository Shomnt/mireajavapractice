package practice.prac7.task4;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                new Drunkard();
            }
        });
    }
}
