package practice.prac7.task2;

import java.util.*;

public class PlayerColoda {
    private Queue<Integer> deck = new LinkedList<>();

    public void del(){
        deck.remove();
    }

    public Integer lookTopCard() {
        return deck.peek();
    }

    public void add_bottom(Integer card){
        deck.offer(card);
    }

    public String toString(){
        return "" + deck;
    }

    public Queue<Integer> getDeck() {
        return deck;
    }
}
