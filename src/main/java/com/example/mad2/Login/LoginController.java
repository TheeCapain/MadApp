package com.example.mad2.Login;

import com.example.mad2.User.User;
import com.example.mad2.User.UserRepository;
import com.example.mad2.User.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;


@Controller
public class LoginController {
    private final UserService USER_SERVICE = new UserService(new UserRepository());

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/home")
    public String login(WebRequest webRequest) {

        return "/home";
        /*
               String email = webRequest.getParameter("name");
        String pw = webRequest.getParameter("password");

        User user = USER_SERVICE.readUser(email, pw);
        if (user != null ){
            webRequest.setAttribute("user",user,WebRequest.SCOPE_SESSION);
            return "home";
        }

        return "redirect:/";
         */
    }


}
