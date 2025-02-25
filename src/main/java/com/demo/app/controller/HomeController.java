package com.demo.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    @GetMapping("/home")
    public String showHomePage() {
        return "home"; // Matches /WEB-INF/views/home.jsp
    }
}
