package com.nguyet.inheritance.exemple1.model;

import java.util.Scanner;

public class Tester extends Company {
    private String testTools;

    public void showList(){
        super.showList();
        System.out.println("testTools :"+testTools);
    }

    public void input(Scanner sc){
        super.input(sc);
        System.out.print("\tNhap testTools : ");
        sc.nextLine();
        testTools = sc.nextLine();
    }

    public Tester(String testTools) {
        this.testTools = testTools;
    }
    public Tester() {
    }

    public Tester(int id, String name, int age, String testTools) {
        super(id, name, age);
        this.testTools = testTools;
    }

    public String getTestTools() {
        return testTools;
    }

    public void setTestTools(String testTools) {
        this.testTools = testTools;
    }

    @Override
    public String toString() {
        return "Tester{" +
                "testTools='" + testTools + '\'' +
                '}';
    }
}
