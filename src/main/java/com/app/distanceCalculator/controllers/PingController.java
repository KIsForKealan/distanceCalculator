package com.app.distanceCalculator.controllers;

import com.app.distanceCalculator.services.PingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

    @Autowired
    PingService service;

    public PingController(PingService service) {
        this.service = service;
    }

    @GetMapping("/ping")
    public String ping() {
        return service.retrievePing();
    }

}
