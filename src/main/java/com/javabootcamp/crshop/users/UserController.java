package com.javabootcamp.crshop.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("api/hello/{name}")
    public UserResponse findUserByName(@PathVariable String name) {return new UserResponse(userService.concatData(name));};

    @GetMapping("api/user/{name}")
    public ResponseEntity<User> findUserJsonByName(@PathVariable String name){
        User user;
        user = userService.findUserByName(name);
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }


}
