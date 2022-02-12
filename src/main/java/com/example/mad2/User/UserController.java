package com.example.mad2.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import java.net.URISyntaxException;



@Controller
public class UserController {

    UserService userService = new UserService(new UserRepository());

    @PostMapping("/registerUser")
    public String registerUser(WebRequest webRequest) throws URISyntaxException {
        String name = webRequest.getParameter("username");
        String email = webRequest.getParameter("email");
        String pw = webRequest.getParameter("pw");
        String pwConfirm = webRequest.getParameter("pwConfirm");

        userService.createUser(name,email,pw,pwConfirm);

        return "redirect:/";
    }

    @GetMapping("profile")
    public String profilePage(){
        return "profile";
    }

}
