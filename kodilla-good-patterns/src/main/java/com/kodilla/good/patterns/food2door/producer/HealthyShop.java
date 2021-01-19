package com.kodilla.good.patterns.food2door.producer;

import com.kodilla.good.patterns.food2door.Storage;
import com.kodilla.good.patterns.food2door.model.Product;

import java.util.List;

public class HealthyShop implements ProducerService {
    private List<Product> healthyProductsList = Storage.healthyShopProductsList;

    @Override
    public boolean process(Product product) {
        for (int i = 0; i < healthyProductsList.size(); i++) {
            if (getHealthyProductList().get(i).getProductName().equals(product.getProductName())) {
                if (getHealthyProductList().get(i).getQuantity() >= product.getQuantity()) {
                    return true;
                }
            }
        }
        return false;
    }

    public List<Product> getHealthyProductList() {
        return healthyProductsList;
    }
}
