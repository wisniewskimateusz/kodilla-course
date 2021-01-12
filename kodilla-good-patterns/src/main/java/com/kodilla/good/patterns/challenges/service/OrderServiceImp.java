package com.kodilla.good.patterns.challenges.service;

import com.kodilla.good.patterns.challenges.Product;
import com.kodilla.good.patterns.challenges.User;

import java.time.LocalDateTime;

public class OrderServiceImp implements OrderService {
    public boolean order(final User user, final Product product, final LocalDateTime orderDate) {
        System.out.println("Order for: " + user.getFirstName() + " " + user.getLastName()
                + " product: " + product.getName() + " price: " + product.getPrice()
                + " date: " + orderDate.toString());

        return true;
    }
}
