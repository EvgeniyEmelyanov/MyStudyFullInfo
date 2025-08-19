package Povtorenie_s_GPT.HashMap;

import java.util.*;

import static java.util.Arrays.asList;
import static java.util.Arrays.parallelPrefix;

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
        List<Contact> contacts = new ArrayList<>(asList(new Contact("Alice", "+12345"), new Contact("Anton", "+99999"), new Contact("Bob", "+23456"), new Contact("Boris", "+88888"), new Contact("Charlie", "+34567")));

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
        List<Contact> contacts = new ArrayList<>(asList(new Contact("Alice", "+12345"), new Contact("Anton", "+99999"), new Contact("Bob", "+23456"), new Contact("Boris", "+88888"), new Contact("Charlie", "+34567")));

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
        List<String> words = Arrays.asList("apple", "banana", "Avocado", "blueberry", "apricot", "Blackberry", "cherry");
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
        List<String> words = Arrays.asList("apple", "banana", "Avocado", "blueberry", "apricot", "Blackberry", "cherry");

        Map<String, List<String>> group = groupByFirstLetter(words);
        for (Map.Entry<String, List<String>> entry : group.entrySet()) {
            String letter = entry.getKey();
            List<String> list1 = entry.getValue();

            Collections.sort(list1);

            int letterCount = 0;
            for (int i = 0; i < list1.size(); i++) {
                letterCount += list1.get(i).length();

            }
            System.out.println(letter + "(" + list1.size() + " солва): " + list1 + "- общая длинна: " + letterCount);
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
        List<String> words = Arrays.asList("apple", "banana", "Avocado", "blueberry", "apricot", "Blackberry", "cherry");

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

            System.out.println(letter + "(" + list1.size() + " слова): " + list1 + " - общая длина: " + letterCount + ", средняя: " + format);
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
        List<String> words = Arrays.asList("Alice", "Anton", "Bob", "Boris", "Charlie");

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
        List<String> names = Arrays.asList("Alice", "Anton", "Bob", "Boris", "Charlie");
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
        List<Contact> contacts = Arrays.asList(new Contact("Alice", "+12345"), new Contact("Bob", "+67890"), new Contact("Alice", "+54321"), new Contact("Charlie", "+11111"), new Contact("Bob", "+22222"), new Contact("Alice", "+99999"));

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
        List<Contact> contacts = Arrays.asList(new Contact("Alice", "+12345"), new Contact("Bob", "+67890"), new Contact("Alice", "+54321"), new Contact("Charlie", "+11111"), new Contact("Bob", "+22222"), new Contact("Alice", "+99999"));

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
        List<String> words = Arrays.asList("apple", "home", "tree", "code", "bed", "lead", "need", "red");

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
        List<ListOrder> orders = Arrays.asList(new ListOrder("Alice", "USA"), new ListOrder("Bob", "Germany"), new ListOrder("Alice", "Canada"), new ListOrder("Alice", "USA"), new ListOrder("Bob", "Germany"), new ListOrder("Alice", "France"), new ListOrder("Bob", "France"), new ListOrder("Charlie", "Italy"), new ListOrder("Bob", "Germany"));

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
        List<ListOrder> orders = Arrays.asList(new ListOrder("Alice", "USA"), new ListOrder("Bob", "Germany"), new ListOrder("Alice", "Canada"), new ListOrder("Alice", "USA"), new ListOrder("Bob", "Germany"), new ListOrder("Alice", "France"), new ListOrder("Bob", "France"), new ListOrder("Charlie", "Italy"), new ListOrder("Bob", "Germany"));

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

class HashMap_2_16 {
    public static void sortByLetters(String text, String vowelsList) {
        Map<Character, Integer> vowels = new TreeMap<>();
        Map<Character, Integer> consonants = new TreeMap<>();

        for (char word : text.trim().toLowerCase().toCharArray()) {
            if (Character.isLetter(word)) {
                if (vowelsList.contains(String.valueOf(word))) {
                    vowels.put(word, vowels.getOrDefault(word, 0) + 1);
                } else {
                    consonants.put(word, consonants.getOrDefault(word, 0) + 1);
                }
            }

        }

        System.out.println("Согласные: ");

        for (Map.Entry<Character, Integer> entry : consonants.entrySet()) {
            Character c = entry.getKey();
            Integer count = entry.getValue();
            System.out.println(c + ": " + count);
        }

        System.out.println("\nГласные: ");
        for (Map.Entry<Character, Integer> entry : vowels.entrySet()) {
            Character c = entry.getKey();
            Integer count = entry.getValue();

            System.out.println(c + ": " + count);

        }

    }

    public static void main(String[] args) {
        String text = "Java is a powerful and popular programming language!";
        String vowelsList = "aeiou";

        sortByLetters(text, vowelsList);

    }
}


class Movie {
    private String title;
    private String genre;

    public Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }
}

