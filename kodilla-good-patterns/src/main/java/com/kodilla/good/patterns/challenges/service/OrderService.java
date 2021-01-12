package com.kodilla.good.patterns.challenges.service;

import com.kodilla.good.patterns.challenges.Product;
import com.kodilla.good.patterns.challenges.User;
import java.time.LocalDateTime;

public interface OrderService {
    boolean order(User user, Product product, LocalDateTime date);
}