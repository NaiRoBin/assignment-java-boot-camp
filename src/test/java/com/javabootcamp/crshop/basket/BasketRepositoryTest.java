package com.javabootcamp.crshop.basket;

import com.javabootcamp.crshop.product.Product;
import com.javabootcamp.crshop.product.ProductRepository;
import com.javabootcamp.crshop.users.User;
import com.javabootcamp.crshop.users.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class BasketRepositoryTest {

    @Autowired
    BasketRepository basketRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    ProductRepository productRepository;

    @Test
    void findByuserId() {
        // Arrange
        User user = new User();
        user.setName("pom");
        //user.setId(1L);
        user.setEmail("test@gmail.com");
        user.setUsername("pom");
        user.setAddress("99/99");
        user.setPhone("091-234-5678");
        user.setDistrict("บางแค");
        user.setProvince("กรุงเทพมหานคร");
        user.setZipcode("10160");
        userRepository.save(user);

        Product product = new Product();
        product.setName("product001");
        product.setDescription("product001 description");
        product.setPrice(200F);
        product.setQuantity(10);
        productRepository.save(product);

        Product product2 = new Product();
        product2.setName("product002");
        product2.setDescription("product002 description");
        product2.setPrice(150F);
        product2.setQuantity(10);
        productRepository.save(product);


        Basket basket = new Basket();
        //basket.setName("Basketname1");
        basket.setAmount(1);
        basket.setPrice(product.getPrice());
        basket.setProductId(product.getId());
        basket.setUserId(user.getId());
        basketRepository.save(basket);

        Basket basket2 = new Basket();
        //basket2.setName("Basketname2");
        basket2.setAmount(1);
        basket2.setPrice(product2.getPrice());
        basket2.setProductId(product2.getId());
        basket2.setUserId(user.getId());
        basketRepository.save(basket2);
        // Act
        List<Basket> result = basketRepository.findByuserId(user.getId());
        // Assert
        assertFalse(result.isEmpty());
    }


}