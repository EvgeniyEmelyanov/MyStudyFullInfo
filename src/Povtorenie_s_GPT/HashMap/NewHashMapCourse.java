package Povtorenie_s_GPT.HashMap;

import java.util.*;

import static java.util.Arrays.asList;

class Contact {
    private String name;
    private String phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return name + ", " + phone;
    }
}

class NewHashMapCourse {
    public static Map<String, List<Contact>> groupByFirstLetter(List<Contact> contacts) {
        Map<String, List<Contact>> group = new TreeMap<>();

        for (Contact contact : contacts) {
            String firstLetter = contact.getName().substring(0, 1).toUpperCase();

            if (!group.containsKey(firstLetter)) {
                group.put(firstLetter, new ArrayList<>());
            }
            group.get(firstLetter).add(contact);
        }

        return group;
    }

    public static void main(String[] args) {
        List<Contact> contacts = new ArrayList<>(asList(
                new Contact("Alice", "+12345"),
                new Contact("Anton", "+99999"),
                new Contact("Bob", "+23456"),
                new Contact("Boris", "+88888"),
                new Contact("Charlie", "+34567")
        ));

        Map<String, List<Contact>> group = groupByFirstLetter(contacts);

        for (Map.Entry<String, List<Contact>> entry : group.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}

class NewHashMapCourse2 {
    public static Map<String, List<Contact>> groupByFirstLetter(List<Contact> contacts) {
        Map<String, List<Contact>> group = new TreeMap<>();

        for (Contact contact : contacts) {
            String firstLetter = contact.getName().substring(0, 1).toUpperCase();

            if (!group.containsKey(firstLetter)) {
                group.put(firstLetter, new ArrayList<>());
            }
            group.get(firstLetter).add(contact);
        }


        return group;
    }

    public static void main(String[] args) {
        List<Contact> contacts = new ArrayList<>(asList(
                new Contact("Alice", "+12345"),
                new Contact("Anton", "+99999"),
                new Contact("Bob", "+23456"),
                new Contact("Boris", "+88888"),
                new Contact("Charlie", "+34567")
        ));

        Map<String, List<Contact>> group = groupByFirstLetter(contacts);

        for (Map.Entry<String, List<Contact>> entry : group.entrySet()) {
            String letter = entry.getKey();
            List<Contact> groupList = entry.getValue();
            System.out.println(letter + " (" + groupList.size() + " контакт(ов):");
            for (Contact contact : groupList) {
                System.out.println(" - " + contact);
            }
            System.out.println();
        }

    }
}

class HashMap_2 {
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

    public static void main(String[] args) {
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
    public static Map<String, List<String>> groupByFirstLetter(List<String> words) {
        Map<String, List<String>> group = new TreeMap<>();

        for (String name : words) {
            String letter = name.substring(0, 1).toUpperCase();

            if (!group.containsKey(letter)) {
                group.put(letter, new ArrayList<>());
            }
            group.get(letter).add(name);
        }
        return group;
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "apple", "banana", "Avocado", "blueberry", "apricot", "Blackberry", "cherry"
        );
        Map<String, List<String>> group = groupByFirstLetter(words);
        for (Map.Entry<String, List<String>> entry : group.entrySet()) {
            String letter = entry.getKey();
            List<String> list1 = entry.getValue();

            Collections.sort(list1);

            System.out.println(letter + " (" + list1.size() + " слова): " + list1);
        }
    }
}

class HashMap_2_3 {
    public static Map<String, List<String>> groupByFirstLetter(List<String> words) {
        Map<String, List<String>> group = new TreeMap<>();
        for (String name : words) {
            String letter = name.substring(0, 1).toUpperCase();
            if (!group.containsKey(letter)) {
                group.put(letter, new ArrayList<>());
            }
            group.get(letter).add(name);
        }
        return group;
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "apple", "banana", "Avocado", "blueberry", "apricot", "Blackberry", "cherry"
        );

        Map<String, List<String>> group = groupByFirstLetter(words);
        for (Map.Entry<String, List<String>> entry : group.entrySet()) {
            String letter = entry.getKey();
            List<String> list1 = entry.getValue();

            Collections.sort(list1);

            int letterCount = 0;
            for (int i = 0; i < list1.size(); i++) {
                letterCount += list1.get(i).length();

            }
            System.out.println(letter + "(" + list1.size() + " солва): " + list1 + "- общая длинна: "
                    + letterCount);
        }
    }
}

class HashMap_2_4 {
    public static Map<String, List<String>> groupByFirstLetter(List<String> words) {
        Map<String, List<String>> group = new TreeMap<>();

        for (String name : words) {
            String letter = name.substring(0, 1).toUpperCase();
            if (!group.containsKey(letter)) {
                group.put(letter, new ArrayList<>());
            }
            group.get(letter).add(name);
        }
        return group;
    }


    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "apple", "banana", "Avocado", "blueberry", "apricot", "Blackberry", "cherry"
        );

