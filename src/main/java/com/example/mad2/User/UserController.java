package com.example.mad2.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {

    @Autowired
    UserRepositoryInterface userRepositoryInterface;

    @PostMapping("/registerUser")
    @ResponseStatus(HttpStatus.CREATED)
    public User registerUser(@RequestBody User user) {
        System.out.println(user);
        return userRepositoryInterface.save(user);
    }

}
