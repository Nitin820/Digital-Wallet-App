package Com.orderprocessing;

import java.time.LocalDate;
import java.util.List;

public class Order {
    private int orderId;
    private LocalDate orderDate;
    private double totalPrice;
    private List<String> items;

    public Order(int orderId, LocalDate orderDate, double totalPrice, List<String> items) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.totalPrice = totalPrice;
        this.items = items;
    }

    public int getOrderId() {
        return orderId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public List<String> getItems() {
        return items;
    }

    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderDate=" + orderDate +
                ", totalPrice=" + totalPrice +
                ", items=" + items +
                '}';
    }
}
