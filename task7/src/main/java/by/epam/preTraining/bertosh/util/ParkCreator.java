package by.epam.preTraining.bertosh.util;

import by.epam.preTraining.bertosh.model.Airplane;
import by.epam.preTraining.bertosh.model.VehiclesPark;

public class ParkCreator {

    private VehiclesPark park = new VehiclesPark(5);

    private Airplane plane1 = new Airplane(1800, 1100, 230, "Як-130");
    private Airplane plane2 = new Airplane(2300, 900, 230, "Boeing 777");
    private Airplane plane3 = new Airplane(1000, 600, 150, "TU-134");
    private Airplane plane4 = new Airplane(560, 770, 160, "TU-154");
    private Airplane plane5 = new Airplane(400, 700, 160, "TU-154");

    public VehiclesPark createPark() {
        park.addVehicle(plane1);
        park.addVehicle(plane2);
        park.addVehicle(plane3);
        park.addVehicle(plane4);
        park.addVehicle(plane5);
        return park;
    }
}
