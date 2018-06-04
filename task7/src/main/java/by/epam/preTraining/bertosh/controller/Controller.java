package by.epam.preTraining.bertosh.controller;

import by.epam.preTraining.bertosh.logic.ParkManager;
import by.epam.preTraining.bertosh.model.VehiclesPark;
import by.epam.preTraining.bertosh.util.ParkCreator;
import by.epam.preTraining.bertosh.view.Viewer;

public class Controller {

    public static void main(String... args) {
        VehiclesPark park = ParkCreator.createPark();
        ParkManager manager = new ParkManager("1", park);
        Viewer.showAllVehicles(park);

        System.out.println("=========");
        System.out.println("The fastest craft in the park: ");
        Viewer.showVehicle(manager.findTheFastestCraft(park));

        System.out.println("=========");
        System.out.println("The folowing craft was deleted: ");
        Viewer.showVehicle(park.deleteVehicleById(1));

        System.out.println("=========");
        System.out.println("Find Aircraft by ID: ");
        Viewer.showVehicle(park.getVehicleById(1));

        System.out.println("======");
        park.deleteAllVehiclesFromPark(park);
        Viewer.showAllVehicles(park);
    }
}
