package by.epam.preTraining.bertosh.model;

public class VehiclesPark {

    private int numOfCrafts = 0;
    private Vehicle[] vehicles;
    private int peakOfStack;

    public VehiclesPark(int size) {
        vehicles = new Vehicle[size];
        peakOfStack = -1;
    }

    public VehiclesPark(Vehicle[] vehicles) {
        peakOfStack = -1;
    }

    public VehiclesPark(VehiclesPark park) {
        this.numOfCrafts = park.numOfCrafts;
        this.peakOfStack = park.peakOfStack;
        this.vehicles = park.vehicles;
    }

    public int getNumOfCrafts() {
        return numOfCrafts;
    }

    public void setNumOfCrafts(int numOfCrafts) {
        this.numOfCrafts = numOfCrafts;
    }

    public Vehicle[] getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }

    public int getPeakOfStack() {
        return peakOfStack;
    }

    public void setPeakOfStack(int peakOfStack) {
        this.peakOfStack = peakOfStack;
    }

    public boolean isParkEmpty() {
        return this.numOfCrafts == 0;
    }

    public Vehicle getVehicleById(int id) {
        if (vehicles[id] != null) {
            return vehicles[id];
        }
        return null;
    }

    public boolean isVehicleInThePark(Vehicle craft) {

        if (!isParkEmpty()) {
            for (int i = 0; i < vehicles.length; i++) {
                if (vehicles[i].equals(craft)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void addVehicle(Vehicle newVehicle) {
        Vehicle[] newVehicles;

        if (!isParkEmpty()) {
            newVehicles = new Vehicle[vehicles.length * 2];
            System.arraycopy(vehicles, 0, newVehicles, 0, vehicles.length);
            newVehicles[++peakOfStack] = newVehicle;
            numOfCrafts++;
            vehicles = newVehicles;
        } else {
            vehicles[++peakOfStack] = newVehicle;
            numOfCrafts++;
        }

    }

    public void addVehiclesToPark(VehiclesPark park, Vehicle[] vehicles) {
        Vehicle[] newPark = new Vehicle[this.vehicles.length + vehicles.length];
        System.arraycopy(this.vehicles, 0, newPark, 0, this.vehicles.length);
        System.arraycopy(vehicles, 0, newPark, this.vehicles.length, vehicles.length);
        this.vehicles = newPark;

    }

    public Vehicle deleteVehicleById(int id) {
        if (!isParkEmpty() && id <= peakOfStack && id >= 0) {
            Vehicle deletedVehicle = vehicles[id];
            vehicles[id] = null;
            for (int i = id; i <= peakOfStack; i++) {
                for (int j = i + 1; i <= peakOfStack;) {
                    vehicles[i] = vehicles[j];
                    vehicles[j] = null;
                    break;
                }
            }
            peakOfStack--;
            return deletedVehicle;
        }
        return null;
    }

    public void deleteAllVehicles(VehiclesPark park) {
        if (!isParkEmpty()) {
            for (int i = 0; i <= peakOfStack; i++) {
                vehicles[i] = null;
            }
            numOfCrafts = 0;
        }
    }

}
