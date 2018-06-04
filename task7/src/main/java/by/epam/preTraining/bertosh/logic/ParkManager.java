package by.epam.preTraining.bertosh.logic;

import by.epam.preTraining.bertosh.model.Vehicle;
import by.epam.preTraining.bertosh.model.VehiclesPark;
import by.epam.preTraining.bertosh.util.Util;

public class ParkManager {

    private String managerId;
    public VehiclesPark park;

    public ParkManager(String managerId, VehiclesPark park) {
        this.managerId = managerId;
        this.park = park;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public VehiclesPark getPark() {
        return park;
    }

    public void setPark(VehiclesPark park) {
        this.park = park;
    }

    public Vehicle findTheFastestCraft(VehiclesPark park) {
        Vehicle maxSpeedVehicle = Util.findMaxSpeedVehicle(park);
        return maxSpeedVehicle;
    }

}
