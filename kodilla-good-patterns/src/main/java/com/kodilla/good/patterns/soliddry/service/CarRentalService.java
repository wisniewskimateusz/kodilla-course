package com.kodilla.good.patterns.soliddry.service;

import com.kodilla.good.patterns.soliddry.User;

import java.time.LocalDateTime;

public class CarRentalService implements RentalService {
    @Override
    public boolean rent(User user, LocalDateTime carRentFrom, LocalDateTime carRentTo) {
//        System.out.println("Renting Car for: " + user.getName() + user.getSurname()
//                + " from: " + carRentFrom.toString() + " to: " + carRentTo.toString());
        return true;
    }
}