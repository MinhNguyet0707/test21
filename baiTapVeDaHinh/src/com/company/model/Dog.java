package com.company.model;

public class Dog extends Animal {
    private int leg;


    public Dog() {
    }

    public Dog(String name, int age, int leg) {
        super(name, age);
        this.leg = leg;
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name=" + super.name +
                "; age="+super.age+
                "; leg=" + leg +
                '}';
    }
}
