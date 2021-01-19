package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.model.Product;

import java.util.Arrays;
import java.util.List;

public class Storage {
    public static List<Product> glutenFreeShopProductsList = Arrays.asList(
            new Product("Gluten Free Product 1", 0),
            new Product("Gluten Free Product 2", 24),
            new Product("Gluten Free Product 3", 54)
    );

    public static List<Product> extraFoodShopProductsList = Arrays.asList(
            new Product("Extra Food Product 1", 45),
            new Product("Extra Food Product 2", 40),
            new Product("Extra Food Product 3", 60)
    );

    public static List<Product> healthyShopProductsList = Arrays.asList(
            new Product("Healthy Shop Product 1", 70),
            new Product("Healthy Shop Product 2", 40),
            new Product("Healthy Shop Product 3", 50)
    );
}