/*class HashMap_2_17 {
    public static void groupMoviesByGenre(List<Movies> movies) {
        Map<String, List<String>> group = new TreeMap<>();

        for (Movies movie : movies) {
            String genre = movie.getGenre();
            String title = movie.getTitle();
            if (!group.containsKey(genre)) {
                group.put(genre, new ArrayList<>());
            }
            group.get(genre).add(title);
        }

        for (Map.Entry<String, List<String>> entry : group.entrySet()) {
            String genre = entry.getKey();
            List<String> listTitle = entry.getValue();

            Collections.sort(listTitle);

            System.out.println(genre + ": " + listTitle);
        }
    }

    public static void main(String[] args) {
        List<Movies> movies = Arrays.asList(new Movies("Titanic", "Drama"), new Movies("Avengers", "Action"), new Movies("The Mask", "Comedy"), new Movies("Matrix", "Action"), new Movies("Forrest Gump", "Drama"), new Movies("Home Alone", "Comedy"));

        groupMoviesByGenre(movies);
    }
}*/


class Person {
    private String country;
    private String language;

    public Person(String country, String language) {
        this.country = country;
        this.language = language;
    }

    public String getCountry() {
        return country;
    }

    public String getLanguage() {
        return language;
    }
}

class HashMap_2_18 {
    public static void groupLanguagesByCountry(List<Person> people) {
        Map<String, List<String>> group = new TreeMap<>();

        for (Person person : people) {
            String country = person.getCountry();
            String language = person.getLanguage();

            if (!group.containsKey(country)) {
                group.put(country, new ArrayList<>());
            }
            group.get(country).add(language);
        }

        for (Map.Entry<String, List<String>> entry : group.entrySet()) {
/*            String country = entry.getKey();
            List<String> listLanguage = entry.getValue();
            List<String> listWithoutDoblicates = new ArrayList<>();

            for (String language : listLanguage) {
                if (!listWithoutDoblicates.contains(language)) {
                    listWithoutDoblicates.add(language);
                }
            }

            Collections.sort(listWithoutDoblicates);

            System.out.println(country + ": " + listWithoutDoblicates);
            ЭТО КЛАССИЧЕСКИЙ СПОСОБ БЕЗ ИСПОЛЬЗОВАНИЯ SET*/


            String country = entry.getKey();
            List<String> listLanguage = entry.getValue();

            Set<String> temp = new HashSet<>(listLanguage);
            listLanguage = new ArrayList<>(temp);

            Collections.sort(listLanguage);

            System.out.println(country + ": " + listLanguage);
        }

    }

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("USA", "English"), new Person("Canada", "English"), new Person("Canada", "French"), new Person("Germany", "German"), new Person("USA", "Spanish"), new Person("USA", "English"),     // повтор
                new Person("Canada", "French")    // повтор
        );

        groupLanguagesByCountry(people);
    }
}

class Movies {
    private String title;
    private String genre;
    private String studio;

    public Movies(String title, String genre, String studio) {
        this.title = title;
        this.genre = genre;
        this.studio = studio;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getStudio() {
        return studio;
    }
}

class HashMap_2_19 {
    public static void countMoviesByGenreAndStudio(List<Movies> movies) {
        Map<String, Map<String, Integer>> group = new TreeMap<>();

        for (Movies movie : movies) {
            String genre = movie.getGenre();
            String studio = movie.getStudio();
            String title = movie.getTitle();

            if (!group.containsKey(genre)) {
                group.put(genre, new HashMap<>());
            }

            Map<String, Integer> innerMap = group.get(genre);
            innerMap.put(studio, innerMap.getOrDefault(studio, 0) + 1);

        }

        for (Map.Entry<String, Map<String, Integer>> entry : group.entrySet()) {
            String genre = entry.getKey();
            Map<String, Integer> innerMap = entry.getValue();

            System.out.println(genre + ": " + innerMap);
        }

    }

    public static void main(String[] args) {
        List<Movies> movies = Arrays.asList(new Movies("Avengers", "Action", "Marvel"), new Movies("Iron Man", "Action", "Marvel"), new Movies("The Batman", "Action", "Warner"), new Movies("Toy Story", "Comedy", "Pixar"), new Movies("Monsters Inc.", "Comedy", "Pixar"), new Movies("Finding Nemo", "Comedy", "Pixar"), new Movies("Titanic", "Drama", "Paramount"));

        countMoviesByGenreAndStudio(movies);
    }
}

class Order {
    private String clientName;
    private String genre;

    public Order(String clientName, String genre) {
        this.clientName = clientName;
        this.genre = genre;
    }

    public String getClientName() {
        return clientName;
    }

