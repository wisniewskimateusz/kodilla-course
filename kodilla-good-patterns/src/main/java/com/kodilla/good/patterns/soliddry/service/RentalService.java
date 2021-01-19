package com.kodilla.good.patterns.soliddry.service;

import com.kodilla.good.patterns.soliddry.User;

import java.time.LocalDateTime;

public interface RentalService {
    boolean rent(User user, LocalDateTime from, LocalDateTime to);
}
