package com.spring_messaging_app.uc2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// Indicates that this class is a Spring MVC controller
@RestController
public class HelloController {

    // Maps HTTP GET requests to /hello to this method
    @GetMapping("/hello")
    public String hello() {
        // Returns a simple greeting message
        return "Hello from BridgeLabz";
    }

    // Maps HTTP GET requests to /query to this method
    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public String hello(@RequestParam(value = "name") String name) {
        return "Hello " + name + " !";
    }
}