    public String getGenre() {
        return genre;
    }
}

class HashMap_2_20 {
    public static void countGenresPerClient(List<Order> orders) {
        Map<String, Map<String, Integer>> group = new TreeMap<>();

        for (Order order : orders) {
            String name = order.getClientName();
            String genreMovie = order.getGenre();

            if (!group.containsKey(name)) {
                group.put(name, new HashMap<>());
            }

            Map<String, Integer> innerMap = group.get(name);
            innerMap.put(genreMovie, innerMap.getOrDefault(genreMovie, 0) + 1);

        }

        for (Map.Entry<String, Map<String, Integer>> entry : group.entrySet()) {
            String name = entry.getKey();
            Map<String, Integer> integerMap = entry.getValue();

            System.out.println(name + " ->" + integerMap);

        }
    }

    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(new Order("Alice", "Action"), new Order("Bob", "Drama"), new Order("Alice", "Comedy"), new Order("Alice", "Action"), new Order("Bob", "Drama"), new Order("Charlie", "Action"), new Order("Charlie", "Drama"));

        countGenresPerClient(orders);
    }
}

class HashMap_2_21 {
    public static void countWordsByLength(String text) {
        Map<Integer, Integer> group = new TreeMap<>();

        int count = 0;
        for (String words : text.trim().split(" ")) {
            int length = words.length();

            group.put(length, group.getOrDefault(length, 0) + 1);


        }
        for (Map.Entry<Integer, Integer> entry : group.entrySet()) {
            int wordLength = entry.getKey();
            int groupLength = entry.getValue();
            System.out.println(wordLength + " -> " + groupLength);
        }
    }

    public static void main(String[] args) {
        String text = "Java is awesome and powerful language";

        countWordsByLength(text);
    }
}


class HashMap_2_22 {
    public static void findMostFrequentWord(String text) {
        Map<String, Integer> group = new TreeMap<>();

        for (String words : text.split(" ")) {
            words = words.trim().toLowerCase().replaceAll("[^a-z]", "");

            group.put(words, group.getOrDefault(words, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : group.entrySet()) {
            String wordLength = entry.getKey();
            int groupLength = entry.getValue();
            System.out.println(wordLength + " -> " + groupLength);
        }

        int max = 0;


        for (int count : group.values()) {
            if (count > max) {
                max = count;
            }
        }

        System.out.println("\nСамые частые слова (встречаются " + max + " раз):");

        for (Map.Entry<String, Integer> entry : group.entrySet()) {
            if (entry.getValue() == max) {
                System.out.println(entry.getKey());
            }
        }
    }

    public static void main(String[] args) {
        String text = "Java is powerful. Java is versatile. Java is everywhere.";

        findMostFrequentWord(text);
    }
}

class Book {
    private String title;
    private String author;
    private String genre;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }
}

class HashMap_2_23 {
    public static void countBooksByAuthor(List<Book> list) {
        Map<String, Integer> group = new TreeMap<>();

        for (Book book : list) {
            String author = book.getAuthor();


            group.put(author, group.getOrDefault(author, 0) + 1);

        }

        for (Map.Entry<String, Integer> entry : group.entrySet()) {
            String author = entry.getKey();
            int groupLength = entry.getValue();

            System.out.println(author + " -> " + groupLength);
        }

        int max = 0;
        for (int count : group.values()) {
            if (count > max) {
                max = count;

            }
        }


        System.out.println("\nАвтор, у кого больше всего книг:");
        for (Map.Entry<String, Integer> entry : group.entrySet()) {
            if (entry.getValue() == max) {
                System.out.println(entry.getKey());
            }
        }

    }

    public static void main(String[] args) {
        List<Book> list = Arrays.asList(
                new Book("1984", "George Orwell"),
                new Book("Animal Farm", "George Orwell"),
                new Book("The Trial", "Franz Kafka"),
                new Book("The Castle", "Franz Kafka"),
                new Book("The Metamorphosis", "Franz Kafka"),
                new Book("Brave New World", "Aldous Huxley"));

        countBooksByAuthor(list);
    }
}

class HashMap_2_24 {
    public static void countBooksByAuthor(List<Book> books) {
        Map<String, Integer> group = new TreeMap<>();

        for (Book book : books) {
            String author = book.getAuthor();


            group.put(author, group.getOrDefault(author, 0) + 1);

        }

        for (Map.Entry<String, Integer> entry : group.entrySet()) {
            String author = entry.getKey();
            int groupLength = entry.getValue();

            System.out.println(author + " -> " + groupLength);
        }


        System.out.println("\nАвторы, у кого больше 2 книг:");
        for (Map.Entry<String, Integer> entry : group.entrySet()) {
            if (entry.getValue() >= 2) {
                System.out.println(entry.getKey());
            }
        }

    }

    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("1984", "George Orwell"),
                new Book("Animal Farm", "George Orwell"),
                new Book("The Trial", "Franz Kafka"),
                new Book("The Castle", "Franz Kafka"),
                new Book("The Metamorphosis", "Franz Kafka"),
                new Book("Brave New World", "Aldous Huxley"));

        countBooksByAuthor(books);
    }
}


