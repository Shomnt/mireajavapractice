package labs.lab15_16.back;


public interface OrdersManager {
    int itemsQuantity(String itemName);
    int itemsQuantity(MenuItem item);
    Order[] getOrders();
    double ordersCostSummary();
    int ordersQuantity();
}
