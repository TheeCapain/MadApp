package com.example.mad2.Login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.request.WebRequest;


@Controller
public class LoginController {


    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/login")
    public String login(WebRequest webRequest){
        String email = webRequest.getParameter("name");
        String pw = webRequest.getParameter("password");



        return "/main";
    }
}