class HashMap_2_25 {
    public static void countBooksByGenre(List<Book> books_1) {
        Map<String, Integer> group = new TreeMap<>();

        for (Book book : books_1) {
            String genre = book.getGenre();

            group.put(genre, group.getOrDefault(genre, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : group.entrySet()) {
            String genre = entry.getKey();
            int groupLength = entry.getValue();

            System.out.println(genre + " -> " + groupLength);
        }
    }

    public static void main(String[] args) {
        List<Book> books_1 = Arrays.asList(
                new Book("1984", "George Orwell", "Dystopian"),
                new Book("Animal Farm", "George Orwell", "Satire"),
                new Book("The Trial", "Franz Kafka", "Drama"),
                new Book("The Castle", "Franz Kafka", "Drama"),
                new Book("Brave New World", "Aldous Huxley", "Dystopian"),
                new Book("Solaris", "Stanislaw Lem", "Sci-Fi")
        );

        countBooksByGenre(books_1);
    }
}


class HashMap_2_26 {
    public static void groupBooksByAuthorAndGenre(List<Book> books) {
        Map<String, Map<String, List<String>>> group = new TreeMap<>();

        for (Book book : books) {

            String author = book.getAuthor();
            String genre = book.getGenre();
            String title = book.getTitle();

            if (!group.containsKey(author)) {
                group.put(author, new TreeMap<>());
            }

            Map<String, List<String>> innerMap = group.get(author);

            if (!innerMap.containsKey(genre)) {
                innerMap.put(genre, new ArrayList<>());
            }
            innerMap.get(genre).add(title);

        }

        for (Map.Entry<String, Map<String, List<String>>> entry : group.entrySet()) {
            String author = entry.getKey();
            Map<String, List<String>> innerMap = entry.getValue();

            System.out.println(author + ":");

            for (Map.Entry<String, List<String>> innerEntry : innerMap.entrySet()) {
                String genre = innerEntry.getKey();
                List<String> title = innerEntry.getValue();

                System.out.println("    " + genre + " -> " + title);
            }
        }

    }

    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("1984", "George Orwell", "Dystopian"),
                new Book("Animal Farm", "George Orwell", "Satire"),
                new Book("The Trial", "Franz Kafka", "Drama")

        );
        groupBooksByAuthorAndGenre(books);
    }
}


class HashMap_2_27 {
    public static void groupBooksByGenreAndAuthor(List<Book> books) {
        Map<String, Map<String, List<String>>> group = new TreeMap<>();

        for (Book book : books) {
            String genre = book.getGenre();
            String author = book.getAuthor();
            String title = book.getTitle();

            if (!group.containsKey(genre)) {
                group.put(genre, new TreeMap<>());
            }

            Map<String, List<String>> innerMap = group.get(genre);

            if (!innerMap.containsKey(author)) {
                innerMap.put(author, new ArrayList<>());
            }
            innerMap.get(author).add(title);
        }

        for (Map.Entry<String, Map<String, List<String>>> genreEntry : group.entrySet()) {
            String genre = genreEntry.getKey();
            Map<String, List<String>> authorMap = genreEntry.getValue();

            System.out.println(genre + ":");

            for (Map.Entry<String, List<String>> authorEntry : authorMap.entrySet()) {
                String author = authorEntry.getKey();
                List<String> titles = authorEntry.getValue();
                Collections.sort(titles);

                System.out.println("    " + author + " -> " + titles);
            }
        }
    }

    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("1984", "George Orwell", "Dystopian"),
                new Book("Brave New World", "Aldous Huxley", "Dystopian"),
                new Book("Animal Farm", "George Orwell", "Satire"),
                new Book("The Trial", "Franz Kafka", "Drama"),
                new Book("The Castle", "Franz Kafka", "Drama")
        );

        groupBooksByGenreAndAuthor(books);
    }
}

class HashMap_2_28 {
    public static void findAuthorWithMostGenres(List<Book> books) {
        Map<String, Set<String>> group = new TreeMap<>();

        for (Book book : books) {
            String author = book.getAuthor();
            String genre = book.getGenre();

            if (!group.containsKey(author)) {
                group.put(author, new TreeSet<>());
            }
            group.get(author).add(genre);
        }
        for (Map.Entry<String, Set<String>> entry : group.entrySet()) {
            String author = entry.getKey();
            Set<String> genres = entry.getValue();

            System.out.println(author + " -> " + genres);
        }

        int max = 0;

        for (Set<String> genres : group.values()) {
            if (genres.size() > max) {
                max = genres.size();
            }
        }

        System.out.println("\nАвтор(ы) с наибольшим числом жанров:");
        for (Map.Entry<String, Set<String>> entry : group.entrySet()) {
            if (entry.getValue().size() == max) {
                System.out.println(entry.getKey());
            }
        }

    }

    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("1984", "George Orwell", "Dystopian"),
                new Book("Animal Farm", "George Orwell", "Satire"),
                new Book("The Trial", "Franz Kafka", "Drama"),
                new Book("The Castle", "Franz Kafka", "Drama"),
                new Book("Brave New World", "Aldous Huxley", "Dystopian"),
                new Book("Island", "Aldous Huxley", "Philosophy"),
                new Book("Solaris", "Stanislaw Lem", "Sci-Fi")
        );

        findAuthorWithMostGenres(books);
    }
}

