package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();

        Product handy = new Product(1, "IPhone", 199.9, 0.2);
        Product notebook = new Product(2, "Lenovo", 499.9, 1.5);
        Product tabak = new Product(3, "Original Choice", 23.4, 0.1);
        Product monitor = new Product(4, "Samsung", 23.4, 0.1);

        List<Product> products1 = new ArrayList<>();
        products1.add(handy);
        products1.add(notebook);

        List<Product> products2 = new ArrayList<>();
        products2.add(tabak);
        products2.add(monitor);

        ProductRepo productRepo1 = new ProductRepo(products1);
        ProductRepo productRepo2 = new ProductRepo(products2);

        Order order1 = new Order(1, productRepo1, date);
        Order order2 = new Order(2, productRepo2, date);

        List<Order> orders = new ArrayList<>();
        orders.add(order1);
        orders.add(order2);

        OrderListRepo orderListRepo = new OrderListRepo(orders);

        // System.out.println(orderListRepo);

        ShopService shopService = new ShopService(orderListRepo);

//        System.out.println(shopService);

        // new Order - cuz of new order ids
        Order newOrder = new Order(5, productRepo1, date);
        Order newOrder1 = new Order(6, productRepo2, date);

        List<Order> orders1 = new ArrayList<>();
        orders1.add(newOrder);
        orders1.add(newOrder1);

        OrderListRepo orderListRepo1 = new OrderListRepo(orders1);

        System.out.println(shopService);
        shopService.addNewOrder(orderListRepo1);
        System.out.println(shopService);

    }
}