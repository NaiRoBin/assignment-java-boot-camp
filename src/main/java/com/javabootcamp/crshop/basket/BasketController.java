package com.javabootcamp.crshop.basket;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BasketController {

    @Autowired
    BasketService basketService;

    @PostMapping("/api/basket/add")
    public ResponseEntity<Basket> addProductToBasket(Basket basket){
        Basket result = basketService.addProductToBasket(basket);
        return new ResponseEntity<Basket>(result, HttpStatus.OK);
    }

    @GetMapping("/api/basket/{Id}")
    public ResponseEntity<Object> findBasketByUserId(@PathVariable Long Id){
        //Long num = Long.parseLong(Id);
        List<Basket> basketList = basketService.findBasketByUserId(Id);
        return new ResponseEntity<Object>(basketList,HttpStatus.OK);
    }

}
