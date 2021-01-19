package com.kodilla.good.patterns.soliddry.service;

import com.kodilla.good.patterns.soliddry.User;

public class MailService implements InformationService {
    @Override
    public void inform(User user) {
        System.out.println("Information send to - " + user.getName() + " " + user.getSurname());
    }
}
