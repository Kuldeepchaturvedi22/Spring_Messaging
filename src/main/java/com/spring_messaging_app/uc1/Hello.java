package com.spring_messaging_app.uc1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Indicates that this class is a Spring MVC controller
@RestController
public class Hello {

    // Maps HTTP GET requests to /hello to this method
    @GetMapping("/hello")
    public String hello() {
        // Returns a simple greeting message
        return "Hello from BridgeLabz";
    }
}