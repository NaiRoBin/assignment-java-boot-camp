package com.javabootcamp.crshop.users;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    @DisplayName("FindByName with success")
    void findByName() {
        // Arrange
        User user = new User();
        user.setName("testuser");
        user.setEmail("test@gmail.com");
        user.setUsername("testuser");
        user.setAddress("99/99");
        user.setPhone("091-234-5678");
        user.setDistrict("บางแค");
        user.setProvince("กรุงเทพมหานคร");
        user.setZipcode("10160");
        userRepository.save(user);
        // Act
        Optional<User> result = userRepository.findByName("testuser");
        // Assert
        assertTrue(result.isPresent());

    }
    @Test
    @DisplayName("FindByName with failure")
    void findByName_with_failure() {
        // Act
        Optional<User> result = userRepository.findByName("testuser");
        // Assert
        assertFalse(result.isPresent());

    }
}