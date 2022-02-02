package com.example.mad2.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

@GetMapping("/registerUser")
    public String registerUser(){
    return "/registerUser";
}


}
