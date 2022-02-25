package com.javabootcamp.crshop.basket;

public class BasketNotFoundException extends RuntimeException {
    public BasketNotFoundException(String userId) {
        super(userId);
    }
}
