package labs.lab15_16.exceptions;


import labs.lab15_16.back.Customer;
import labs.lab15_16.back.Drink;

public class AddingAlcoholForNotMatureCustomerException extends labs.lab15_16.exceptions.AlcoholForNotMatureCustomerException {
    public AddingAlcoholForNotMatureCustomerException(Customer c, Drink alcoholable) {
        super(c, alcoholable);
    }

    @Override
    public String getMessage() {
        return super.getMessage() + "Элемент не добавлен в заказ.";
    }
}