        Map<String, List<String>> group = groupByFirstLetter(words);
        for (Map.Entry<String, List<String>> entry : group.entrySet()) {
            String letter = entry.getKey();
            List<String> list1 = entry.getValue();

            Collections.sort(list1);

            int letterCount = 0;
            for (String str : list1) {
                letterCount += str.length();
            }

            double average = (double) letterCount / list1.size();

            String format = String.format("%.2f", average);

            System.out.println(letter + "(" + list1.size() + " слова): " + list1
                    + " - общая длина: " + letterCount + ", средняя: " + format);
        }


    }
}

class HashMap_2_5 {
    public static Map<String, List<String>> groupByFirstLetter(List<String> words) {
        Map<String, List<String>> group = new TreeMap<>();

        for (String name : words) {
            String letter = name.substring(0, 1).toUpperCase();

            if (!group.containsKey(letter)) {
                group.put(letter, new ArrayList<>());
            }
            group.get(letter).add(name);
        }
        return group;
    }


    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "Alice", "Anton", "Bob", "Boris", "Charlie"
        );

        Map<String, List<String>> group = groupByFirstLetter(words);

        double biggestAverage = 0;
        String biggestLetter = "";


        for (Map.Entry<String, List<String>> entry : group.entrySet()) {
            String letter = entry.getKey();
            List<String> list1 = entry.getValue();

            Collections.sort(list1);

            int letterCount = 0;
            for (String str : list1) {
                letterCount += str.length();
            }

            double average = (double) letterCount / list1.size();

            if (average > biggestAverage) {
                biggestAverage = average;
                biggestLetter = letter;

            }
        }

        String format = String.format("%.2f", biggestAverage);

        System.out.println("Ответ: " + biggestLetter + ", потому что у неё самая высокая средняя длина слова: " + format);

    }

}

class HashMap_2_6 {
    public static void groupAndCountVowels(List<String> names) {

        Map<String, List<String>> group = new TreeMap<>();

        for (String name : names) {
            String letter = name.substring(0, 1);

            if (!group.containsKey(letter)) {
                group.put(letter, new ArrayList<>());
            }
            group.get(letter).add(name);
        }


        for (Map.Entry<String, List<String>> entry : group.entrySet()) {

            String letter = entry.getKey();
            List<String> list1 = entry.getValue();

            Collections.sort(list1);

            int count = 0;
            for (String str : list1) {
                for (char c : str.toCharArray()) {
                    if ("aeiouAEIOU".indexOf(c) >= 0) {
                        count++;
                    }
                }
            }

            System.out.println(letter + ": " + list1 + " -> гласных:  " + count);
        }
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Alice", "Anton", "Bob", "Boris", "Charlie"
        );
        groupAndCountVowels(names);
    }
}

