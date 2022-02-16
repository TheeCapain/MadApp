package com.example.mad2.Grocery;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class GroceryController {

    @PostMapping("addGrocery")
    public String addGrocery(WebRequest webRequest) {
        return "redirect:/profile";
    }

}
