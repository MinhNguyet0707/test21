package com.company.service3;

import com.company.model3.Address;
import com.company.model3.Student;

import java.util.Scanner;

public class AddressServiceImpl implements AddressService{
    public Address address = new Address();
    public Student student = new Student();
    @Override
    public void input(Address address) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập thông tin sinh viên:");
        System.out.print("ID: ");
        student.setId(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Tên: ");
        student.setName(scanner.nextLine());
        System.out.print("Tuổi: ");
        student.setAge(scanner.nextInt());
        scanner.nextLine();
    }

    @Override
    public void info(Address address) {
        System.out.println("Thông tin sinh viên:");
        System.out.println("ID: " + student.getId());
        System.out.println("Tên: " + student.getName());
        System.out.println("Tuổi: " + student.getAge());


    }
}