class HashMap_2_7 {
    public static void countPhonesPerPerson(List<Contact> contacts) {
        Map<String, Integer> group = new TreeMap<>();

        for (Contact contact : contacts) {
            if (group.containsKey(contact.getName())) {
                group.put(contact.getName(), group.get(contact.getName()) + 1);
            } else {
                group.put(contact.getName(), 1);
            }


        }
        for (Map.Entry<String, Integer> entry : group.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        List<Contact> contacts = Arrays.asList(
                new Contact("Alice", "+12345"),
                new Contact("Bob", "+67890"),
                new Contact("Alice", "+54321"),
                new Contact("Charlie", "+11111"),
                new Contact("Bob", "+22222"),
                new Contact("Alice", "+99999")
        );

        countPhonesPerPerson(contacts);
    }
}

class PhoneNumberComparator implements Comparator<Contact> {
    @Override
    public int compare(Contact c1, Contact c2) {
        return c1.getPhone().compareTo(c2.getPhone());
    }
}

class HashMap_2_8 {
    public static void groupAndSortContacts(List<Contact> contacts) {
        Map<String, List<Contact>> group = new TreeMap<>();

        for (Contact contact : contacts) {
            String letter = contact.getName().substring(0, 1);

            if (!group.containsKey(letter)) {
                group.put(letter, new ArrayList<>());
            }
            group.get(letter).add(contact);
        }


        for (Map.Entry<String, List<Contact>> entry : group.entrySet()) {
            String letter = entry.getKey();
            List<Contact> list1 = entry.getValue();

            Collections.sort(list1, new PhoneNumberComparator());


            System.out.println(letter + ": ");
            for (Contact contact : list1) {
                System.out.println(" " + contact.getName() + " - " + contact.getPhone());
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        List<Contact> contacts = Arrays.asList(
                new Contact("Alice", "+12345"),
                new Contact("Bob", "+67890"),
                new Contact("Alice", "+54321"),
                new Contact("Charlie", "+11111"),
                new Contact("Bob", "+22222"),
                new Contact("Alice", "+99999")
        );

        groupAndSortContacts(contacts);
    }
}

class HashMap_2_9 {
    public static void groupByLastLetterAndFindMaxAverage(List<String> words) {
        Map<String, List<String>> group = new TreeMap<>();

        String biggestLetter = " ";
        double biggestAverage = 0;

        for (String word : words) {
            String letter = word.substring(word.length() - 1);

            if (!group.containsKey(letter)) {
                group.put(letter, new ArrayList<>());
            }
            group.get(letter).add(word);


        }

        List<String> words1 = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : group.entrySet()) {
            String letter = entry.getKey();
            List<String> list1 = entry.getValue();

            int letterCount = 0;
            for (String letters : list1) {
                letterCount += letters.length();
            }

            double average = (double) letterCount / list1.size();

            if (average > biggestAverage) {
                biggestAverage = average;
                biggestLetter = letter;
                words1 = list1;
            }


        }
        String format = String.format("%.2f", biggestAverage);


        Collections.sort(words1);

        System.out.println("Буква: " + biggestLetter);
        System.out.println("Средняя длина: " + format);
        System.out.println("Слова:" + words1);

    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "apple", "home", "tree", "code", "bed", "lead", "need", "red"
        );

        groupByLastLetterAndFindMaxAverage(words);
    }
}

class ListOrder {
    private String name;
    private String country;

    public ListOrder(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }
}

class HashMap_2_10 {
    public static void countOrdersPerCountry(List<ListOrder> orders) {
        Map<String, Map<String, Integer>> map = new HashMap<>();

        for (ListOrder order : orders) {
            String country = order.getCountry();
            String name = order.getName();

            Map<String, Integer> innerMap = map.computeIfAbsent(name, k -> new HashMap<>());

            innerMap.put(country, innerMap.getOrDefault(country, 0) + 1);
        }

        for (Map.Entry<String, Map<String, Integer>> entry : map.entrySet()) {
            String name = entry.getKey();
            Map<String, Integer> innerMap = entry.getValue();

            System.out.println(name + ": " + innerMap);
        }


    }

    public static void main(String[] args) {
        List<ListOrder> orders = Arrays.asList(
                new ListOrder("Alice", "USA"),
                new ListOrder("Bob", "Germany"),
                new ListOrder("Alice", "Canada"),
                new ListOrder("Alice", "USA"),
                new ListOrder("Bob", "Germany"),
                new ListOrder("Alice", "France"),
                new ListOrder("Bob", "France"),
                new ListOrder("Charlie", "Italy"),
                new ListOrder("Bob", "Germany")
        );

        countOrdersPerCountry(orders);
    }
}


class HashMap_2_11 {
    public static void countOrdersPerCountry(List<ListOrder> orders) {
        Map<String, Map<String, Integer>> map = new TreeMap<>();

        for (ListOrder order : orders) {
            String name = order.getName();
            String country = order.getCountry();

            if (!map.containsKey(name)) {
                map.put(name, new TreeMap<>());
            }

            Map<String, Integer> innerMap = map.get(name);

            innerMap.put(country, innerMap.getOrDefault(country, 0) + 1);
        }

        for (Map.Entry<String, Map<String, Integer>> entry : map.entrySet()) {
            String name = entry.getKey();
            Map<String, Integer> innerMap = entry.getValue();


            System.out.println(name + ": " + innerMap);
        }


    }

