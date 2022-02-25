package com.javabootcamp.crshop.product;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;

    @Test
    @DisplayName("FindByName with success")
    void findByName() {
        // Arrange
        Product product = new Product();
        product.setName("productTetst");
        product.setDescription("productTest description");
        product.setPrice(200F);
        product.setQuantity(10);
        productRepository.save(product);
        // Act
        Optional<Product> result = productRepository.findByName("productTetst");
        // Assert
        assertTrue(result.isPresent());

    }

    @Test
    @DisplayName("FindByName with failure")
    void findByName_with_failure() {
        // Act
        Optional<Product> result = productRepository.findByName("productTetst");
        // Assert
        assertFalse(result.isPresent());

    }
}