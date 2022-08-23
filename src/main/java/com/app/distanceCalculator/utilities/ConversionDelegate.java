package com.app.distanceCalculator.utilities;

import com.app.distanceCalculator.entities.DistanceEntity;

import static com.app.distanceCalculator.utilities.ConversionConstants.METERS_TO_YARDS;
import static com.app.distanceCalculator.utilities.ConversionConstants.YARDS_TO_METERS;

public class ConversionDelegate {

    /**
     * Converts Distance Entity to one with another unit, multiplying its value by respective constant.
     * @param distance Distance Entity to be converted.
     * @param unit Target units of distance which the result should be converted to.
     * @return Distance Entity with correct target units and correctly converted value.
     */
    public static DistanceEntity convertTo(DistanceEntity distance, EUnitOfDistance unit) {
        if (distance == null || distance.getUnit() == unit) return distance;
        double unitConstant = retrieveConstantForUnit(unit);
        double convertedValue = distance.getValue() * unitConstant;
        return new DistanceEntity(convertedValue, unit);
    }

    /**
     * Helper method.
     * @param unit Target unit of distance.
     * @return double value for distance conversion constant.
     */
    public static double retrieveConstantForUnit(EUnitOfDistance unit) {
        switch (unit) {
            case METERS -> {
                return YARDS_TO_METERS;
            }
            case YARDS -> {
                return METERS_TO_YARDS;
            }
            default -> {
                System.out.println("Error: Unknown distance units, could not convert : " + unit.toString());
                return 1d;
            }
        }
    }

}
