package com.company.main;

import com.company.model.Chicken;
import com.company.model.Dog;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        menuDog();
        menuChicken();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMENU:");
            System.out.println("1. Nhập thông tin cho dog");
            System.out.println("2. Nhập thông tin cho Chicken ");
            System.out.println("3. Thoát");
            System.out.print("Chọn chức năng: ");
            int chon = scanner.nextInt();

            switch (chon) {
                case 1:
                    menuDog();
                    break;
                case 2:
                    menuChicken();
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

    public static void menuDog() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng Dogs: ");
        int numberOfDogs = scanner.nextInt();
        scanner.nextLine();
        Dog[] dogs = new Dog[numberOfDogs];
        for (int i = 0; i < numberOfDogs; i++) {
            Dog dog = new Dog();
            Util.input(dog);
            dogs[i] = dog;

        }

        System.out.println("Thông tin Dogs:");
        for (Dog dog : dogs) {
            Util.info(dog);
        }
    }

    public static void menuChicken() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng Chickens: ");
        int numberOfChickens = scanner.nextInt();
        scanner.nextLine();
        Chicken[] chickens = new Chicken[numberOfChickens];
        for (int i = 0; i < numberOfChickens; i++) {
            Chicken chicken = new Chicken();
            Util.input(chicken);
            chickens[i]=chicken;

        }

        System.out.println("Thông tin Chickens:");
        for (Chicken chicken : chickens) {
            Util.info(chicken);
        }
    }

}
