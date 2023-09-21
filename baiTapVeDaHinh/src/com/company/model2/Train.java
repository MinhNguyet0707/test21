package com.company.model2;

public class Train extends Vehicle {
    private int prescriptionNumber;

    public Train() {
    }

    public int getPrescriptionNumber() {
        return prescriptionNumber;
    }

    public void setPrescriptionNumber(int prescriptionNumber) {
        this.prescriptionNumber = prescriptionNumber;
    }

    @Override
    public String toString() {
        return "Train{" +
                " fare=" + super.fare +
                ", seats=" + super.seats +
                " , prescriptionNumber=" + prescriptionNumber +
                '}';
    }
}
