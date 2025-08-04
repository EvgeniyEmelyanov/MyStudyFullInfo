package Povtorenie_s_GPT.HashMap;

import java.util.*;

public class HashMap_2 {
    public static Map<Integer, List<String>> groupNamesBuSort(List<String> list) {
        Map<Integer, List<String>> group = new TreeMap<>();

        for (String name : list) {
            int length = name.length();


            if (!group.containsKey(length)) {
                group.put(length, new ArrayList<>());
            }

            group.get(length).add(name);

        }


        return group;
    }

    public static void main(String[] args)  {
        List<String> names = Arrays.asList("Anna", "Bob", "Alice", "Tom", "Eva", "John");

        Map<Integer, List<String>> group = groupNamesBuSort(names);

        for (Map.Entry<Integer, List<String>> entry : group.entrySet()) {
            int len = entry.getKey();
            List<String> list1 = entry.getValue();

            Collections.sort(list1);

            System.out.println(len + " символов: " + list1.size() + " имя(ён) → " + list1);
        }

    }
}

class HashMap_2_1 {
    public static Map <String, List<String>> groupByFirstLetter(List <String> words) {
        Map <String, List<String>> group = new TreeMap<>();

        for (String name : words){
            String letter = name.substring(0,1).toUpperCase();

            if (!group.containsKey(letter)) {
                group.put(letter, new ArrayList<>());
            }
            group.get(letter).add(name);
        }
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "apple", "banana", "Avocado", "blueberry", "apricot", "Blackberry", "cherry"
        );

    }
}