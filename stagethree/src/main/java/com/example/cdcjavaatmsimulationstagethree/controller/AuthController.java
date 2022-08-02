package com.example.cdcjavaatmsimulationstagethree.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {
    @SuppressWarnings("SpringMVCViewInspection")
    @GetMapping
    public String showLoginPage() {
        return "auth/login";
    }
}
