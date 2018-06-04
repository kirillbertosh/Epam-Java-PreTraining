package by.epam.preTraining.bertosh.model;

import java.util.Objects;

public class Airplane extends Vehicle {

    private String model;

    public Airplane() {
    }

    public Airplane(double price, double maxSpeed, int passengersNumber, String model){
        super(price, maxSpeed, passengersNumber);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Airplane airplane = (Airplane) o;

        return model != null ? model.equals(airplane.model) : airplane.model == null;
    }

    @Override
    public int hashCode() {
        return Objects.hash(model);
    }
}
