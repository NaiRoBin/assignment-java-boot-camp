package com.javabootcamp.crshop.product;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("api/product/{name}")
    public ResponseEntity<Product> findProductByname (@PathVariable String name){
        Product product;
        product = productService.findProductByName(name);
        return new ResponseEntity<Product>(product, HttpStatus.OK);
    }

    @GetMapping("api/product")
    public ResponseEntity<Object> findAllProduct(){
        List<Product> products;
        products = productService.findProductAll();
        return new ResponseEntity<Object>(products,HttpStatus.OK);

    }

}
