package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.model.Order;
import com.kodilla.good.patterns.food2door.producer.ProducerService;

public class OrderProcessor {

    private ProducerService producerService;
    private Storage storage;

    public OrderProcessor(ProducerService producerService) {
        this.producerService = producerService;
    }

    public boolean execute(Order order) {
        boolean isProductExist = producerService.process(order.getProduct());
        if (isProductExist) {
            System.out.println("Zamówiono: " + order);
        } else {
            System.out.println("Produkt nie istnieje lub jego ilość jest mała.");
        }
        //return producerService.process(order.getProduct());
        return false;
    }

    public ProducerService getProducerService() {
        return producerService;
    }

    public void setProducerService(ProducerService producerService) {
        this.producerService = producerService;
    }
}