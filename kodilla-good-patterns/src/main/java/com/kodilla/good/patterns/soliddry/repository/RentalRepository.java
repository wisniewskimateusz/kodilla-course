package com.kodilla.good.patterns.soliddry.repository;

import com.kodilla.good.patterns.soliddry.User;

import java.time.LocalDateTime;

public interface RentalRepository {
    void createRental(User user, LocalDateTime from, LocalDateTime to);
}