class HashMap_2_29 {
    public static void findMostPopularGenre(List<Book> books) {
        Map<String, Integer> group = new TreeMap<>();

        for (Book book : books) {
            String genre = book.getGenre();

            group.put(genre, group.getOrDefault(genre, 0) + 1);
        }

        int max = 0;
        for (String genre : group.keySet()) {
            if (group.get(genre) > max) {
                max = group.get(genre);
            }
        }

        System.out.println("\nСамый популярный жанр(ы):");
        for (Map.Entry<String, Integer> entry : group.entrySet()) {
            if (entry.getValue() == max) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }


        }

    }

    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("1984", "George Orwell", "Dystopian"),
                new Book("Brave New World", "Aldous Huxley", "Dystopian"),
                new Book("Animal Farm", "George Orwell", "Satire"),
                new Book("The Trial", "Franz Kafka", "Drama"),
                new Book("The Castle", "Franz Kafka", "Drama"),
                new Book("The Metamorphosis", "Franz Kafka", "Drama"),
                new Book("Solaris", "Stanislaw Lem", "Sci-Fi")
        );

        findMostPopularGenre(books);
    }
}

class HashMap_2_30 {
    public static void findMostPopularGenre(List<Order> orders) {
        Map<String, Set<String>> group = new TreeMap<>();

        for (Order order : orders) {
            String name = order.getClientName();
            String genre = order.getGenre();

            group.computeIfAbsent(name, k -> new TreeSet<>()).add(genre);
        }

        for (Map.Entry<String, Set<String>> entry : group.entrySet()) {
            String name = entry.getKey();
            Set<String> genres = entry.getValue();
            System.out.println(name + " -> " + genres.size() + " " + genres);
        }
    }


    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order("Alice", "Drama"),
                new Order("Alice", "Comedy"),
                new Order("Alice", "Drama"),      // повтор
                new Order("Bob", "Action"),
                new Order("Bob", "Drama"),
                new Order("Charlie", "Action"),
                new Order("Charlie", "Action")    // повтор
        );
        findMostPopularGenre(orders);
    }
}

class HashMap_2_31 {
    public static void findMostPopularGenre(List<Order> orders) {
        Map<String, List<String>> group = new TreeMap<>();

        for (Order order : orders) {
            String name = order.getClientName();
            String genre = order.getGenre();

            if (!group.containsKey(name)) {
                group.put(name, new ArrayList<>());
            }
            group.get(name).add(genre);
        }
        for (Map.Entry<String, List<String>> entry : group.entrySet()) {
            String name = entry.getKey();
            List<String> genres = entry.getValue();

            String biggestBook = "";
            for (String genre : genres) {
                if (genre.length() > biggestBook.length()) {
                    biggestBook = genre;
                }
            }

            System.out.println(name + " -> " + biggestBook);
        }

    }

    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order("Alice", "The Great Gatsby"),
                new Order("Alice", "War and Peace"),
                new Order("Bob", "It"),
                new Order("Bob", "The Lord of the Rings"),
                new Order("Charlie", "1984")
        );
        findMostPopularGenre(orders);

    }
}

class HashMap_2_33 {
    public static void countUniqueBooksPerClient(List<Order> orders) {
        Map<String, Set<String>> group = new TreeMap<>();

        for (Order order : orders) {
            String name = order.getClientName();
            String genre = order.getGenre();

            group.computeIfAbsent(name, k -> new TreeSet<>()).add(genre);

        }

        for (Map.Entry<String, Set<String>> entry : group.entrySet()) {
            String name = entry.getKey();
            Set<String> genres = entry.getValue();


            System.out.println(name + " -> " + genres.size() + " " + genres);
        }


    }


    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order("Alice", "War and Peace"),
                new Order("Alice", "1984"),
                new Order("Alice", "1984"),           // повтор
                new Order("Bob", "The Lord of the Rings"),
                new Order("Bob", "The Hobbit"),
                new Order("Charlie", "1984"),
                new Order("Charlie", "1984")          // повтор
        );

        countUniqueBooksPerClient(orders);
    }
}

class HashMap_2_34 {
    public static void findMostPopularGenre(List<Order> orders) {
        Map<String, Set<String>> group = new TreeMap<>();

        for (Order order : orders) {
            String name = order.getClientName();
            String genre = order.getGenre();

            group.computeIfAbsent(name, k -> new TreeSet<>()).add(genre);
        }

        for (Map.Entry<String, Set<String>> entry : group.entrySet()) {
            String name = entry.getKey();
            Set<String> genres = entry.getValue();

            String longestGenre = "";

            for (String genre : genres) {
                if (genre.length() > longestGenre.length()) {
                    longestGenre = genre;
                }
            }
            System.out.println(name + " -> " + longestGenre);


        }


    }

    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order("Alice", "War and Peace"),
                new Order("Alice", "1984"),
                new Order("Alice", "1984"),
                new Order("Bob", "The Lord of the Rings"),
                new Order("Bob", "It"),
                new Order("Charlie", "1984"),
                new Order("Charlie", "The Unbearable Lightness of Being")
        );
        findMostPopularGenre(orders);


    }
}

