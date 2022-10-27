package labs.lab5;

import javax.swing.*;
import java.awt.*;

public class MyDrawPanel extends JPanel {
    public void paintComponent (Graphics g) {
        Image image = new ImageIcon("image/cat.jpg").getImage();
        g.drawImage(image, 3, 4, this);
    }
}