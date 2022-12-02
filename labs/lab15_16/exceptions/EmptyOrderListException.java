package labs.lab15_16.exceptions;

public class EmptyOrderListException extends NullPointerException {
    public EmptyOrderListException(){
        super("Нет ни одного заказа!");
    }
}
