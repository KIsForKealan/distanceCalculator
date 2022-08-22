package com.app.distanceCalculator.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class pingController {

    @GetMapping("/ping")
    public String ping() {
        final String dateFormat = "yyyy-MM-dd HH:mm:ss";
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(dateFormat));
    }

}
