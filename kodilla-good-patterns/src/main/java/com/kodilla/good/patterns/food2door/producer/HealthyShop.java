package com.kodilla.good.patterns.food2door.producer;

import com.kodilla.good.patterns.food2door.Storage;
import com.kodilla.good.patterns.food2door.model.Product;

import java.util.List;

public class HealthyShop implements ProducerService {
    private List<Product> healthyProductsList = Storage.healthyShopProductsList;

    @Override
    public boolean process(Product product) {
        return healthyProductsList.stream()
                .anyMatch(p -> p.getProductName()
                        .equals(product.getProductName()) && p.getQuantity() >= product.getQuantity());
    }

    public List<Product> getHealthyProductList() {
        return healthyProductsList;
    }
}
