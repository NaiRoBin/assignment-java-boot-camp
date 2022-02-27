package com.javabootcamp.crshop.basket;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class BasketControllerTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @MockBean
    private BasketService basketService;

    @Test
    void addProductToBasket() {
        //Arrange
        Basket basket = new Basket();
        basket.setAmount(1);
        basket.setPrice(200F);
        basket.setProductId(1L);
        basket.setUserId(1L);
        when(basketService.addProductToBasket(basket)).thenReturn(basket);
        //Act
        Basket result = testRestTemplate.getForObject("/api/basket/add",Basket.class);
        //Assert
        //assertEquals(basket,result);
    }

    @Test
    @DisplayName("Requset find basket by user id with success ")
    void findBasketByUserId() {
        //Arrange
        Basket basket = new Basket();
        basket.setAmount(1);
        basket.setPrice(200F);
        basket.setProductId(1L);
        basket.setUserId(1L);
        List<Basket> basketList = new ArrayList<Basket>();
        basketList.add(basket);
        when(basketService.findBasketByUserId(1l)).thenReturn(basketList);
        //Act
        List<Basket> result = testRestTemplate.getForObject("/api/basket/1",ArrayList.class);
        //Assert
        assertEquals("[{name=null, userId=1, productId=1, productName=null, amount=1, price=200.0, sumprice=null, id=null}]",result.toString());
    }

    @Test
    @DisplayName("Requset find basket by user id with failure ")
    void findBasketByUserId_with_failure() {
        //Arrange
        List<Basket> basketList = new ArrayList<Basket>();
        //Act
        List<Basket> result = testRestTemplate.getForObject("/api/basket/1",ArrayList.class);
        //Assert
        assertEquals(basketList,result);
    }
}