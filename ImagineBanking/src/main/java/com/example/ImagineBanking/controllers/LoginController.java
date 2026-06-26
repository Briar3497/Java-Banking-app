package com.example.ImagineBanking.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // Do not use @RestController here
public class LoginController {

    @GetMapping("/")
    public String viewLogin() {
        return "login";
    }

}

