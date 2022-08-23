package com.app.distanceCalculator.services;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class PingService {

    public PingService() {
    }

    public String retrievePing() {
        final String dateFormat = "yyyy-MM-dd HH:mm:ss";
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(dateFormat));
    }
}
