package com.example.attempt_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AttemptController {

    @GetMapping("/attempt")
    public String attempt() {
        return "Attempt Service Working";
    }

}