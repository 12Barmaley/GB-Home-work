package java2.hw4;

import java.util.HashMap;
import java.util.Map;

    public class Main {
        public static void main(String[] args) {

            //Task1
            String[] strings = {
                    "Neque", "Neque", "Neque", "Neque",
                    "porro",
                    "quisquam", "quisquam", "quisquam",
                    "est", "est",
                    "qui", "qui", "qui", "qui", "qui"};

            System.out.println("* * * \nЗадание№1");
            System.out.println(reader(strings));

            //Task2
            PhoneBook phoneBook = new PhoneBook();

            phoneBook.add("Иванов", "+7(985) 874-78-45");
            phoneBook.add("Петров", "+7(985) 874-13-43");
            phoneBook.add("Сидоров", "+7(985) 874-84-00");
            phoneBook.add("Сидоров", "+7(985) 874-11-22");

            System.out.println("\n\n* * * \nЗадание№2");
            System.out.println(phoneBook.getPhoneBook());

            System.out.println(phoneBook.get("петров"));
            System.out.println(phoneBook.get("Петров"));
            System.out.println(phoneBook.get("Сидоров"));
        }

        public static Map<String, Integer> reader(String[] strings) {
            Map<String, Integer> map = new HashMap<>();
            for (String string : strings) {
                map.put(string, map.containsKey(string) ? map.get(string) + 1 : 1);
            }
            return map;
        }
    }

