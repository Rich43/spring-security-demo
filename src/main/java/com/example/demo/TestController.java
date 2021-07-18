package com.example.demo;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Secured("ROLE_USER")
public class TestController {
    @GetMapping("/hello")
    public String test() {
        return "Hello World";
    }
}
