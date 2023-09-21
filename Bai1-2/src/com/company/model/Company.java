package com.company.model;

import java.util.Scanner;

public class Company {
    private int id;
    private String name;
    private int age;

    public void showList(){
        System.out.println(" id :"+id);
        System.out.println("name :"+name);
        System.out.println("age :"+age);
    }

    public void input(Scanner sc){
        System.out.print("\tNhap id : ");
        id = sc.nextInt();
        System.out.print("\tNhap ho ten : ");
        sc.nextLine();
        name = sc.nextLine();
        System.out.print("\tNhap tuoi : ");
        age = sc.nextInt();
    }



    public Company() {
    }

    public Company(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "InfomationShared{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
