package practice.prac7.task4;

import java.util.Stack;

public class PlayerColoda {
    private Stack<Integer> deck = new Stack<>();

    public void del(){
        deck.remove(0);
    }

    public Integer lookTopCard() {
        return deck.get(0);
    }

    public void add_bottom(Integer card){
        deck.push(card);
    }

    public String toString(){
        return "" + deck;
    }

    public Stack<Integer> getDeck() {
        return deck;
    }

}
