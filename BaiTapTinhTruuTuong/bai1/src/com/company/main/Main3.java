package com.company.main;

import com.company.model3.Student;
import com.company.service3.StudentService;
import com.company.service3.StudentServiceImpl;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();

        StudentService studentService = new StudentServiceImpl();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            students[i] = new Student();
            studentService.input(students[i]);
        }

        int maxAge = 0;
        Student oldestStudent = null;

        for (Student student : students) {
            studentService.info(student);

            if (student.getAge() > maxAge) {
                maxAge = student.getAge();
                oldestStudent = student;
            }
        }

        System.out.println("Sinh viên có tuổi lớn nhất là:");
        studentService.info(oldestStudent);
    }
}

