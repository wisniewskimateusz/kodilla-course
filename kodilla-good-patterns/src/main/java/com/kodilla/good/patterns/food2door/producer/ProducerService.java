package com.kodilla.good.patterns.food2door.producer;

import com.kodilla.good.patterns.food2door.model.Product;

public interface ProducerService {
    boolean process(Product product);
}