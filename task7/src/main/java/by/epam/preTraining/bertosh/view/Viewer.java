package by.epam.preTraining.bertosh.view;

import by.epam.preTraining.bertosh.model.Vehicle;
import by.epam.preTraining.bertosh.model.VehiclesPark;

public class Viewer {

    public static void showAllVehicles(VehiclesPark park) {
        for (Vehicle vehicle : park.getVehicles()) {
            System.out.println(vehicle);
        }
    }

    public static void showVehicle(Vehicle vehicle) {
        System.out.println(vehicle);
    }
}
