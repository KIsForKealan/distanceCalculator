package com.app.distanceCalculator.services;

import com.app.distanceCalculator.entities.DistanceEntity;
import com.app.distanceCalculator.utilities.ConversionDelegate;
import com.app.distanceCalculator.utilities.EUnitOfDistance;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class AddDistanceService {

    public DistanceEntity addDistances(DistanceEntity[] distances) {
        double total = 0;
        for (int i=0; i<distances.length; i++) {
            total += distances[i].getValue();
        }
        return new DistanceEntity(total);
    }

//    public DistanceEntity addDistances(DistanceEntity[] distances, EUnitOfDistance unit) {
//        double total = 0;
//
//        for (int i=0; i<distances.length; i++) {
//            if (distances[i].getUnit() != unit) {
//                distances[i] = ConversionDelegate.convertTo(distances[i], unit);
//            }
//            total += distances[i].getValue();
//        }
//
//        return new DistanceEntity(total, unit);
//    }

}