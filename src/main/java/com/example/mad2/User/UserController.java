package com.example.mad2.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class UserController {
    UserService userService = new UserService();

@GetMapping("/registerUser")
    public String registerUser(Model model, WebRequest webRequest){
    String email = webRequest.getParameter("email");
    String username = webRequest.getParameter("username");
    String pw = webRequest.getParameter("pw");
    String confirmpw = webRequest.getParameter("pw-confirm");

    User user = new User(username,email,pw);
    userService.createUser(user,confirmpw);


    return "/registerUser";
}


}
