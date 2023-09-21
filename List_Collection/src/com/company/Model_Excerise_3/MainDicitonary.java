package com.company.Model_Excerise_3;

import com.company.Model_Excerise_2.Person;

import java.util.*;

public class MainDicitonary {
    public static void main(String[] args) {
        Map<String, Dictionary> dictionaryMap = input();

        System.out.println("Danh sách từ điển:");
        info(dictionaryMap);

        System.out.print("Nhập từ khóa cần tra: ");
        Scanner scanner = new Scanner(System.in);
        String keyword = scanner.nextLine();
        filter(dictionaryMap, keyword);

        System.out.print("Nhập từ khóa cần xóa: ");
        String deleteKeyword = scanner.nextLine();
        delete(dictionaryMap, deleteKeyword);
    }

    public static Map<String, Dictionary> input() {
        Map<String, Dictionary> dictionaryMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Nhập từ khóa: ");
            String keyword = scanner.nextLine();
            System.out.print("Nhập mô tả: ");
            String description = scanner.nextLine();
            System.out.print("Chọn loại từ (VERB, ADJECTIVE, NOUN): ");
            Word_type wordType = Word_type.valueOf(scanner.nextLine().toUpperCase());

            Dictionary dictionary = new Dictionary(keyword, description, wordType);
            dictionaryMap.put(keyword, dictionary);

            System.out.print("Nhập thêm từ điển? (Y/N): ");
            String choice = scanner.nextLine();
            if (!choice.equalsIgnoreCase("Y")) {
                break;
            }
        }

        return dictionaryMap;
    }

    public static void info(Map<String, Dictionary> dictionaryMap) {
        for (Map.Entry<String, Dictionary> entry : dictionaryMap.entrySet()) {
            String keyword = entry.getKey();
            Dictionary dictionary = entry.getValue();
            System.out.println("Từ khóa: " + keyword + ", Mô tả: " + dictionary.getDescription() + ", Loại từ: " + dictionary.getWord_type());
        }
    }

    public static void filter(Map<String, Dictionary> dictionaryMap, String keyword) {
        if (dictionaryMap.containsKey(keyword)) {
            Dictionary dictionary = dictionaryMap.get(keyword);
            System.out.println("Từ khóa: " + keyword + ", Mô tả: " + dictionary.getDescription() + ", Loại từ: " + dictionary.getWord_type());
        } else {
            System.out.println("Không tìm thấy từ khóa.");
        }
    }

    public static void delete(Map<String, Dictionary> dictionaryMap, String keyword) {
        if (dictionaryMap.containsKey(keyword)) {
            dictionaryMap.remove(keyword);
            System.out.println("Xóa thành công.");
        } else {
            System.out.println("Không tìm thấy từ khóa để xóa.");
        }
    }
}
