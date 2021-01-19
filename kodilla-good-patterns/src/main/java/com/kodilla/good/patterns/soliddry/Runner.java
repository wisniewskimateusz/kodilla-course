package com.kodilla.good.patterns.soliddry;

import com.kodilla.good.patterns.soliddry.repository.CarRentalRepository;
import com.kodilla.good.patterns.soliddry.service.CarRentalService;
import com.kodilla.good.patterns.soliddry.service.MailService;

public class Runner {
    public static void main(String[] args) {
        RentRequestRetriever rentRequestRetriever = new RentRequestRetriever();
        RentRequest rentRequest = rentRequestRetriever.retrieve();

        RentalProcessor rentalProcessor = new RentalProcessor(
                new MailService(), new CarRentalService(), new CarRentalRepository());
        rentalProcessor.process(rentRequest);
    }
}
