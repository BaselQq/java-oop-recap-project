package org.example;

import java.util.Objects;

public record Product(int id, String name, double price, double sizeInKg) {

    public Product {
    }

    @Override
    public int id() {
        return id;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public double price() {
        return price;
    }

    @Override
    public double sizeInKg() {
        return sizeInKg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && Double.compare(price, product.price) == 0 && Double.compare(sizeInKg, product.sizeInKg) == 0 && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, sizeInKg);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", sizeInKg=" + sizeInKg +
                '}';
    }
}
