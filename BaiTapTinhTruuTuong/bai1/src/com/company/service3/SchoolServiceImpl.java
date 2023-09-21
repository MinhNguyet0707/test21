package com.company.service3;

import com.company.model3.School;

import java.util.Scanner;

public class SchoolServiceImpl implements SchoolService {
    public School school= new School();
    @Override
    public void input(School school) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập thông tin trường:");
        System.out.print("ID: ");
        school.setId(scanner.nextInt());
        scanner.nextLine(); // Đọc dòng trống sau khi nhập số
        System.out.print("Tên: ");
        school.setName(scanner.nextLine());


    }

    @Override
    public void info(School school) {

        System.out.println("Thông tin trường:");
        System.out.println("ID: " + school.getId());
        System.out.println("Tên: " + school.getName());

    }
}
