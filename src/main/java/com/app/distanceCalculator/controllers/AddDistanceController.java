package com.app.distanceCalculator.controllers;

import com.app.distanceCalculator.entities.DistanceEntity;
import com.app.distanceCalculator.services.AddDistanceService;
import com.app.distanceCalculator.utilities.EUnitOfDistance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/add")
public class AddDistanceController {

    @Autowired
    AddDistanceService service;

    @PostMapping
    public DistanceEntity add(@RequestBody DistanceEntity[] distances) {
        return service.addDistances(distances);
    }

    @GetMapping
    public DistanceEntity[] getExampleList() {
        DistanceEntity a = new DistanceEntity(5.5, EUnitOfDistance.METERS);
        DistanceEntity b = new DistanceEntity(4.1, EUnitOfDistance.METERS);
        DistanceEntity[] r = { a, b };
        return r;
    }

    @GetMapping("testresult")
    public DistanceEntity testResult() {
        return new DistanceEntity(5.5, EUnitOfDistance.METERS);
    }

}