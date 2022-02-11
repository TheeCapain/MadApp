package com.example.mad2.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;


@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepositoryInterface userRepositoryInterface;

    public UserController(UserRepositoryInterface userRepositoryInterface){
        this.userRepositoryInterface = userRepositoryInterface;
    }

    @PostMapping("/registerUser")
    public User registerUser(@RequestBody User user) throws URISyntaxException {
        System.out.println("user generated" + user);
        return userRepositoryInterface.save(user);
    }

}
