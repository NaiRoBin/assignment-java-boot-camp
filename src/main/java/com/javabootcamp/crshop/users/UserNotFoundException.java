package com.javabootcamp.crshop.users;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String name) {
        super(name);
    }
}
