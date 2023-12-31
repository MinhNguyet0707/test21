package com.company.model;

import java.util.Scanner;

public class Person {
    private int id;
    private String name;
    private int age;
    private String address;

    public void showList(){
        System.out.println(" id :"+id);
        System.out.println("name :"+name);
        System.out.println("age :"+age);
        System.out.println("address :"+address);
    }

    public void input(Scanner sc){
            System.out.print("\tNhap id : ");
            id = sc.nextInt();
            System.out.print("\tNhap ho ten : ");
            sc.nextLine();
            name = sc.nextLine();
            System.out.print("\tNhap tuoi : ");
            age = sc.nextInt();
            System.out.print("\tNhap dia chi : ");
            sc.nextLine();
            address = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public Person() {
    }

    public Person(int id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
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

    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }

}

