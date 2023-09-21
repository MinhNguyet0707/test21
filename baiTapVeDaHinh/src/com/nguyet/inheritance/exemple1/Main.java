package com.nguyet.inheritance.exemple1;

import com.company.model.Developer;
import com.company.model.Leader;
import com.company.model.Tester;
import com.company.service.DeverloperService;
import com.company.service.LeaderService;
import com.company.service.TesterService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DeverloperService deverloperService = new DeverloperService();
        LeaderService leaderService = new LeaderService();
        TesterService testerService = new TesterService();
        Developer develope = new Developer();
        Leader leader = new Leader();
        Tester tester = new Tester();
        while (true) {
            System.out.println("\nMENU:");
            System.out.println("1. Thêm Developer");
            System.out.println("2. Hiển thị danh sách deverloper");
            System.out.println("3. Thêm Leader");
            System.out.println("4. Hiển thị danh sách Leader");
            System.out.println("5. Thêm Tester");
            System.out.println("6. Hiển thị danh sách Tester");

            System.out.println("7.Tất cả Developers có ngon ngữ lập trình là Java");
            System.out.println("8.leader có teamSize> 10");

            System.out.println("9.Leader salary");
            System.out.println("8. Thoát");
            System.out.print("Chọn chức năng: ");
            int chon = scanner.nextInt();

            switch (chon) {
                case 1:
                    deverloperService.enterList(scanner);
                    break;
                case 2:
                    deverloperService.display();
                    break;
                case 3:
                    leaderService.enterList(scanner);
                    break;
                case 4:
                    leaderService.display();
                    break;
                case 5:
                    testerService.enterList(scanner);
                    break;
                case 6:
                    testerService.display();
                    break;
                case 7:
                    deverloperService.seachDeverloperByLanguegaJava();
                    break;
                case 8:
                    leaderService.searchLeaderHaveTeamSize();
                    break;
                case 9:

                    leaderService.bonusSalary();
                    break;
                case 10:
                    System.out.println("Kết thúc chương trình.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Chức năng không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

}
