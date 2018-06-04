package by.epam.preTraining.bertosh.logic;

import by.epam.preTraining.bertosh.model.Vehicle;

public class Queue {

    private int head = 0;
    private int tail = 0;
    private Vehicle[] vehicles = new Vehicle[1];

    public void enqueue(Vehicle newVehicle) {
        if (!isQueueFull()) {
            vehicles[tail] = newVehicle;
            tail++;
        } else {
            Vehicle[] newVehicles = new Vehicle[vehicles.length * 3 / 2 + 1];
            System.arraycopy(vehicles, 0, newVehicles, 0, vehicles.length);
            newVehicles[++tail] = newVehicle;
            vehicles = newVehicles;
        }
    }

    public Vehicle dequeue() {
        Vehicle vehicle = vehicles[head];
        System.arraycopy(vehicles, 1, vehicle, 0, vehicles.length);
        return vehicle;
    }

    public Vehicle peek() {
        return vehicles[head];
    }

    public int getSize() {
        return tail;
    }

    public boolean isQueueEmpty() {
        return tail == head;
    }

    public boolean isQueueFull() {
        return tail == vehicles.length - 1;
    }
}
