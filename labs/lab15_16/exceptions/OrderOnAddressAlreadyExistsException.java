package labs.lab15_16.exceptions;

import labs.lab15_16.back.Address;

public class OrderOnAddressAlreadyExistsException extends IllegalArgumentException {
    Address address;
    public OrderOnAddressAlreadyExistsException(Address address) {
        super("Заказ на адрес "+address.toString()+" уже обрабатывается!");
    }
}
