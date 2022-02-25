package com.javabootcamp.crshop.basket;


import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasketService {

    @Autowired
    private BasketRepository basketRepository;

    public void setBasketRepository(BasketRepository basketRepository) {
        this.basketRepository = basketRepository;
    }

    public List<Basket> findBasketByUserId(Long userId){
        List<Basket> result = basketRepository.findByuserId(userId);
        if(result.isEmpty()) {
            throw new BasketNotFoundException(userId.toString());
        }
        return result;
    }

    public Basket addProductToBasket(@NotNull Basket basket){
        Basket result = basketRepository.save(basket);
        return result;
    }


}