class HashMap_2_35 {
    public static void findAuthorWithMostGenres(List<Book> books) {
        Map<String, Set<String>> group = new TreeMap<>();

        for (Book book : books) {
            String name = book.getAuthor();
            String genre = book.getGenre();

            group.computeIfAbsent(name, k -> new TreeSet<>()).add(genre);

        }
        for (Map.Entry<String, Set<String>> entry : group.entrySet()) {
            String name = entry.getKey();
            Set<String> genres = entry.getValue();

            System.out.println(name + " -> " + genres.size() + " " + genres);


        }


        int max = 0;
        for (Set<String> generes : group.values()) {
            if (generes.size() > max) {
                max = generes.size();
            }
        }
        System.out.println("\nАвтор(ы) с наибольшим количеством жанров:");
        for (Map.Entry<String, Set<String>> entry : group.entrySet()) {
            if (entry.getValue().size() == max) {
                System.out.println(entry.getKey());

            }
        }
    }


    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("1984", "George Orwell", "Dystopian"),
                new Book("Animal Farm", "George Orwell", "Satire"),
                new Book("Brave New World", "Aldous Huxley", "Dystopian"),
                new Book("Island", "Aldous Huxley", "Philosophy"),
                new Book("The Trial", "Franz Kafka", "Drama"),
                new Book("The Castle", "Franz Kafka", "Drama"),
                new Book("Solaris", "Stanislaw Lem", "Sci-Fi")
        );

        findAuthorWithMostGenres(books);
    }
}


class TaskPutIfAbsent {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new TreeMap<>();
        List<String[]> data = Arrays.asList(
                new String[]{"Alice", "+12345"},
                new String[]{"Bob", "+67890"},
                new String[]{"Alice", "+54321"}
        );

        for (int i = 0; i < data.size(); i++) {
            String[] row = data.get(i);
            String name = row[0];
            String phone = row[1];

            phoneBook.putIfAbsent(name, phone);
        }
        System.out.println(phoneBook);
    }

}


class TaskMerge {
    public static void main(String[] args) {
        String text = "Java java code map code";
        Map<String, Integer> freq = new HashMap<>();

        for (String words : text.toLowerCase().split(" ")) {
            String word = words.trim();
            freq.merge(word, 1, (oldVal, newVal) -> oldVal + newVal);


        }

        System.out.println(freq);
    }
}

class TaskCompute {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 20);
        scores.put("Bob", 15);

        String player = "Charlie";

        scores.compute("Alice", (k, v) -> (v == null) ? 10 : v + 10);
        scores.compute("Bob", (k, v) -> (v == null) ? 10 : v + 10);
        scores.compute(player, (k, v) -> (v == null) ? 10 : v + 10);


        System.out.println(scores);
    }
}

class TaskComputeDecrease {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 15);
        scores.put("Bob", 8);

        String player = "Bob"; // попробуй также "Charlie" которого нет

        scores.compute(player, (k, v) -> {
            if (v == null) return null;
            int nv = v - 10;
            return (nv <= 0) ? null : nv;
        });

        System.out.println(scores);
    }
}

class TaskComputeIfPresentBonus {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 20);
        scores.put("Bob", 15);

        List<String> candidates = Arrays.asList("Alice", "Charlie", "Bob");

        // TODO: пройтись по candidates и добавить +5 только существующим (computeIfPresent)
        for (String candidate : candidates) {
            scores.computeIfPresent(candidate, (k, v) -> v + 5);
        }

        System.out.println(scores);
    }
}

class TaskReplaceConditional {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new TreeMap<>();
        phoneBook.put("Alice", "+12345");
        phoneBook.put("Bob", "+67890");

        // TODO: заменить номер Alice на "+99999" только если сейчас "+12345"
/*        if (phoneBook.get("Alice").equals("+12345")) {
            phoneBook.replace("Alice", "+99999");
        }*/
        phoneBook.replace("Alice", "+12345", "+99999");

        System.out.println(phoneBook);
    }
}

class TaskReplaceAllBonusCap {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 24);
        scores.put("Bob", 25);
        scores.put("Charlie", 10);

        // TODO: через replaceAll добавить +3, но значения >=25 не менять

        scores.replaceAll((k, v) -> {
            if (v >= 25) return v;
            return v + 3;
        });


        System.out.println(scores);
    }
}


class ForEachExample {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("java", "map", "merge", "code"));

        // TODO: вывести все элементы
        for (String word : words) {
            if (word.equals("java")) {
                words.remove(word);

            }
            System.out.println(word);
        }


        // TODO: здесь попробуй удалить "map" (увидишь, что будет ошибка)
    }
}

class ForEachExample1 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("java", "map", "merge", "code"));

        Iterator<String> it = words.iterator(); // получаем итератор
        while (it.hasNext()) {
            String word = it.next(); // берём следующий элемент
            if (word.equals("java")) {
                it.remove(); // безопасное удаление
            }
            System.out.println(word);
        }

        System.out.println("После удаления: " + words);
    }
}

