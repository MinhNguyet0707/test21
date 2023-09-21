package com.company.model;

public class Employee extends Person implements SalaryCalculator {
    public Employee(String name) {
        super(name);
    }

    @Override
    public double calculateSalary() {
        return 5000000;
    }

    @Override
    public String toString() {
        return "Employee: " + super.name + ", Salary: " + calculateSalary() + " VND";
    }
}
