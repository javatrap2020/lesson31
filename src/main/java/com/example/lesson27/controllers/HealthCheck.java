package com.example.lesson27.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/healths")
public class HealthCheck {

    @GetMapping
    public String status() {
        return "Running";
    }
}
