package by.epam.preTraining.bertosh.logic;

import by.epam.preTraining.bertosh.model.Airplane;
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

    public static Airplane[] insertionSortByMaxSpeed(Airplane[] airplanes) {
        for(int i = 1; i < airplanes.length; i++){
            for(int j = i; j > 0 && airplanes[j - 1].getMaxSpeed() > airplanes[j].getMaxSpeed(); j--) {
                Airplane tmp = airplanes[j - 1];
                airplanes[j - 1] = airplanes[j];
                airplanes[j] = tmp;
            }
        }
        return airplanes;
    }

    public static Airplane[] selectionSortByMaxSpeed(Airplane[] airplanes) {
        for (int min = 0; min < airplanes.length - 1; min++){
            int least = min;
            for (int j = min + 1; j < airplanes.length; j++){
                if (airplanes[least].getMaxSpeed() > airplanes[j].getMaxSpeed()){
                    least = j;
                }
            }
            Airplane tmp = airplanes[min];
            airplanes[min] = airplanes[least];
            airplanes[least] = tmp;
        }
        return airplanes;
    }
}
