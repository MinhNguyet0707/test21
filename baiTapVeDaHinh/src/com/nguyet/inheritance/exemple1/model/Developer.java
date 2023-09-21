package com.nguyet.inheritance.exemple1.model;

import java.util.Scanner;

public class Developer extends Company {
    private String programLanguage;

    public void showList(){
        super.showList();
        System.out.println(" programLanguage :"+programLanguage);
    }

    public void input(Scanner sc){
        super.input(sc);
        System.out.print("\tNhap programLanguage : ");
        sc.nextLine();
        programLanguage = sc.nextLine();
    }

    public Developer(String programLanguage) {
        this.programLanguage = programLanguage;
    }

    public Developer(int id, String name, int age, String programLanguage) {
        super(id, name, age);
        this.programLanguage = programLanguage;
    }

    public Developer() {
    }

    public String getProgramLanguage() {
        return programLanguage;
    }

    public void setProgramLanguage(String programLanguage) {
        this.programLanguage = programLanguage;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "programLanguage='" + programLanguage + '\'' +
                '}';
    }
}
