package by.epam.preTraining.bertosh.logic;

import by.epam.preTraining.bertosh.model.Vehicle;

public class Sorter {

    public static Vehicle[] bubbleSortByMaxSpeed(Vehicle[] vehicles) {
        for (int i = 0; i < vehicles.length; i++) {
            for (int j = 0; j < vehicles.length - i - 1; j++) {
                if (vehicles[j].getMaxSpeed() > vehicles[j + 1].getMaxSpeed()) {
                    Vehicle temp = vehicles[j];
                    vehicles[j] = vehicles[j + 1];
                    vehicles[j + 1] = temp;
                }
            }
        }
        return vehicles;
    }
}
