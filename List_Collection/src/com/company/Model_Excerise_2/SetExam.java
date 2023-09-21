package com.company.Model_Excerise_2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SetExam {

    public static void main(String[] args) {
        Set<Person> personSet = input();

        System.out.println("Danh sách thông tin:");
        info(personSet);

        System.out.println("Danh sách người dưới 20 tuổi:");
        filter(personSet);

        delete(personSet);
    }


    public static Set<Person> input() {
        Set<Person> personSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Nhập ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Nhập tên: ");
            String name = scanner.nextLine();
            System.out.print("Nhập tuổi: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            Person person = new Person(id, name, age);
            personSet.add(person);

            System.out.print("Nhập thêm? (Y/N): ");
            String choice = scanner.nextLine();
            if (!choice.equalsIgnoreCase("Y")) {
                break;
            }
        }

        return personSet;
    }

    public static void info(Set<Person> personSet) {
        for (Person person : personSet) {
            System.out.println("ID: " + person.getId() + ", Tên: " + person.getName() + ", Tuổi: " + person.getAge());
        }
    }

    public static void filter(Set<Person> personSet) {
        for (Person person : personSet) {
            if (person.getAge() < 20) {
                System.out.println("ID: " + person.getId() + ", Tên: " + person.getName() + ", Tuổi: " + person.getAge());
            }
        }
    }

    public static void delete(Set<Person> personSet) {
        Iterator<Person> iterator = personSet.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getName().contains("A")) {
                iterator.remove();
            }
        }
        System.out.println("Danh sách sau khi xóa:");
        info(personSet);
    }

}
