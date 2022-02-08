package com.example.mad2.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class UserController {
    private final UserService USER_SERVICE = new UserService(new UserRepository());

@PostMapping("/registerUser")
    public String registerUser(WebRequest webRequest){
    String email = webRequest.getParameter("email");
    String username = webRequest.getParameter("username");
    String pw = webRequest.getParameter("pw");
    String confirmpw = webRequest.getParameter("pwConfirm");

    USER_SERVICE.createUser(email, username, pw,confirmpw);

    return "redirect:/";
}

}
