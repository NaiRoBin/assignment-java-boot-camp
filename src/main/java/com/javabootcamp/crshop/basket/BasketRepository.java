package com.javabootcamp.crshop.basket;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BasketRepository extends JpaRepository<Basket,Long> {

    List<Basket> findByuserId(Long userId);

}
