package by.epam.preTraining.bertosh.model;

import java.util.Objects;

public abstract class Vehicle {

    private double price;
    private double maxSpeed;
    private int passengersNumber;

    public Vehicle(){

    }

    public Vehicle(double price, double maxSpeed, int numOfPassangers){
        this.maxSpeed = maxSpeed;
        this.price = price;
        this.passengersNumber = numOfPassangers;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPassengersNumber() {
        return passengersNumber;
    }

    public void setPassengersNumber(int passengersNumber) {
        this.passengersNumber = passengersNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, maxSpeed, passengersNumber);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vehicle vehicle = (Vehicle) o;

        if (Double.compare(vehicle.price, price) != 0) return false;
        if (Double.compare(vehicle.maxSpeed, maxSpeed) != 0) return false;
        return passengersNumber == vehicle.passengersNumber;
    }
}
