package com.app.distanceCalculator.utilities;

public enum EUnitOfDistance {

    METERS("Meters", "m"),
    YARDS("Yards", "yd");

    public final String fullName;
    public final String shortName;

    EUnitOfDistance(String fullName, String shortName) {
        this.fullName = fullName;
        this.shortName = shortName;
    }

}