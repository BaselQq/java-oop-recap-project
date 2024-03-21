package org.example;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public record Order(int id, ProductRepo productRepo, LocalDate date) {

    @Override
    public int id() {
        return id;
    }

    @Override
    public ProductRepo productRepo() {
        return productRepo;
    }

    @Override
    public LocalDate date() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id && Objects.equals(productRepo, order.productRepo) && Objects.equals(date, order.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productRepo, date);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", productRepo=" + productRepo +
                ", date=" + date +
                '}';
    }
}
