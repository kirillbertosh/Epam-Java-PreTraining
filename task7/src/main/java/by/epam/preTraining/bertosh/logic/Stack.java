package by.epam.preTraining.bertosh.logic;

import by.epam.preTraining.bertosh.model.Vehicle;

public class Stack {

    private int peakOfStack = 0;
    private int size;
    private Vehicle[] vehicles;

    public Stack() {

    }

    public Stack(int size) {
        this.size = size;
        vehicles = new Vehicle[size];
    }

    public void push(Vehicle newVehicle) {
        if (!isStackFull()) {
            vehicles[peakOfStack] = newVehicle;
            peakOfStack++;
        } else {
            Vehicle[] newVehicles = new Vehicle[size * 3 / 2 + 1];
            System.arraycopy(vehicles, 0, newVehicles, 0, vehicles.length);
            newVehicles[++peakOfStack] = newVehicle;
            vehicles = newVehicles;
        }
    }

    public Vehicle pop() {
        if (!isStackEmpty()) {
            Vehicle vehicle = vehicles[peakOfStack];
            vehicles[peakOfStack] = null;
            peakOfStack--;
            return vehicle;
        } else {
            return null;
        }
    }

    public Vehicle peek() {
        return vehicles[peakOfStack];
    }

    public int getSize() {
        return size;
    }

    public boolean isStackEmpty() {
        return peakOfStack == 0;
    }

    public boolean isStackFull() {
        return peakOfStack == size;
    }
}
