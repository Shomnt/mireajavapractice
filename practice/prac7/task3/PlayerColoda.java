package practice.prac7.task3;

import java.util.Deque;
import java.util.LinkedList;

public class PlayerColoda {
    private Deque<Integer> deck = new LinkedList<>();

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

    public Deque<Integer> getDeck() {
        return deck;
    }
}
