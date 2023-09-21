package com.company.main;

import com.company.model2.Laptop;
import com.company.service.LaptopService;
import com.company.service.LaptopServiceImpl;

public class Main2 {
    public static void main(String[] args) {
        Laptop laptop = new Laptop(1, "Intel i7", "13", "Nvidia RTX 3080");

        LaptopSere laptopService = new LaptopServiceImpl();

        laptopService.input(laptop);
        laptopService.info(laptop);
    }
}
    vic