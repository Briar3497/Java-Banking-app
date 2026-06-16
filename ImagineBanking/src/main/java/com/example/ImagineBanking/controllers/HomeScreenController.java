package com.example.ImagineBanking.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeScreenController {

    @GetMapping("/home")
    public String showHomeScreen() {
        return "homescreen";
    }
}
