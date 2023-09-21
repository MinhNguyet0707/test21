package com.company.service;

import com.company.model.Company;
import com.company.model.Developer;
import com.company.model.Leader;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeaderService {
    public List<Leader> leaders = new ArrayList<>();

    public void add(Leader leader) {
        leaders.add(leader);
    }

    public void enterList(Scanner sc) {
        Leader leader;
        System.out.print("Nhap vao so luong leader muốn thêm: ");
        int n = sc.nextInt();

        System.out.println("Nhap vao danh sach leader:");

        for (int i = 0; i < n; i++) {
            System.out.println("Leader thu " + (i + 1) + " la:");
            leader = new Leader();
            leader.input(sc);

            add(leader);
        }

    }

    public void display() {
        int i = 1;
        for (Leader st : leaders) {
            System.out.println("Lead thu " + (i) + " la:");
            st.showList();
            i++;
        }
    }
    public void searchLeaderHaveTeamSize(){
       System.out.println("Leader có teamSize > 10:");
        for (Company company : leaders) {
            if (company instanceof Leader) {
                Leader leader = (Leader) company;
                if (leader.getTeamSize() > 10) {
                   leader.showList();
                }
            }
        }

    }
    public void bonusSalary(){
     int salaryBasic=10000000;
     int salary;

     for(Leader leader :leaders){

         if(leader.getTeamSize()>10){
             salary = (salaryBasic*50)/100;
             System.out.println("lương leader bonus là :"+salary);
         }else{
             salary= (salaryBasic*10)/100;
             System.out.println("lương leader k bonus là :"+salary);
         }


     }

    }

}
