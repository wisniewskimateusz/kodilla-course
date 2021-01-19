package com.kodilla.good.patterns.food2door.producer;

import com.kodilla.good.patterns.food2door.Storage;
import com.kodilla.good.patterns.food2door.model.Product;

import java.util.List;

public class ExtraFoodShop implements ProducerService {

    private List<Product> extraFoodProductsList = Storage.extraFoodShopProductsList;

    @Override
    public boolean process(Product product) {
        for (int i = 0; i < extraFoodProductsList.size(); i++) {
            if (getExtraFoodProductList().get(i).getProductName().equals(product.getProductName())) {
                if (getExtraFoodProductList().get(i).getQuantity() >= product.getQuantity()) {
                    return true;
                }
            }
        }
        return false;
    }

    public List<Product> getExtraFoodProductList() {
        return extraFoodProductsList;
    }
}
