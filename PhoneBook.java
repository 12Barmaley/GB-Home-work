package java2.hw4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
   private Map<String, List<String>> map;

    public PhoneBook() {
        map = new HashMap<>();
    }

    public Map<String, List<String>> getPhoneBook() {
        return map;
    }

    public void add(String lastName, String phoneNumber) {
        List<String> list = new ArrayList<>();
        if (map.containsKey(lastName)) {
            list = map.get(lastName);
            list.add(phoneNumber);
            map.put(lastName, list);
        } else {
            list.add(phoneNumber);
            map.put(lastName, list);
        }

    }

    public String get(String lastName) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(lastName + ": ");
        if (map.containsKey(lastName)) {
            for (String s : map.get(lastName)) {
                stringBuilder.append(s + "; ");
            }
        } else {
            stringBuilder.append("Номер не найден!");
        }
        return stringBuilder.toString().trim();
    }
}

