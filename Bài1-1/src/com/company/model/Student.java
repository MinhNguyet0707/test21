package com.company.model;

import java.util.Scanner;

public class Student extends Person{
   private double math ;
    private double physics;
    private double chemistry;
    private double average;

    public Student() {
    }

    public Student(double math, double physics, double chemistry, double average) {
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        this.average = average;
    }

    public Student(int id, String name, int age, String address, double math, double physics, double chemistry, double average) {
        super(id, name, age, address);
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        this.average = average;
    }

    public void showStudent(){
        super.showList();
        System.out.println("math :"+math);
        System.out.println("physical :"+physics);
        System.out.println("chemistry :"+chemistry);
        System.out.println("average :"+average);
    }
    public void inputStudent(Scanner sc){
            super.input(sc);
        System.out.print("\tNhap điểm Toán: ");
        math = sc.nextDouble();
        System.out.print("\tNhap điểm địa lý: ");
        sc.nextLine();
        physics = sc.nextDouble();
        System.out.print("\tNhap điểm hóa : ");
        chemistry = sc.nextDouble();
        System.out.print("\tNhap điểm trung bình :");
        sc.nextLine();
        average = sc.nextDouble();
    }


    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getPhysics() {
        return physics;
    }

    public void setPhysics(double physics) {
        this.physics = physics;
    }

    public double getChemistry() {
        return chemistry;
    }

    public void setChemistry(double chemistry) {
        this.chemistry = chemistry;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return "Student{" +
                "math=" + math +
                ", physics=" + physics +
                ", chemistry=" + chemistry +
                ", average=" + average +
                '}';
    }


}