class ForEachExample2 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("java", "map", "merge", "code"));


        words.removeIf(word -> word.equals("java"));

        System.out.println(words);
    }
}

class IteratorRemoveExample {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("java", "map", "merge", "code"));

        Iterator<String> it = words.iterator();
        while (it.hasNext()) {
            String word = it.next();
            // если это "map" → удалить
            if (word.equals("map")) {
                it.remove();
            }
        }

        System.out.println(words);
    }
}

class RemoveIfExample {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("java", "map", "merge", "code"));

        words.removeIf(word -> word.equals("map"));

        System.out.println(words);
    }
}

class RemoveRareWordsIterator {
    public static void main(String[] args) {
        Map<String, Integer> freq = new HashMap<>();
        freq.put("java", 5);
        freq.put("map", 2);
        freq.put("merge", 1);
        freq.put("code", 4);

        List<Map.Entry<String, Integer>> removed = new ArrayList<>();

        // TODO: пройтись по freq.entrySet() через Iterator и удалить value < 3,
        //       добавляя удалённые в removed


        System.out.println("Осталось: " + freq);
        System.out.println("Удалили: " + removed);
    }
}

class IteratorRemoveFromMap {
    public static void main(String[] args) {
        Map<String, Integer> freq = new HashMap<>();
        freq.put("java", 5);
        freq.put("map", 2);
        freq.put("merge", 1);
        freq.put("code", 4);

        Iterator<Map.Entry<String, Integer>> it = freq.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            if (entry.getValue() < 3) {
                it.remove();
            }
        }
        System.out.println(freq);
    }
}


class RemoveAndCollect {
    public static void main(String[] args) {
        Map<String, Integer> freq = new HashMap<>();
        freq.put("java", 5);
        freq.put("map", 2);
        freq.put("merge", 1);
        freq.put("code", 4);

        List<Map.Entry<String, Integer>> removed = new ArrayList<>();

        Iterator<Map.Entry<String, Integer>> it = freq.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> e = it.next();
            if (e.getValue() < 3) {
                // TODO(1): добавить текущую пару в removed
                // TODO(2): удалить текущую пару из freq безопасно
                removed.add(e);
                it.remove();


            }
        }

        System.out.println("Осталось: " + freq);
        System.out.println("Удалили: " + removed);

    }
}


class TaskPutIfAbsentReview {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();
        List<String[]> data = Arrays.asList(
                new String[]{"Alice", "+12345"},
                new String[]{"Bob", "+67890"},
                new String[]{"Alice", "+54321"}
        );

        for (String[] row : data) {
            String name = row[0];
            String phone = row[1];

            // TODO: добавить через putIfAbsent

            phoneBook.putIfAbsent(name, phone);
        }

        System.out.println(phoneBook);
    }
}

class TaskMergeReview {
    public static void main(String[] args) {
        String text = "java code java map code";
        Map<String, Integer> freq = new HashMap<>();

        for (String word : text.split(" ")) {
            // TODO: через merge считать количество

            freq.merge(word, 1, (oldval, newval) -> oldval + newval);
        }

        System.out.println(freq);
    }
}

class TaskComputeReview {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 20);
        scores.put("Bob", 15);

        String player = "Charlie";

        // TODO: через compute добавить игроку очки
        // если его нет — создать с 10
        // если есть — увеличить на 10
        scores.compute(player, (k, v) -> (v == null) ? 10 : v + 10);

        System.out.println(scores);
    }
}

class TaskComputeIfPresentReview {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 20);
        scores.put("Bob", 15);

        List<String> candidates = Arrays.asList("Alice", "Charlie", "Bob");

        // TODO: пройтись по candidates и увеличить очки на 5 только существующим

        for (String word : candidates) {
            scores.computeIfPresent(word, (k, v) -> v + 5);
        }
        System.out.println(scores);

    }
}

class TaskReplaceReview {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Alice", "+12345");
        phoneBook.put("Bob", "+67890");


        // TODO: заменить номер Alice только если совпадает старое значение

        phoneBook.replace("Alice", "+12345", "+99999");
        System.out.println(phoneBook);
    }
}

class TaskReplaceAllReview {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 24);
        scores.put("Bob", 25);
        scores.put("Charlie", 10);

        // TODO: пройтись по map и изменить значения по условию

        scores.replaceAll((k, v) -> (v >= 25) ? v : v + 3);

        System.out.println(scores);
    }
}

class ComparatorTask1 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "a", "merge", "map", "code");

        // TODO: отсортировать по длине ↑, при равенстве по алфавиту

        // Comparator<String> comparator = ...;
        // words.sort(comparator);

        Comparator<String> sortByLength = Comparator.comparingInt(String::length)
                .thenComparing(Comparator.naturalOrder());

        words.sort(sortByLength);

        System.out.println(words);
    }
}

