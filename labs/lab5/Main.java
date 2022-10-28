package labs.lab5;


import javax.swing.*;

public class Main {
    public static void main (String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new JLabel(new ImageIcon(args[0])));
        frame.show();
    }


}
