package com.javabootcamp.crshop.users;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @Test
    @DisplayName("Find User By Name with success")
    void findUserByName() {
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
        when(userRepository.findByName("testuser")).thenReturn(Optional.of(user));
        // Act
        UserService userService = new UserService();
        userService.setUserRepository(userRepository);
        User result = userService.findUserByName("testuser");
        //Assert
        assertEquals(user,result);
    }

}