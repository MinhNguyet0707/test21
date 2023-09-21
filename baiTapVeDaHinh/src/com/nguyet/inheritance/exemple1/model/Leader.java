package com.nguyet.inheritance.exemple1.model;

import java.util.Scanner;

public class Leader extends Company {
    private int teamSize;
    public void showList(){
        super.showList();
        System.out.println("teamSize :"+teamSize);
    }

    public void input(Scanner sc){
        super.input(sc);
        System.out.print("\tNhap teamSize : ");
        sc.nextLine();
        teamSize = sc.nextInt();
    }


    public Leader(int teamSize) {
        this.teamSize = teamSize;
    }

    public Leader() {
    }

    public Leader(int id, String name, int age, int teamSize) {
        super(id, name, age);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public String toString() {
        return "Leader{" +
                "teamSize='" + teamSize + '\'' +
                '}';
    }
}
