package org.example;

import java.util.HashMap;
import java.util.Map;

public class OrderMapRepo implements OrderRepo{

    Map<Integer, Order> orders = new HashMap<>();

    @Override
    public Order getOrders(int orderId) {
        return orders.get(orderId);
    }

    @Override
    public void addOrder(Order order) {
        this.orders.put(order.id(), order);
    }

    @Override
    public void removeOrder(Order order) {
        this.orders.remove(order);
    }

    @Override
    public Order getOrder(Order findOrder) {
        return findOrder;
    }

    @Override
    public Map<String, Order> getAll() {
        return null;
    }


}
