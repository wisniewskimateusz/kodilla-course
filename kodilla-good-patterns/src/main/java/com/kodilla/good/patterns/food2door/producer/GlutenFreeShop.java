package com.kodilla.good.patterns.food2door.producer;

import com.kodilla.good.patterns.food2door.Storage;
import com.kodilla.good.patterns.food2door.model.Product;

import java.util.List;

public class GlutenFreeShop implements ProducerService {

    private List<Product> glutenFreeProductsList = Storage.glutenFreeShopProductsList;

    @Override
    public boolean process(Product product) {
        return glutenFreeProductsList.stream()
                .anyMatch(p -> p.getProductName()
                        .equals(product.getProductName()) && p.getQuantity() >= product.getQuantity());
    }

    public List<Product> getGlutenFreeProductList() {
        return glutenFreeProductsList;
    }
}
