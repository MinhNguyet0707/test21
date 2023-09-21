package com.company.Model_Exercise_1;

import java.util.*;

public class ListExam {
    public List<Person> listPerson = new ArrayList<>();


    public static void main(String[] args) {
        List<Person> personList = input();

        System.out.println("Danh sách thông tin:");
        info(personList);

        System.out.println("Danh sách người dưới 20 tuổi:");
        filter(personList);

        delete(personList);

        sorted(personList, true);
    }

    public static List<Person> input() {
        List<Person> personList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Nhập ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng trống
            System.out.print("Nhập tên: ");
            String name = scanner.nextLine();
            System.out.print("Nhập tuổi: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng trống

            Person person = new Person(id, name, age);
            personList.add(person);

            System.out.print("Nhập thêm? (Y/N): ");
            String choice = scanner.nextLine();
            if (!choice.equalsIgnoreCase("Y")) {
                break;
            }
        }

        return personList;
    }

    public static void info(List<Person> personList) {
        for (Person person : personList) {
            System.out.println("ID: " + person.getId() + ", Tên: " + person.getName() + ", Tuổi: " + person.getAge());
        }
    }

    public static void filter(List<Person> personList) {
        for (Person person : personList) {
            if (person.getAge() < 20) {
                System.out.println("ID: " + person.getId() + ", Tên: " + person.getName() + ", Tuổi: " + person.getAge());
            }
        }
    }

    public static void delete(List<Person> personList) {
        Iterator<Person> iterator = personList.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getName().contains("A")) {
                iterator.remove();
            }
            System.out.println("Danh sách sau khi xóa là : ");
            info(personList);

        }

    }

    public static void sorted(List<Person> listPerson, boolean ascending) {
        if (ascending) {
            Collections.sort(listPerson, Comparator.comparingInt(Person::getAge));
            System.out.println("Sắp xếp theo tuổi tăng dần :");
        } else {
            Collections.sort(listPerson, Comparator.comparingInt(Person::getAge).reversed());
            System.out.println("Sắp xếp theo tuổi giảm dần");
        }
        info(listPerson);
        info(listPerson);

    }

}
