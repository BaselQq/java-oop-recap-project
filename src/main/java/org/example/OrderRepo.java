package org.example;

import java.util.Map;

public interface OrderRepo {

Order getOrders(int orderId);

void addOrder(Order order);

void removeOrder(Order order);

Order getOrder(Order findOrder);

Map<String, Order> getAll();
}
