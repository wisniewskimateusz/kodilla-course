package com.kodilla.good.patterns.food2door.producer;

import com.kodilla.good.patterns.food2door.Storage;
import com.kodilla.good.patterns.food2door.model.Product;

import java.util.List;

public class GlutenFreeShop implements ProducerService {

    private List<Product> glutenFreeProductsList = Storage.glutenFreeShopProductsList;

    @Override
    public boolean process(Product product) {
        for (int i = 0; i < glutenFreeProductsList.size(); i++) {
            if (getGlutenFreeProductList().get(i).getProductName().equals(product.getProductName())) {
                if (getGlutenFreeProductList().get(i).getQuantity() >= product.getQuantity()) {
                    return true;
                }
            }
        }
        return false;
    }

    public List<Product> getGlutenFreeProductList() {
        return glutenFreeProductsList;
    }
}
