package practice.prac4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton addScoreMilan;
    JButton addScoreMadrid;
    JLabel gameScore;
    JLabel lastScorer;
    Label winner;
    int scoreMilan = 0;
    int scoreMadrid = 0;
    MyFrame(){

        addScoreMilan = new JButton();
        addScoreMilan.setText("AC Milan");
        addScoreMilan.setBounds(0, 0, 100, 50);
        addScoreMilan.addActionListener(this);

        addScoreMadrid = new JButton();
        addScoreMadrid.setText("Real Madrid");
        addScoreMadrid.setBounds(100, 0, 100, 50);
        addScoreMadrid.addActionListener(this);

        gameScore = new JLabel();
        gameScore.setText("Result: " + scoreMilan + " X " + scoreMadrid);
        gameScore.setBounds(0, 50, 100, 50);

        lastScorer = new JLabel();
        lastScorer.setText("Last Scorer: N/A");
        lastScorer.setBounds(0, 100, 200, 50);

        winner = new Label();
        winner.setText("Winner: DRAW");
        winner.setBounds(0, 150, 200, 50);


        this.setTitle("AC Milan X Real Madrid");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 250);
        this.setLayout(null);
        this.setVisible(true);
        this.setResizable(false);
        this.add(addScoreMilan);
        this.add(addScoreMadrid);
        this.add(gameScore);
        this.add(lastScorer);
        this.add(winner);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == addScoreMilan){
            scoreMilan++;
            lastScorer.setText("Last Scorer: AC Milan");
        }
        if(e.getSource() == addScoreMadrid){
            scoreMadrid++;
            lastScorer.setText("Last Scorer: Real Madrid");
        }
        gameScore.setText("Result: " + scoreMilan + " X " + scoreMadrid);
        if(scoreMilan > scoreMadrid) winner.setText("Winner: AC Milan");
        else if(scoreMilan < scoreMadrid) winner.setText("Winner: Real Madrid");
        else winner.setText("Winner: DRAW");
    }
}
