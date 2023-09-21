package com.company.main;

import com.company.model.Boss;
import com.company.model.Employee;

public class Main1 {
        public static void main(String[] args) {
            Employee employee = new Employee("Employee 1");
            Boss boss = new Boss("Boss 1", 1000000, 2000000);

            System.out.println(employee);
            System.out.println(boss);
        }
    }

