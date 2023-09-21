package com.company.main;

import com.company.model.Chicken;
import com.company.model.Dog;
import com.company.model2.Car;
import com.company.model2.Train;
import com.company.model2.Vehicle;

import java.util.Scanner;

public class Util2 {

    public static void input(Vehicle vehicle) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập Giá vé: ");
        int fare = sc.nextInt();
        System.out.print("INhập số ghế ");
        int seats = sc.nextInt();
        sc.nextLine();
        vehicle.setFare(fare);
        vehicle.setSeats(seats);
        if (vehicle instanceof Train) {
            System.out.println("nhap sô toa ");
            int prescriptionNumber = sc.nextInt();
            Train train = (Train) vehicle;
            ((Train) vehicle).setPrescriptionNumber(prescriptionNumber);

        } else {
            System.out.println("nhập loại xe :");
            String rangeOfVehicle = sc.nextLine();
            Car car = (Car) vehicle;
            car.setRangeOfVehicle(rangeOfVehicle);

        }
    }

    public static void info(Vehicle vehicle) {
        if (vehicle instanceof Train) {
            Train train = (Train) vehicle;
            System.out.println(train.toString());
        } else {
            Car car = (Car) vehicle;
            System.out.println(car.toString());
        }
    }
}
