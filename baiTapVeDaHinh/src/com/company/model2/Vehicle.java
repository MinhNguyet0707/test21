package com.company.model2;

public class Vehicle {
    protected int fare;
    protected int seats;

    public Vehicle() {
    }

    public Vehicle(int fare, int seats) {
        this.fare = fare;
        this.seats = seats;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

}
