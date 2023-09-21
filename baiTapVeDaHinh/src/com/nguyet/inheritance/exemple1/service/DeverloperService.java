package com.nguyet.inheritance.exemple1.service;



import java.util.ArrayList;

import java.util.Scanner;

public class DeverloperService {
    public List<Developer> developers = new ArrayList<>();

    public void add(Developer developer) {
        developers.add(developer);
    }

    public void enterList(Scanner sc) {
        Developer developer;
        System.out.print("Nhap vao so luong developer muốn thêm: ");
        int n = sc.nextInt();
        System.out.println("Nhap vao danh sach developer:");
        for (int i = 0; i < n; i++) {
            System.out.println("Hoc sinh thu " + (i + 1) + " la:");
            developer = new Developer();
            developer.input(sc);

            add(developer);
        }


    }
    public void display() {
        int i = 1;
        for (Developer st : developers) {
            System.out.println("Developer thu " + (i) + " la:");
            st.showList();
            i++;
        }
    }
    public void seachDeverloperByLanguegaJava(){
        System.out.println("Developers có ngôn ngữ Java:");
        for (Developer developer : developers) {
            if (developer instanceof Developer) {
                Developer dev = (Developer) developer;
                if ("Java".equalsIgnoreCase(dev.getProgramLanguage())) {
                    developer.showList();
                }
            }
        }
    }

}
