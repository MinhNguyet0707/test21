package com.company.model;

public class Boss extends Person implements SalaryCalculator {
    private double responsibilityBonus;
    private double commission;

    public Boss(String name, double responsibilityBonus, double commission) {
        super(name);
        this.responsibilityBonus = responsibilityBonus;
        this.commission = commission;
    }

    @Override
    public double calculateSalary() {
        return 0 + responsibilityBonus + commission;
    }

    @Override
    public String toString() {
        return "Boss: " + name + ", Salary: " + calculateSalary() + " VND";
    }
}