    public static void main(String[] args) {
        List<ListOrder> orders = Arrays.asList(
                new ListOrder("Alice", "USA"),
                new ListOrder("Bob", "Germany"),
                new ListOrder("Alice", "Canada"),
                new ListOrder("Alice", "USA"),
                new ListOrder("Bob", "Germany"),
                new ListOrder("Alice", "France"),
                new ListOrder("Bob", "France"),
                new ListOrder("Charlie", "Italy"),
                new ListOrder("Bob", "Germany")
        );

        countOrdersPerCountry(orders);
    }
}

class HashMap_2_12 {
    public static void sortByCity(Map<String, String> people) {
        Map<String, List<String>> group = new TreeMap<>();

        for (Map.Entry<String, String> entry : people.entrySet()) {
            String name = entry.getKey();
            String city = entry.getValue();

            if (!group.containsKey(city)) {
                group.put(city, new ArrayList<>());
            }
            group.get(city).add(name);
        }

        for (Map.Entry<String, List<String>> entry : group.entrySet()) {
            String city = entry.getKey();
            List<String> list = entry.getValue();
            Collections.sort(list);

            System.out.println(city + ": " + list);
        }

    }

    public static void main(String[] args) {
        Map<String, String> people = new HashMap<>();
        people.put("Alice", "Paris");
        people.put("Bob", "Berlin");
        people.put("Charlie", "Paris");
        people.put("David", "London");
        people.put("Eve", "Berlin");

        sortByCity(people);

    }
}

class HashMap_2_13 {
    public static void sortByCountry(Map<String, String> people) {
        Map<String, List<String>> group = new TreeMap<>();

        for (Map.Entry<String, String> entry : people.entrySet()) {
            String name = entry.getKey();
            String country = entry.getValue();

            List<String> names = group.computeIfAbsent(country, k -> new ArrayList<>());
            names.add(name);

        }
        for (Map.Entry<String, List<String>> entry : group.entrySet()) {
            String country = entry.getKey();
            List<String> names = entry.getValue();

            Collections.sort(names);

            System.out.println(country + ": " + names);
        }


    }

    public static void main(String[] args) {
        Map<String, String> people = new HashMap<>();
        people.put("Alice", "Paris");
        people.put("Bob", "Berlin");
        people.put("Charlie", "Paris");
        people.put("David", "London");
        people.put("Eve", "Berlin");

        sortByCountry(people);

    }
}

class HashMap_2_14 {
    public static void sortByCity(String str) {
        Map<Character, Integer> map = new TreeMap<>();

        for (char word : str.trim().toLowerCase().toCharArray()) {
            if (Character.isLetter(word)) {
                if (!map.containsKey(word)) {
                    map.put(word, 1);
                } else {
                    map.put(word, map.get(word) + 1);
                }
            }

        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            Character c = entry.getKey();
            Integer count = entry.getValue();


            System.out.println(count + ": " + c);
        }


    }

    public static void main(String[] args) {
        String srt = "banana apple";

        sortByCity(srt);
    }
}


class HashMap_2_15 {
    public static void sortByLetter(String words, String vowelsList) {
        Map<Character, Integer> consonants = new TreeMap<>();
        Map<Character, Integer> vowelsMap = new TreeMap<>();

        for (char word : words.toCharArray()) {
            if (Character.isLetter(word)) {
                if (vowelsList.contains(String.valueOf(word))) {
                    vowelsMap.put(word, vowelsMap.getOrDefault(word, 0) + 1);
                } else {
                    consonants.put(word, consonants.getOrDefault(word, 0) + 1);
                }

            }

        }
        System.out.println("Согласные: ");

        for (Map.Entry<Character, Integer> entry : consonants.entrySet()) {
            Character c = entry.getKey();
            Integer count = entry.getValue();

            System.out.println(count + ": " + c);
        }


        System.out.println("\nГласные : ");

        for (Map.Entry<Character, Integer> entry : vowelsMap.entrySet()) {
            Character c = entry.getKey();
            Integer count = entry.getValue();

            System.out.println(count + ": " + c);
        }

    }

    public static void main(String[] args) {
        String vowelsList = "aeiou";
        String words = "banana apple";
        sortByLetter(words, vowelsList);


    }
}