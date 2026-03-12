package com.example.quiz_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuizController {

    @GetMapping("/quiz")
    public String getQuiz() {
        return "Quiz Service Working";
    }
}