package com.example.ImagineBanking.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @GetMapping("/user")
    public String showHomeScreen() {
        return "user";
    }

    @PostMapping("/user")
    public String saveUser(@RequestParam String username, Model model) {
        model.addAttribute("savedUsername", username);
        return "user";
    }
}
