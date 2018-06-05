package by.epam.preTraining.bertosh.logic;

import by.epam.preTraining.bertosh.model.Vehicle;
import by.epam.preTraining.bertosh.model.VehiclesPark;
import by.epam.preTraining.bertosh.util.Util;

public class ParkManager {

    private String managerId;
    private VehiclesPark park;
    private Stack stack;
    private Queue queue;

    public ParkManager(String managerId, VehiclesPark park) {
        this.managerId = managerId;
        this.park = park;
        stack = new Stack(10);
        queue = new Queue();
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

    public void pushVehicleToStack(Vehicle vehicle) {
        stack.push(vehicle);
    }

    public Vehicle popVehicleFromStack() {
        return stack.pop();
    }

    public Vehicle peekVehicleFromStack() {
        return stack.peek();
    }

    public void addVehicleToQueue(Vehicle vehicle) {
        queue.enqueue(vehicle);
    }

    public Vehicle getFromQueue() {
        return queue.dequeue();
    }
}
