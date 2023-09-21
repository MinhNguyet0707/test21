package com.nguyet.inheritance.exemple2;

import com.company.main.MainStudent;
import com.company.main.MainTeacher;
import com.company.model.Student;
import com.company.model.Teacher;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MainStudent mainStudent = new MainStudent();
        MainTeacher mainTeacher= new MainTeacher();
        Teacher teacher = new Teacher();
        Student student = new Student();
        while (true) {
            System.out.println("\nMENU:");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Thêm teacher");
            System.out.println("4. Hiển thị danh sách giáo viên");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");
            int chon = scanner.nextInt();

            switch (chon) {
                case 1:
                   mainStudent.enterList(scanner);
                    break;
                case 2:
                    mainStudent.display();
                    break;
                case 3:
                    mainTeacher.enterList(scanner);
                    break;
                case 4:
                    mainTeacher.display();
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Kết thúc chương trình.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Chức năng không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

    }
