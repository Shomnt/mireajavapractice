package labs.lab15_16.front;

import labs.lab15_16.front.parts.GeneralMenu;
import labs.lab15_16.front.parts.OrderPane;

import javax.swing.*;
import java.awt.*;

public class InternetUserWindow extends JFrame {

    public InternetUserWindow(){
        setSize(710, 360);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setTitle("Меню интернет магазина");
        var op = new OrderPane(-1);
        getContentPane().add(op, BorderLayout.CENTER);
        var save = new JButton("Сохранить");
        save.addActionListener(e->{
            String [][] ord = new String[op.getTabCount()-1][];
            for(int i = 0; i < op.getTabCount()-1; i++){
                ord[i] = ((OrderPane.MenuItemPanel)op.getComponentAt(i)).getData();
            }
            Controller.getInstance().addOrder(ord);
        });
        getContentPane().add(save, BorderLayout.SOUTH);

        setJMenuBar(new GeneralMenu(this, new JMenu[0]));
    }

    public String[] askCustomer(){
        String [] res = new String[9];
        res[0] = JOptionPane.showInputDialog("Ваше имя: ");
        res[1] = JOptionPane.showInputDialog("Ваша фамилия: ");
        res[2] = JOptionPane.showInputDialog("Ваш возраст: ");
        res[3] = JOptionPane.showInputDialog("Город вашего проживания: ");
        res[4] = JOptionPane.showInputDialog("Зип код вашего проживания: ");
        res[5] = JOptionPane.showInputDialog("Улица вашего проживания: ");
        res[6] = JOptionPane.showInputDialog("Дом вашего проживания: ");
        res[7] = JOptionPane.showInputDialog("Буква дома вашего проживания: ");
        res[8] = JOptionPane.showInputDialog("Квартира вашего проживания: ");
        return res;
    }
}
