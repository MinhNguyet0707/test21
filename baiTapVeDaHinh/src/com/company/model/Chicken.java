package com.company.model;

public class Chicken extends Animal {
    private int  wings;

    public Chicken() {
    }

    public int getWing() {
        return wings;
    }

    public void setWing(int wing) {
        this.wings = wing;
    }

    @Override
    public String toString() {
        return "Chicken{" +
                "name=" + super.name +
                "age="+super.age+
                "wing=" + wings +
                '}';
    }
}
