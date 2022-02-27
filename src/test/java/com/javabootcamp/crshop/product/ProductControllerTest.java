package com.javabootcamp.crshop.product;

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
class ProductControllerTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @MockBean
    private ProductService productService;

    @Test
    @DisplayName("Requset product name = producttest with success ")
    void findProductByname_with_success() {
        //Arrange
        Product product = new Product();
        product.setName("producttest");
        product.setDescription("producttest description");
        product.setPrice(200F);
        product.setQuantity(10);
        when(productService.findProductByName("producttest")).thenReturn(product);
        //Act
        Product result = testRestTemplate.getForObject("/api/product/producttest",Product.class);
        //Assert
        assertEquals(product,result);
    }

    @Test
    @DisplayName("Requset product name = producttest with failure ")
    void findProductByname_with_failure() {
        //Arrange
        Product product = new Product();
        product.setName("producttest");
        product.setDescription("producttest description");
        product.setPrice(200F);
        product.setQuantity(10);
        when(productService.findProductByName("producttest")).thenReturn(product);
        //Act
        Product result = testRestTemplate.getForObject("/api/product/producttest",Product.class);
        //Assert
        assertEquals(product,result);
    }

    @Test
    @DisplayName("Requset All Product with success ")
    void findAllProduct_with_success() {
        //Arrange
        Product product = new Product();
        product.setName("producttest");
        product.setDescription("producttest description");
        product.setPrice(200F);
        product.setQuantity(10);
        List<Product> productList = new ArrayList<Product>();
        productList.add(product);
        when(productService.findProductAll()).thenReturn(productList);
        //Act
        List<Product> result = testRestTemplate.getForObject("/api/product", ArrayList.class);
        //Assert
        assertEquals("[{id=null, name=producttest, urlImg=null, quantity=10, price=200.0, description=producttest description}]",result.toString());
    }

    @Test
    @DisplayName("Requset All Product with failure ")
    void findAllProduct_with_failure() {
        //Arrange
        List<Product> productList = new ArrayList<Product>();
        //Act
        List<Product> result = testRestTemplate.getForObject("/api/product", ArrayList.class);
        //Assert
        assertEquals(productList , result);
    }
}