class ComparatorTask1Desc {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "a", "merge", "map", "code");

        // TODO: отсортировать по длине ↓, при равенстве по алфавиту ↑

        // Comparator<String> comparator = ...;
        // words.sort(comparator);

        Comparator<String> sortByLength = Comparator.comparingInt(String::length).reversed()
                .thenComparing(Comparator.naturalOrder());

        words.sort(sortByLength);

        System.out.println(words);
    }
}


class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return name + "=" + score;
    }
}

class ComparatorTask2 {
    public static void main(String[] args) {
        List<Player> players = Arrays.asList(
                new Player("Alice", 20),
                new Player("Bob", 25),
                new Player("Charlie", 20),
                new Player("Bob", 15)
        );

        // TODO: отсортировать: score ↓, при равенстве name ↑

        // Comparator<Player> comparator = ...;
        // players.sort(comparator);

        Comparator<Player> sortByscoreAndName = Comparator.comparingInt((Player p) -> p.score).reversed()
                .thenComparing(p -> p.name);


        players.sort(sortByscoreAndName);

        System.out.println(players);
    }
}

class EntrySortTask {
    public static void main(String[] args) {
        Map<String, Integer> freq = new HashMap<>();
        freq.put("java", 5);
        freq.put("code", 5);
        freq.put("map", 2);
        freq.put("merge", 3);

        List<Map.Entry<String, Integer>> list = new ArrayList<>(freq.entrySet());

        // TODO: собрать компаратор: value ↓, затем key ↑
        // Comparator<Map.Entry<String,Integer>> cmp = ...

        Comparator<Map.Entry<String, Integer>> sortByVal = Comparator.comparingInt((Map.Entry<String, Integer> e) -> e.getValue()).reversed()
                .thenComparing(Map.Entry.comparingByKey());

        list.sort(sortByVal);
        // TODO: отсортировать list компаратором
        // list.sort(cmp);

        // TODO: вывести list в формате key=value
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

    }
}


class EntryTopKTask {
    public static void main(String[] args) {
        Map<String, Integer> freq = new HashMap<>();
        freq.put("java", 5);
        freq.put("code", 5);
        freq.put("map", 2);
        freq.put("merge", 3);

        int k = 2;

        List<Map.Entry<String, Integer>> list = new ArrayList<>(freq.entrySet());

        // TODO: собрать/переиспользовать тот же компаратор: value ↓, затем key ↑
        Comparator<Map.Entry<String, Integer>> sorter = Comparator.comparingInt((Map.Entry<String, Integer> e) -> e.getValue()).reversed()
                .thenComparing(Map.Entry.comparingByKey());
        // list.sort(cmp);
        list.sort(sorter);

        // TODO: вывести первые k элементов: key=value
        // for (int i = 0; i < k && i < list.size(); i++) { ... }
        for (int i = 0; i < k && i < list.size(); i++) {
            System.out.println(list.get(i).getKey() + "=" + list.get(i).getValue());
        }
    }
}

class EntryFilterTask {
    public static void main(String[] args) {
        Map<String, Integer> prices = new HashMap<>();
        prices.put("apple", 100);
        prices.put("banana", 40);
        prices.put("orange", 70);
        prices.put("mango", 120);
        prices.put("pear", 40);

        // TODO:
        // 1) отсортировать список: цена ↓, при равенстве — название ↑
        // 2) вывести только те товары, у которых цена >= 70

        List<Map.Entry<String, Integer>> info = new ArrayList<>(prices.entrySet());

        Comparator<Map.Entry<String, Integer>> sorter = Comparator.comparingInt((Map.Entry<String, Integer> e) -> e.getValue()).reversed()
                .thenComparing(Map.Entry.comparingByKey());


        info.sort(sorter);

        for (Map.Entry<String, Integer> entry : info) {
            if (entry.getValue() >= 70) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }
        }


    }
}

class EntryTop3Filtered {
    public static void main(String[] args) {
        Map<String, Integer> prices = new HashMap<>();
        prices.put("apple", 100);
        prices.put("banana", 40);
        prices.put("orange", 70);
        prices.put("mango", 120);
        prices.put("pear", 55);
        prices.put("kiwi", 50);

        int k = 3;

        List<Map.Entry<String, Integer>> list = new ArrayList<>(prices.entrySet());

        // TODO: собрать компаратор: value ↓, затем key ↑
        // TODO: отсортировать list

        // TODO: пройтись по list и вывести первые k записей с value >= 50
        // остановиться, когда выведено k элементов

        Comparator<Map.Entry<String, Integer>> sorter = Comparator.comparing((Map.Entry<String, Integer> e) -> e.getValue()).reversed()
                .thenComparing(Map.Entry.comparingByKey());

        list.sort(sorter);

        int printed = 0;
        for (Map.Entry<String, Integer> e : list) {
            if (e.getValue() >= 50) {
                System.out.println(e.getKey() + "=" + e.getValue());
                printed++;
                if (printed == k) break;
            }
        }

        }
    }
