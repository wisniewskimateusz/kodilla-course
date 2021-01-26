package com.kodilla.good.patterns.food2door.producer;

import com.kodilla.good.patterns.food2door.Storage;
import com.kodilla.good.patterns.food2door.model.Product;

import java.util.List;

public class ExtraFoodShop implements ProducerService {

    private List<Product> extraFoodProductsList = Storage.extraFoodShopProductsList;

    @Override
    public boolean process(Product product) {
        return extraFoodProductsList.stream()
                .anyMatch(p -> p.getProductName()
                        .equals(product.getProductName()) && p.getQuantity() >= product.getQuantity());
    }

    public List<Product> getExtraFoodProductList() {
        return extraFoodProductsList;
    }
}
