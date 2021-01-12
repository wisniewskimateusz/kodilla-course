package com.kodilla.good.patterns.challenges.repository;

import com.kodilla.good.patterns.challenges.Product;
import com.kodilla.good.patterns.challenges.User;

import java.time.LocalDateTime;

public interface OrderRepository {
    void createOrder(User user, Product product, LocalDateTime orderDate);
}
