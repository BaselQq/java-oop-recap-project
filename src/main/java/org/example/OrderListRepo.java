package org.example;

import java.util.List;
import java.util.Objects;

public class OrderListRepo {

    private List<Order> orders;

    public OrderListRepo(List<Order> orders) {
        this.orders = orders;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public Order getProduct(Order findOrder) {
        for (Order order : this.orders) {
            if (order.equals(findOrder)) {
                return findOrder;
            }
        }
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderListRepo that = (OrderListRepo) o;
        return Objects.equals(orders, that.orders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orders);
    }

    @Override
    public String toString() {
        return "OrderListRepo{" +
                "orders=" + orders +
                '}';
    }

    public void removeProduct(Order order) {
        this.orders.remove(order);
    }

    public void removeProducts() {
        this.orders = null;
    }
}
