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



