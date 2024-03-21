package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ShopService {

    OrderListRepo orderListRepo;

    public ShopService(OrderListRepo orderListRepo) {
        this.orderListRepo = orderListRepo;
    }

    public ShopService() {
    }

    public OrderListRepo getOrderListRepo() {
        return orderListRepo;
    }

    public void setOrderListRepo(OrderListRepo orderListRepo) {
        this.orderListRepo = orderListRepo;
    }

    public void addNewOrder(OrderListRepo orderListRepo) {
        List<Order> newOrders = new ArrayList<>();
        for (Order order : orderListRepo.getOrders()) {
            for (Order orderFromObject : this.orderListRepo.getOrders()) {
                if (order.productRepo().products.equals(orderFromObject.productRepo().products)) {
                    System.out.println("order existed");
                    newOrders.add(order);
                } else {
                    System.out.println("order not existed");
                }
            }
        }
        this.orderListRepo.addOrder(newOrders);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShopService that = (ShopService) o;
        return Objects.equals(orderListRepo, that.orderListRepo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderListRepo);
    }

    @Override
    public String toString() {
        return "ShopService{" +
                "orderListRepo=" + orderListRepo +
                '}';
    }
}
