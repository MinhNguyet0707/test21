package com.company.model;

import java.util.Scanner;

public class Teacher extends Person {
    private double salary;

    public Teacher() {
    }

    public Teacher(double salary) {
        this.salary = salary;
    }

    public Teacher(int id, String name, int age, String address, double salary) {
        super(id, name, age, address);
        this.salary = salary;
    }

    public void showTeacher() {
        super.showList();
        System.out.println("salary : " + salary);
    }

    public void inputTeacher(Scanner sc) {
        super.input(sc);
        System.out.print("\tNhập lương : ");
        salary = sc.nextDouble();
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "salary=" + salary +
                '}';
    }

}
