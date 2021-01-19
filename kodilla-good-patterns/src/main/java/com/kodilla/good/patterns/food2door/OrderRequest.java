package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.model.Order;
import com.kodilla.good.patterns.food2door.model.Product;
import com.kodilla.good.patterns.food2door.model.User;

public class OrderRequest {

    public Order order1() {
        User user = new User("Jan", "Kowalski");
        String productName = "Gluten Free Product 1";
        String orderNumber = "1";
        int value = 32;
        String producer = "Gluten Free Shop";
        Product product = new Product(productName , value);
        return new Order(user , producer , product, orderNumber);
    }
    public Order order2() {
        User user = new User("Janusz", "Rutka");
        String productName = "Extra Food Product 2";
        String orderNumber = "2";
        int value = 13;
        String producer = "Extra Food Shop";
        Product product = new Product(productName , value);
        return new Order(user , producer , product, orderNumber);
    }

    public Order order3() {
        User user1 = new User("Tomasz", "Nowak");
        String productName = "Healthy Shop Product 3";
        String orderNumber = "3";
        int value = 21;
        String producer = "Healthy Shop";
        Product product = new Product(productName , value);
        return new Order(user1 , producer , product, orderNumber);
    }
}
