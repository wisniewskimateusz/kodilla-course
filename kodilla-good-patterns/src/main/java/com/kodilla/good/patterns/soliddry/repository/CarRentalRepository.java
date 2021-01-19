package com.kodilla.good.patterns.soliddry.repository;

import com.kodilla.good.patterns.soliddry.User;

import java.time.LocalDateTime;

public class CarRentalRepository implements RentalRepository {
    @Override
    public void createRental(User user, LocalDateTime from, LocalDateTime to) {
        System.out.println("New Rent for: " + user.getName() + " " + user.getSurname()
                + " from: " + from.toString() + " to: " + to.toString());
    }
}