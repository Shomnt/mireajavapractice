package labs.lab15_16.front.parts;

import labs.lab15_16.back.Drink;
import labs.lab15_16.back.Order;

import javax.swing.*;

public class OrderUI extends JPanel {
    public OrderUI(Order order){
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        var items = order.getItems();
        for (var item : items) {
            JLabel l = new JLabel(item.getName() + "\t: " + order.itemQuantity(item));
            StringBuilder sb = new StringBuilder();
            if (item instanceof Drink) {
                sb.append("Тип: ").append(((Drink) item).getType()).append("\nАлкоголя: ").append(((Drink) item).getAlcoholVol()).append("\n");
            }
            sb.append(item.getDescription());
            l.setToolTipText(sb.toString());
            add(l);
        }
    }
}
