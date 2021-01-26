package com.kodilla.good.patterns.food2door.model;

public class Order {
    private User user;
    private String producer;
    private Product product;
    private String orderNumber;

    public Order(User user , String producer , Product product, String orderNumber) {
        this.user = user;
        this.producer = producer;
        this.product = product;
        this.orderNumber = orderNumber;
    }

    public User getUser() {
        return user;
    }

    public String getProducer() {
        return producer;
    }

    public Product getProduct() {
        return product;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    @Override
    public String toString() {
        return "User: " + user + " | Producer: " + producer + " | Product: " + product + " | Order number: " + orderNumber;
    }
}