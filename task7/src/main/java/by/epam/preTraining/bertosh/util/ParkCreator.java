package by.epam.preTraining.bertosh.util;

import by.epam.preTraining.bertosh.model.Airplane;
import by.epam.preTraining.bertosh.model.VehiclesPark;

public class ParkCreator {

    private static VehiclesPark park = new VehiclesPark(2);

    private static Airplane plane1 = new Airplane(1800, 1100, 230, "Як-130");
    private static Airplane plane2 = new Airplane(2300, 900, 230, "Boeing 777");
    private static Airplane plane3 = new Airplane(1000, 600, 150, "TU-134");
    private static Airplane plane4 = new Airplane(560, 770, 160, "TU-154");
    private static Airplane plane5 = new Airplane(400, 700, 160, "TU-154");

    public static VehiclesPark createPark() {
        park.addVehicleToPark(plane1);
        park.addVehicleToPark(plane2);
        park.addVehicleToPark(plane3);
        park.addVehicleToPark(plane4);
        park.addVehicleToPark(plane5);
        return park;
    }
}
