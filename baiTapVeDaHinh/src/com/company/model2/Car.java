package com.company.model2;

public class Car extends Vehicle{

    private String rangeOfVehicle;

    public Car() {
    }

    public Car(int fare, int seats, String rangeOfVehicle) {
        super(fare, seats);
        this.rangeOfVehicle = rangeOfVehicle;
    }

    public void setRangeOfVehicle(String rangeOfVehicle) {
        this.rangeOfVehicle = rangeOfVehicle;
    }

    @Override
    public String toString() {
        return "Car{" +
                " fare=" + super.fare +
                ", seats=" + super.seats +
                ",  rangeOfVehicle='" + rangeOfVehicle + '\'' +
                '}';
    }
}
