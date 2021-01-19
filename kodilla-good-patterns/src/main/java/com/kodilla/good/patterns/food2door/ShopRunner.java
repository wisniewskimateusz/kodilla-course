package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.model.Order;
import com.kodilla.good.patterns.food2door.producer.ExtraFoodShop;
import com.kodilla.good.patterns.food2door.producer.GlutenFreeShop;
import com.kodilla.good.patterns.food2door.producer.HealthyShop;
import com.kodilla.good.patterns.food2door.producer.ProducerService;

import java.util.ArrayList;
import java.util.List;

public class ShopRunner {
    public static void main(String[] args) {
        OrderRequest orderRequest = new OrderRequest();
        Order order1 = orderRequest.order1();
        Order order2 = orderRequest.order2();
        Order order3 = orderRequest.order3();

        printOrder(orderRequest);

        ProducerService producerService = new GlutenFreeShop();
        OrderProcessor orderProcessor = new OrderProcessor(producerService);

        //procesuje wg. GlutenFreeShop
        System.out.println("----GlutenFreeShop----");
        orderProcessor.execute(order1);

        //procesuje wg. ExtraFoodShop
        System.out.println("----ExtraFoodShop----");
        orderProcessor.setProducerService(new ExtraFoodShop());
        orderProcessor.execute(order2);

        //procesuje wg. HealthyShop
        System.out.println("----HealthyShop----");
        orderProcessor.setProducerService(new HealthyShop());
        orderProcessor.execute(order3);
    }

    public static void printOrder(OrderRequest orderRequest) {
        List<Order> orders = new ArrayList<>();
        orders.add(orderRequest.order1());
        orders.add(orderRequest.order2());
        orders.add(orderRequest.order3());
        orders.forEach(System.out::println);
        System.out.println();
    }
}