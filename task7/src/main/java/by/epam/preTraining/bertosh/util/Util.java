package by.epam.preTraining.bertosh.util;

import by.epam.preTraining.bertosh.model.Vehicle;
import by.epam.preTraining.bertosh.model.VehiclesPark;

public class Util {

    public static Vehicle findMaxSpeedVehicle(VehiclesPark park) {
        Vehicle maxSpeedVehicle = park.getVehicles()[0];
        if (maxSpeedVehicle != null) {
            for (Vehicle vehicle : park.getVehicles()) {
                if (vehicle.getMaxSpeed() > maxSpeedVehicle.getMaxSpeed()) {
                    maxSpeedVehicle = vehicle;
                }
            }
            return maxSpeedVehicle;
        } else {
            return null;
        }
    }
}
