package com.company.main;

import com.company.model.Animal;
import com.company.model.Chicken;
import com.company.model.Dog;

import java.util.Scanner;

public class Util {

    public static void input(Animal animal) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Name: ");
        String name = sc.nextLine();
        System.out.print("Input age: ");
        int age = sc.nextInt();
        sc.nextLine();
        animal.setAge(age);
        animal.setName(name);

        if (animal instanceof Dog) {
            System.out.println("Input leg");
            int leg = sc.nextInt();
            Dog dog = (Dog) animal;
            dog.setLeg(leg);
        } else {
            System.out.println("input wings");
            int wings = sc.nextInt();
            Chicken chicken = (Chicken) animal;
            chicken.setWing(wings);
        }


    }

    public static  void info(Animal animal) {
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            System.out.println(dog.toString());
        } else {
            Chicken chicken = (Chicken) animal;
            System.out.println(chicken.toString());
        }


    }

}
