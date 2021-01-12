package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.repository.OrderRepositoryImp;
import com.kodilla.good.patterns.challenges.service.MailService;
import com.kodilla.good.patterns.challenges.service.OrderServiceImp;
import com.kodilla.good.patterns.challenges.service.ProductOrderService;

public class Application {

    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(
                new MailService(), new OrderServiceImp(), new OrderRepositoryImp());
        productOrderService.process(orderRequest);
    }
}
