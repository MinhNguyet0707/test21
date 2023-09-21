package com.company.service;

import com.company.model2.Laptop;

public class LaptopServiceImpl implements LaptopService{

    @Override
    public void input(Laptop lt) {
        System.out.println("Nhập thông tin cho laptop:");
        System.out.println("ID: " + lt.getId());
        System.out.println("CPU: " + lt.getCpu());
        System.out.println("RAM: " + lt.getRam() + "GB");
        System.out.println("VGA: " + lt.getVga());
    }

    @Override
    public void info(Laptop lt) {
        System.out.println("Thông tin laptop:");
        System.out.println("ID: " + lt.getId());
        System.out.println("CPU: " + lt.getCpu());
        System.out.println("RAM: " + lt.getRam() + "GB");
        System.out.println("VGA: " + lt.getVga());
    }
}

