package by.epam.preTraining.bertosh.controller;

import by.epam.preTraining.bertosh.logic.ParkManager;
import by.epam.preTraining.bertosh.model.VehiclesPark;
import by.epam.preTraining.bertosh.util.ParkCreator;
import by.epam.preTraining.bertosh.view.Viewer;

public class Controller {

    public static void main(String... args) {
        ParkCreator creator = new ParkCreator();
        VehiclesPark park = creator.createPark();
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
        System.out.println("Adding vehicles to queue");
        manager.addVehicleToQueue(park.getVehicles()[0]);
        manager.addVehicleToQueue(park.getVehicles()[1]);
        manager.addVehicleToQueue(park.getVehicles()[2]);
        System.out.println("Getting vehicles from queue");
        Viewer.showVehicle(manager.getFromQueue());
        Viewer.showVehicle(manager.getFromQueue());
        Viewer.showVehicle(manager.getFromQueue());

        System.out.println("======");
        System.out.println("Adding vehicles to stack");
        manager.pushVehicleToStack(park.getVehicles()[0]);
        manager.pushVehicleToStack(park.getVehicles()[1]);
        manager.pushVehicleToStack(park.getVehicles()[2]);
        System.out.println("Getting vehicles from stack");
        Viewer.showVehicle(manager.popVehicleFromStack());
        Viewer.showVehicle(manager.popVehicleFromStack());
        Viewer.showVehicle(manager.popVehicleFromStack());
    }
}
