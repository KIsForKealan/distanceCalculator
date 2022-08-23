package com.app.distanceCalculator.utilities;

public class ConversionConstants {

    public static double YARDS_TO_METERS = 0.91444;
    public static double METERS_TO_YARDS = 1.09361;

    public static double retrieveDistanceConstant(EUnitOfDistance from, EUnitOfDistance to) {
        if (from.equals(EUnitOfDistance.METERS) && to.equals(EUnitOfDistance.YARDS) ) {
            return METERS_TO_YARDS;
        }
        if (from.equals(EUnitOfDistance.YARDS) && to.equals(EUnitOfDistance.METERS) ) {
            return YARDS_TO_METERS;
        }
        return 1;
    }

}
