package com.javabootcamp.crshop.product;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    @Test
    @DisplayName("Find Product By Name with success")
    void findProductByName() {
        //Arrange
        Product product = new Product();
        product.setName("mockproduct");
        product.setDescription("mockproduct description");
        product.setPrice(200F);
        product.setQuantity(10);
        when(productRepository.findByName("mockproduct")).thenReturn(Optional.of(product));
        // Act
        ProductService productService = new ProductService();
        productService.setProductRepository(productRepository);
        Product result= productService.findProductByName("mockproduct");
        //Assert
        assertEquals(product,result);
    }

    @Test
    @DisplayName("Find All Product with success")
    void findProductAll() {
        //Arrange
        List<Product> productList = new ArrayList<Product>();
        Product product = new Product();
        product.setName("mockproduct");
        product.setDescription("mockproduct description");
        product.setPrice(200F);
        product.setQuantity(10);
        productList.add(product);

        when(productRepository.findAll()).thenReturn(productList);
        // Act
        ProductService productService = new ProductService();
        productService.setProductRepository(productRepository);
        List<Product> result= productService.findProductAll();
        //Assert
        assertEquals(productList,result);
    }
}