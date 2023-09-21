package com.company.main;

import com.company.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainStudent {

    public List<Student> students = new ArrayList<>();

    public void add(Student student) {
        students.add(student);
    }

    public void enterList(Scanner sc) {
        Student student;
        System.out.print("Nhap vao so luong hoc sinh: ");
        int n = sc.nextInt();
        System.out.println("Nhap vao danh sach hoc sinh:");
        for (int i = 0; i < n; i++) {
            System.out.println("Hoc sinh thu " + (i + 1) + " la:");
            student = new Student();
            student.inputStudent(sc);

            add(student);
        }


    }

    public void display() {
        int i = 1;
        for (Student st : students) {
            System.out.println("Hoc sinh thu " + (i) + " la:");
            st.showStudent();
            i++;
        }
    }

}
