package practice.prac7.task4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Drunkard extends JFrame implements ActionListener {
    //********************
    JFrame frame = new JFrame();
    JPanel RulesPanel = new JPanel(null);
    JMenuBar menuBar = new JMenuBar();
    JPanel MainGameButtonsPanel = new JPanel(null);
    JPanel MainGameVisualPanel = new JPanel(null);
    //********************





    public Drunkard(){
        frame.setTitle("Пьяница");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        menuBar.add(createPlayMenu());
        frame.setJMenuBar(menuBar);
        frame.setPreferredSize(new Dimension(800, 800));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);
        RulesCreate();
    }



    private JMenu createPlayMenu(){

        JMenu play = new JMenu("Играть");
        JMenuItem maingame = new JMenuItem("Основная игра");
        JMenuItem rules = new JMenuItem("Правила");
        JMenuItem modelgame = new JMenuItem("Моделировать игру");
        JMenuItem exit = new JMenuItem("Выход");

        maingame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainGame();
            }
        });

        rules.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RulesPanel.setVisible(true);
                frame.show();
            }
        });

        modelgame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ModelGame();
            }
        });

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Exit();
            }
        });

        play.add(maingame);
        play.add(modelgame);
        play.add(rules);
        play.add(exit);
        play.addSeparator();
        return play;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public void MainGame(){
        Clean();
        JButton Start = new JButton("Старт");
        JButton Stop = new JButton("Прервать игру");
        JButton OpenCard = new JButton("Открыть карту");

    }

    public void ModelGame(){

    }

    public void Game(){

    }

    public void RulesCreate(){
        JLabel RulesText = new JLabel();
        RulesText.setFont(new Font("times new roman", Font.PLAIN, 17));
        RulesText.setText("<html>Карточная игра “ В пьяницу”. В этой игре карточная колода раздается<br/>" +
                "поровну двум игрокам. Далее они открывают по одной верхней карте, и тот, чья" +
                "карта старше, забирает себе обе <br/>открытые карты, которые кладутся под низ его" +
                "колоды. Тот, кто остается <br/>без карт, - проигрывает.</html>");
        RulesText.setBounds(250, 100, 300, 300);
        RulesPanel.setBounds(250, 100, 300, 300);
        RulesPanel.add(RulesText);
        frame.add(RulesPanel);
        RulesPanel.setVisible(false);
    }

    public void Exit(){
        System.exit(0);
    }

    public void Clean(){
        RulesPanel.setVisible(false);
        frame.show();
    }
}
