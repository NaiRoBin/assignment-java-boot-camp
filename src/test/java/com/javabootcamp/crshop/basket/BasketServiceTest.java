package com.javabootcamp.crshop.basket;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class BasketServiceTest {

    @Mock
    private BasketRepository basketRepository;

    @Test
    @DisplayName("Find Basket By UserId with success")
    void findBasketByUserId() {
        // Arrange
        List<Basket> basketList = new ArrayList<Basket>();
        Basket basket = new Basket();
        basket.setAmount(1);
        basket.setPrice(200F);
        basket.setProductId(1L);
        basket.setUserId(1L);
        basketList.add(basket);
        when(basketRepository.findByuserId(1L)).thenReturn(basketList);
        //Act
        BasketService basketService = new BasketService();
        basketService.setBasketRepository(basketRepository);
        List<Basket> result = basketService.findBasketByUserId(1L);
        //Assert
        assertEquals(basketList,result);
    }

    @Test
    @DisplayName("Add Product to Basket with success")
    void addProductToBasket() {
        // Arrange
        Basket basket = new Basket();
        basket.setAmount(1);
        basket.setPrice(200F);
        basket.setProductId(1L);
        basket.setUserId(1L);
        when(basketRepository.save(basket)).thenReturn(basket);
        //Act
        BasketService basketService = new BasketService();
        basketService.setBasketRepository(basketRepository);
        Basket result = basketService.addProductToBasket(basket);
        //Assert
        assertEquals(basket,result);
    }
}