package com.javabootcamp.crshop.users;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class UserControllerTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @MockBean
    private UserService userService;

    @Test
    @DisplayName("Requset naem = testname with success ")
    void findUserByName_with_success() {
        //Arrange
        User user = new User();
        user.setName("testname");
        user.setEmail("test@gmail.com");
        user.setUsername("testname");
        user.setAddress("99/99");
        user.setPhone("091-234-5678");
        user.setDistrict("บางแค");
        user.setProvince("กรุงเทพมหานคร");
        user.setZipcode("10160");
        when(userService.findUserByName("testname")).thenReturn(user);
        //Act
        User result = testRestTemplate.getForObject("/api/user/testname",User.class);
        //Assert
        assertEquals(user,result);
    }

    @Test
    @DisplayName("Requset naem = testname with failure ")
    void findUserByName_with_failure() {

        //Act
        User result = testRestTemplate.getForObject("/api/user/testname",User.class);
        //Assert
        assertEquals(null,result);
    }
}