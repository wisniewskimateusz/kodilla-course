package com.kodilla.good.patterns.challenges;

public class OrderDto {

    private User user;
    private Product product;
    private boolean ordered;

    public OrderDto(User user, Product product, boolean ordered) {
        this.user = user;
        this.product = product;
        this.ordered = ordered;
    }
}
