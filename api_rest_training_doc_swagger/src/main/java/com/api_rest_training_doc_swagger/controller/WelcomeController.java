package com.api_rest_training_doc_swagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class WelcomeController {
    @GetMapping
    public String welcome() {
        return "Welcome to My Spring Boot Web API";
    }
}
