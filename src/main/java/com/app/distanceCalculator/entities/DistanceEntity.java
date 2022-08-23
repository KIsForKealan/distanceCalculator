package com.app.distanceCalculator.entities;

import com.app.distanceCalculator.utilities.EUnitOfDistance;

public class DistanceEntity {

    private double value;
    private EUnitOfDistance unit = EUnitOfDistance.METERS;

    public DistanceEntity(double value) {
        this.value = value;
    }

    public DistanceEntity(double value, EUnitOfDistance unit) {
        this.value = value;
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public EUnitOfDistance getUnit() {
        return unit;
    }

    public void setUnit(EUnitOfDistance unit) {
        this.unit = unit;
    }

}