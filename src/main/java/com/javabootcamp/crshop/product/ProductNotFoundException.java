package com.javabootcamp.crshop.product;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(String name) {
        super(name);
    }
}
