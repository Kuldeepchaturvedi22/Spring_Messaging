package com.spring_messaging_app.uc4;

import org.springframework.web.bind.annotation.*;

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
        // Returns a greeting message with the provided name
        return "Hello " + name + " !";
    }

    // Maps HTTP requests to /param/{name} to this method
    @RequestMapping("/param/{name}")
    public String helloParam(@PathVariable String name) {
        // Returns a greeting message with the provided name from the path variable
        return "Hello " + name + " !";
    }

    // Maps HTTP POST requests to /post to this method
    @PostMapping("/post")
    public String hello(@RequestBody User user) {
        // Returns a greeting message with the provided user's first and last name
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " !";
    }
}