package com.kodilla.good.patterns.food2door.model;

public class Product {

    private String productName;
    private int quantity;

    public Product(String productName, int quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "" + productName + " | Quantity: " + quantity;
    }
}
