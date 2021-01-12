package com.kodilla.good.patterns.challenges.repository;

import com.kodilla.good.patterns.challenges.Product;
import com.kodilla.good.patterns.challenges.User;

import java.time.LocalDateTime;

public class OrderRepositoryImp implements OrderRepository {
    @Override
    public void createOrder(User user, Product product, LocalDateTime orderDate) {
        System.out.println("New Order for: " + user.getFirstName() + " " + user.getLastName()
                + " product: " + product.getName() + " " + product.getPrice()
                + " date: " + orderDate.toString());
    }
}
