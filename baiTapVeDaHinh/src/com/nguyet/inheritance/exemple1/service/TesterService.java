package com.nguyet.inheritance.exemple1.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesterService {
    public List<Tester> testers = new ArrayList<>();

    public void add(Tester tester) {
        testers.add(tester);
    }

    public void enterList(Scanner sc) {
        Tester tester;
        System.out.print("Nhap vao so luong Tester muốn thêm: ");
        int n = sc.nextInt();
        System.out.println("Nhap vao danh sach test:");
        for (int i = 0; i < n; i++) {
            System.out.println("Test thứ " + (i + 1) + " la:");
            tester = new Tester();
            tester.input(sc);

            add(tester);
        }


    }

    public void display() {
        int i = 1;
        for (Tester tester : testers) {
            System.out.println("Tester thứ " + (i) + " là:");
            tester.showList();
            i++;
        }
    }

}
