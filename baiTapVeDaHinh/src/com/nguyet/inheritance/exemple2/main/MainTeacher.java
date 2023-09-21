package com.nguyet.inheritance.exemple2.main;

import com.company.model.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainTeacher {
    public List<Teacher> teachers = new ArrayList<>();

    public void add(Teacher teacher) {
        teachers.add(teacher);
    }

    public void enterList(Scanner sc) {
        Teacher teacher;
        System.out.print("Nhập vao so luong sinh viên: ");
        int n = sc.nextInt();
        System.out.println("Nhap vao danh sach giáo viên:");
        for (int i = 0; i < n; i++) {
            System.out.println("Giáo viên thứ " + (i + 1) + " la:");
            teacher = new Teacher();
            teacher.inputTeacher(sc);

            add(teacher);
        }


    }

    public void display() {
        int i = 1;
        for (Teacher teacher : teachers) {
            System.out.println("Học sinh thứ " + (i) + " la:");
            teacher.showTeacher();
            i++;
        }
    }

}
