package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        User user = new User("Pablo", "Escobar");

        Product product = new Product("T-Shirt", 19, 12.00);

        LocalDateTime orderDate = LocalDateTime.of(2021, 1, 11, 16, 14);

        return new OrderRequest(user, product ,orderDate);
    }

    public OrderRequest retrieve1() {
        User user = new User("Jan", "Nowak");

        Product product = new Product("Pants", 11, 1);

        LocalDateTime orderDate = LocalDateTime.of(2021, 1, 11, 16, 14);

        return new OrderRequest(user, product ,orderDate);
    }
}
