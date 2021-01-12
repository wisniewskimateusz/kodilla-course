package com.kodilla.good.patterns.challenges.service;

import com.kodilla.good.patterns.challenges.User;

public class MailService implements InformationService {
    @Override
    public void inform(User user) {
        System.out.println("Information send to - " + user.getFirstName() + " " + user.getLastName());
    }
}