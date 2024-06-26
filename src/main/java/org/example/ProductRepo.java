package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProductRepo {

    List<Product> products = new ArrayList<>();

    public ProductRepo(List<Product> products) {
        this.products = products;
    }

    public ProductRepo() {
    }

    public List<Product> getProducts() {
        return products;
    }

    public Product getProduct(Product findProduct) {
        for (Product product : this.products) {
            if (product.equals(findProduct)) {
                return findProduct;
            }
        }
        return null;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductRepo that = (ProductRepo) o;
        return Objects.equals(products, that.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products);
    }

    @Override
    public String toString() {
        return "ProductRepo{" +
                "products=" + products +
                '}';
    }

    public void removeProduct(Product product) {
        this.products.remove(product);
    }

    public void removeProducts() {
        this.products = null;
    }
}
