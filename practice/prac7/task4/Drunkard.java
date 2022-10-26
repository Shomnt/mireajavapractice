package practice.prac7.task4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class Drunkard extends JFrame implements ActionListener {

    //********************
    JFrame frame = new JFrame();
    int deckSize = 5;
    int step = 0;
    JPanel RulesPanel = new JPanel(new BorderLayout(0,0));
    JMenuBar menuBar = new JMenuBar();
    JPanel MainGameButtonsPanel = new JPanel();
    JPanel MainGameVisualPanel = new JPanel();
    JLabel deck_1 = new JLabel("Your cards count: N/A |||");
    JLabel deck_2 = new JLabel("Enemy cards count: N/A");
    PlayerColoda Playerdeck = new PlayerColoda();
    PlayerColoda Enemydeck = new PlayerColoda();
    ArrayList<Integer> draw = new ArrayList<Integer>();
    JLabel card1 = new JLabel();
    JLabel card2 = new JLabel();
    JLabel winner = new JLabel();
    JButton OpenCard = new JButton("Открыть карту");
    //********************

    public Drunkard(){
        frame.setTitle("Пьяница");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout());
        menuBar.add(createPlayMenu());
        frame.setJMenuBar(menuBar);
        frame.setPreferredSize(new Dimension(400, 400));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);

        RulesCreate();
        MainGameCreate();
        CreateMainGameVisual();
    }



    private JMenu createPlayMenu(){

        JMenu play = new JMenu("Играть");
        JMenuItem maingame = new JMenuItem("Основная игра");
        JMenuItem rules = new JMenuItem("Правила");
        JMenuItem exit = new JMenuItem("Выход");

        maingame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Clean();
                frame.getContentPane().add(MainGameVisualPanel, BorderLayout.CENTER);
                MainGameVisualPanel.setVisible(true);
                MainGameButtonsPanel.setVisible(true);
                frame.show();
            }
        });

        rules.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Clean();
                frame.getContentPane().add(RulesPanel, BorderLayout.CENTER);
                RulesPanel.setVisible(true);
                frame.show();
            }
        });

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Exit();
            }
        });

        play.add(maingame);
        play.add(rules);
        play.add(exit);
        play.addSeparator();

        return play;
    }


    public void MainGameCreate(){
        JButton Start = new JButton("Старт");
        JButton Stop = new JButton("Прервать игру");

        Start.setEnabled(true);
        Stop.setEnabled(false);
        OpenCard.setEnabled(false);


        Start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Start.setEnabled(false);
                Stop.setEnabled(true);
                OpenCard.setEnabled(true);
                Game();
            }
        });
        Stop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Start.setEnabled(true);
                Stop.setEnabled(false);
                OpenCard.setEnabled(false);
                Stop();
            }
        });
        OpenCard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Open();
            }
        });

        MainGameButtonsPanel.add(Start);
        MainGameButtonsPanel.add(Stop);
        MainGameButtonsPanel.add(OpenCard);
        MainGameButtonsPanel.setVisible(false);
        frame.getContentPane().add(MainGameButtonsPanel, BorderLayout.PAGE_START);

    }


    public void CreateMainGameVisual(){
        card1.setOpaque(true);
        card2.setOpaque(true);

        card1.setText("NON");
        card2.setText("NON");

        card1.setBounds(95, 120, 100, 130);
        card2.setBounds(205, 120, 100, 130);

        card1.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        card2.setBorder(BorderFactory.createLineBorder(Color.GRAY));

        card1.setHorizontalAlignment(SwingConstants.CENTER);
        card2.setHorizontalAlignment(SwingConstants.CENTER);

        card1.setVerticalAlignment(SwingConstants.CENTER);
        card2.setVerticalAlignment(SwingConstants.CENTER);

        card1.setFont(new Font("times new roman", Font.PLAIN, 45));
        card2.setFont(new Font("times new roman", Font.PLAIN, 45));

        card1.setBackground(new Color(135, 133, 133));
        card2.setBackground(new Color(135, 133, 133));

        card1.setVisible(false);
        card2.setVisible(false);

        frame.add(card1);
        frame.add(card2);

        winner.setBounds(175, 80, 60, 10);

        winner.setVisible(false);

        frame.add(winner);

        MainGameVisualPanel.add(deck_1, BorderLayout.WEST);
        MainGameVisualPanel.add(deck_2, BorderLayout.EAST);

        MainGameVisualPanel.setVisible(false);
        frame.getContentPane().add(MainGameVisualPanel, BorderLayout.CENTER);

    }

    public void Game(){
        for(int i = 0; i<=9; i++){
            draw.add(i);
        }

        Playerdeck = RandomColoda(Playerdeck);
        Enemydeck = RandomColoda(Enemydeck);

        deck_1.setText("Your cards count: "+ Playerdeck.getSize() + " |||");
        deck_2.setText("Enemy cards count: "+ Enemydeck.getSize());

        card1.setVisible(true);
        card2.setVisible(true);
    }

    public void Stop(){
        Playerdeck.clear();
        Enemydeck.clear();

        deck_1.setText("Your cards count: N/A |||");
        deck_2.setText("Enemy cards count: N/A");

        step = 0;

        draw.clear();

        card1.setVisible(false);
        card2.setVisible(false);

        winner.setVisible(false);

        winner.setText("");

    }

    public void Open(){
        step++;

        card1.setText(Integer.toString(Playerdeck.lookTopCard()));
        card2.setText(Integer.toString(Enemydeck.lookTopCard()));

        if(srav(Playerdeck.lookTopCard(), Enemydeck.lookTopCard()) == 1){
            if(step % 2 == 1){
                Playerdeck.add_bottom(Playerdeck.lookTopCard());
                Playerdeck.add_bottom(Enemydeck.lookTopCard());
            }
            else{
                Playerdeck.add_bottom(Enemydeck.lookTopCard());
                Playerdeck.add_bottom(Playerdeck.lookTopCard());

            }

            Playerdeck.del();
            Enemydeck.del();
        }
        else if(srav(Playerdeck.lookTopCard(), Enemydeck.lookTopCard()) == -1){
            if(step % 2 == 1){
                Enemydeck.add_bottom(Playerdeck.lookTopCard());
                Enemydeck.add_bottom(Enemydeck.lookTopCard());

            }
            else{
                Enemydeck.add_bottom(Enemydeck.lookTopCard());
                Enemydeck.add_bottom(Playerdeck.lookTopCard());
            }

            Playerdeck.del();
            Enemydeck.del();
        }
        deck_1.setText("Your cards count: "+ Playerdeck.getSize() + " |||");
        deck_2.setText("Enemy cards count: "+ Enemydeck.getSize());

        if(Playerdeck.getDeck().empty()){
            winner.setText("You won");
            winner.setVisible(true);
            OpenCard.setEnabled(false);
        }
        if(Enemydeck.getDeck().empty()){
            winner.setText("You lost");
            winner.setVisible(true);
            OpenCard.setEnabled(false);
        }
        if(step == 106){
            winner.setText("Draw");
            winner.setVisible(true);
            OpenCard.setEnabled(false);
        }
    }


    public PlayerColoda RandomColoda(PlayerColoda deck){
        Random random = new Random();

        for (int i = 0; i < deckSize; i++){
            int placeholder = random.nextInt(draw.size());
            int num = draw.get(placeholder);
            draw.remove(placeholder);
            deck.add_bottom(num);
        }
        return deck;
    }

    public void RulesCreate(){
        JLabel RulesText = new JLabel();

        RulesText.setFont(new Font("times new roman", Font.PLAIN, 17));

        RulesText.setText("<html><div WIDTH=%d><center>Карточная игра“ В пьяницу”. В этой игре карточная колода раздается " +
                "поровну двум игрокам. Далее они открывают по одной верхней карте, и тот, чья" +
                "карта старше, забирает себе обе открытые карты, которые кладутся под низ его" +
                "колоды. Тот, кто остается без карт, - проигрывает.</center></div></html>");

        RulesPanel.add(RulesText, BorderLayout.CENTER);
        RulesPanel.setLocation(250, 100);
        RulesPanel.setVisible(false);
        frame.getContentPane().add(RulesPanel, BorderLayout.CENTER);
    }


    public void Exit(){
        System.exit(0);
    }

    public void Clean(){
        RulesPanel.setVisible(false);
        MainGameButtonsPanel.setVisible(false);
        MainGameVisualPanel.setVisible(false);
        frame.show();
    }

    public static int srav(int a, int b){
        if(a == 0 && b == 9) return 1;
        else if (a == 9 && b == 0) return -1;

        return Integer.compare(a, b);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}