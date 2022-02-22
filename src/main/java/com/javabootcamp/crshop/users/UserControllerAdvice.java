package com.javabootcamp.crshop.users;

import com.javabootcamp.crshop.MessageResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class UserControllerAdvice {

    @ExceptionHandler(UserNotFoundException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public MessageResponse userNotFound(UserNotFoundException e){
        return new MessageResponse("User : "+e.getMessage()+" not found");
    }

}
