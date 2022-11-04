package labs.lab6;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Game extends JFrame{
    JFrame frame = new JFrame();
    JTextField answer = new JTextField(15);
    JButton guess = new JButton();
    public int num;
    Random random = new Random();


    Game(){
        frame.setLayout(null);
        frame.setTitle("Угадай число");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        answer.setToolTipText("Введите число");
        num = random.nextInt(20);
        guess.setText("Угадать");
        guess.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prov();
            }
        });
        guess.setBounds(10, 60, 100, 40);
        answer.setBounds(10, 10, 100, 40);
        frame.add(answer);
        frame.add(guess);
        frame.setSize(160,160);
        frame.setResizable(false);
        frame.setVisible(true);

    }

    public void prov(){
        if(Integer.parseInt(answer.getText()) == num){
            guess.setEnabled(false);
            JOptionPane.showMessageDialog(Game.this, "Вы угадали");
            System.exit(0);
        }
        else if (Integer.parseInt(answer.getText()) > num){
            JOptionPane.showMessageDialog(Game.this, "Ваше число больше загаданного");
        }
        else{
            JOptionPane.showMessageDialog(Game.this, "Ваше число меньше загаданного");
        }
    }



}
