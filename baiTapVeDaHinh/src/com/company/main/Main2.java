package com.company.main;

import com.company.model2.Car;
import com.company.model2.Train;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Train train = new Train();
        Car car = new Car();
        while (true) {
            System.out.println("\nMENU:");
            System.out.println("1. Nhập thông tin cho Train ");
            System.out.println("2. Nhập thông tin cho  Car  ");
            System.out.println("3. Thoát");
            System.out.print("Chọn chức năng: ");
            int chon = scanner.nextInt();

            switch (chon) {
                case 1:
                  Util2.input(train);
                  Util2.info(train);
                    break;
                case 2:
                  Util2.input(car);
                  Util2.info(car);
                    break;
                case 3:
                    System.out.println("Kết thúc chương trình.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Chức năng không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}
