package org.example;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private User user;
    private List<Product> products = new ArrayList<>();

    private Order(User user, List<Product> products) {
        this.user = user;
        this.products.addAll(products);
    }

    public static Order createOrder(User user, List<Product> products) {
        return new Order(user, products);
    }

    public List<Product> getProducts() {
        return products;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "Order{" +
                "user=" + user +
                ", products=" + products +
                '}';
    }
}
