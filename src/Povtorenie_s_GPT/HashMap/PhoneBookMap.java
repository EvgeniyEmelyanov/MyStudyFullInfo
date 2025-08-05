package Povtorenie_s_GPT.HashMap;

import java.util.*;

public class PhoneBookMap {
    private HashMap<String, String> contact = new HashMap<>();


    public void addContact(String name, String phone) {
        contact.put(name, phone);
        System.out.println("Контакт \"" + contact.get(name) + "\" добавлен");

    }

    public void removeContact(String name) {
        if (contact.containsKey(name)) {
            System.out.println("Контакт \"" + name + "\" удален");
            contact.remove(name);

        } else {
            System.out.println("Контакт с именем \"" + name + "\" не найден");
        }
    }

    public boolean hasContact(String name) {
        return contact.containsKey(name);
    }

    public String getPhone(String name) {
        if (contact.containsKey(name)) {
            System.out.println("Телефона контакта \"" + name + "\" - " + contact.get(name));
            return contact.get(name);
        }
        return null;
    }

    public void ShowContacts() {
        System.out.println();
    }


}

class StudentRegistry {
    HashMap<String, Integer> students = new HashMap<>();

    public void addStudent(String name, int age) {
        students.put(name, age);
    }

    public void removeStudent(String name) {
        if (students.containsKey(name)) {
            students.remove(name);
        }
    }

    public boolean hasStudent(String name) {
        return students.containsKey(name);
    }

    public void showAll() {
        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }

    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        studentRegistry.addStudent("John Doe", 18);
        studentRegistry.addStudent("John Doe", 19);
        studentRegistry.addStudent("John Doe", 20);
        studentRegistry.showAll();
        studentRegistry.removeStudent("Jane Doe");
        System.out.println("123");
        studentRegistry.showAll();
        System.out.println(studentRegistry.hasStudent("John Doe"));

    }
}

class CounterStudents {
    HashMap<String, Integer> students = new HashMap<>();

    public void countByAge() {
        Map<Integer, Integer> ageCount = new HashMap<>();

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            int age = entry.getValue();

            if (ageCount.containsKey(age)) {
                ageCount.put(age, ageCount.get(age) + 1);
            } else {
                ageCount.put(age, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : ageCount.entrySet()) {
            System.out.println(entry.getKey() + " лет: " + entry.getValue() + " ученик(ов)");
        }
    }

    public static void main(String[] args) {
        CounterStudents counterStudents = new CounterStudents();
        counterStudents.students.put("John Doe", 18);
        counterStudents.students.put("John Smith", 19);
        counterStudents.students.put("John Doeg", 20);
        counterStudents.students.put("John Does", 21);
        counterStudents.students.put("John Doet", 22);
        counterStudents.students.put("John Doev", 23);
        counterStudents.students.put("John Doev", 23);
        counterStudents.students.put("John Doeb", 24);
        counterStudents.countByAge();


    }

}


class NameCounter {

    public static Map<String, Integer> countNames(List<String> names) {
        // Создаём новую HashMap для подсчёта
        Map<String, Integer> nameCount = new HashMap<>();

        // Проходим по списку имён
        for (String name : names) {
            // Если имя уже есть в карте — увеличиваем счётчик
            if (nameCount.containsKey(name)) {
                nameCount.put(name, nameCount.get(name) + 1);
            } else {
                // Если имя встречается впервые — ставим 1
                nameCount.put(name, 1);
            }
        }

        // Возвращаем результат
        return nameCount;
    }

    public static void main(String[] args) {
        List<String> names = List.of("Anna", "Bob", "Anna", "Mike", "Anna", "Bob");

        Map<String, Integer> result = countNames(names);

        // Выводим красиво
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}

class CountWords {
    public static Map<String, Integer> countWords(String text) {
        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = text.split("\\s+");
        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
        return wordCount;
    }


    public static void main(String[] args) {
        String text = "java is cool and java is powerful";

        Map<String, Integer> result = countWords(text);

        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}


class CounterVoice {
    public static Map<String, Integer> countVotes(List<String> votes) {
        Map<String, Integer> voteCount = new HashMap<>();

        for (String vote : votes) {
            vote = vote.toLowerCase();

            if (voteCount.containsKey(vote)) {
                voteCount.put(vote, voteCount.get(vote) + 1);
            } else {
                voteCount.put(vote, 1);
            }

        }
        return voteCount;
    }

    public static void main(String[] args) {
        List<String> votes = List.of("Alice", "Bob", "Alice", "Charlie", "Bob", "Alice");
        Map<String, Integer> result = countVotes(votes);

        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        String winner = "";
        int maxVotes = 0;

        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            if (entry.getValue() > maxVotes) {
                maxVotes = entry.getValue();
                winner = entry.getKey();
            }
        }
        System.out.println("Победитель: " + winner + " с голосами: " + maxVotes);
    }

}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class GroupStudentsByAge {
    public static Map<Integer, List<String>> groupByAge(List<Student> students) {
        Map<Integer, List<String>> groupByAge = new HashMap<>();

        for (Student student : students) {
            int age = student.getAge();
            String name = student.getName();

            if (!groupByAge.containsKey(age)) {
                groupByAge.put(age, new ArrayList<>());
            }
            groupByAge.get(age).add(name);
        }
        return groupByAge;
    }

    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("Alice", 18),
                new Student("Bob", 19),
                new Student("Charlie", 18),
                new Student("David", 20),
                new Student("Eva", 19)
        );
        Map<Integer, List<String>> groupByAge = groupByAge(studentList);
        for (Map.Entry<Integer, List<String>> entry : groupByAge.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}

class StudentsABC {
    private String name;
    private int age;

    public StudentsABC(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ", " + age;
    }
}

class GroupStudentsByAgeAndObject {
    public static Map<Integer, List<StudentsABC>> groupStudentsByAge(List<StudentsABC> students) {
        Map<Integer, List<StudentsABC>> group = new HashMap<>();

        for (StudentsABC student : students) {
            int age = student.getAge();

            if (!group.containsKey(age)) {
                group.put(age, new ArrayList<>());
            }
            group.get(age).add(student);
        }
        return group;

    }

    public static void main(String[] args) {
        List<StudentsABC> students = Arrays.asList(
                new StudentsABC("Alice", 18),
                new StudentsABC("Bob", 19),
                new StudentsABC("Charlie", 18),
                new StudentsABC("Anton", 23)

        );

        Map<Integer, List<StudentsABC>> group = groupStudentsByAge(students);
        for (Map.Entry<Integer, List<StudentsABC>> entry : group.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}

class GroupStudentsByAlphabet {

    public static Map<String, List<StudentsABC>> groupByFirstLetter(List<StudentsABC> students) {
        Map<String, List<StudentsABC>> group = new HashMap<>();

        for (StudentsABC student : students) {
            String firstLetter = student.getName().substring(0, 1).toUpperCase();
            if (!group.containsKey(firstLetter)) {
                group.put(firstLetter, new ArrayList<>());
            }
            group.get(firstLetter).add(student);
        }

        return group;
    }

    public static void main(String[] args) {
        List<StudentsABC> students = Arrays.asList(
                new StudentsABC("Alice", 18),
                new StudentsABC("Bob", 19),
                new StudentsABC("Charlie", 18),
                new StudentsABC("Anton", 23)
        );

        Map<String, List<StudentsABC>> group = groupByFirstLetter(students);

        for (Map.Entry<String, List<StudentsABC>> entry : group.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


    }
}

class GroupStudentsByAlphabetAndAge {
    public static Map<String, Double> groupByFirstLetter(List<StudentsABC> students) {
        Map<String, List<Integer>> group = new TreeMap<>();

        for (StudentsABC student : students) {
            String firstLetter = student.getName().substring(0, 1).toUpperCase();
            int age = student.getAge();

            if (!group.containsKey(firstLetter)) {
                group.put(firstLetter, new ArrayList<>());
            }
            group.get(firstLetter).add(age);

        }

        Map<String, Double> averageAge = new TreeMap<>();

        for (Map.Entry<String, List<Integer>> entry : group.entrySet()) {
            String letter = entry.getKey();
            List<Integer> ages = entry.getValue();

            int sum = 0;
            for (int age : ages) {
                sum += age;
            }
            double average = (double) sum / ages.size();
            averageAge.put(letter, average);
        }


        return averageAge;
    }

    public static void main(String[] args) {
        List<StudentsABC> students = Arrays.asList(
                new StudentsABC("Alice", 18),
                new StudentsABC("Anton", 20),
                new StudentsABC("Bob", 21),
                new StudentsABC("Boris", 19)

        );
        Map<String, Double> group = groupByFirstLetter(students);
        for (Map.Entry<String, Double> entry : group.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

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
        return "Contact{name='" + name + "', phone='" + phone + "'}";
    }

}

class MapContact {
    public Map<String, String> map = new HashMap<>();

    public void addContact(String name, String phone) {
        Contact contact = new Contact(name, phone);
        map.put(contact.getName(), contact.getPhone());
        System.out.println("Контакт \"" + contact.getName() + "-->" + contact.getPhone() + "\" добавлен");
    }

    public boolean checkContact(String name) {
        if (map.containsKey(name)) {
            return true;
        }
        return false;

    }

    public void getPhone(String name) {
        if (map.containsKey(name)) {
            System.out.println("Номер контакта \"" + name + "\"-->" + map.get(name));
        }
    }

    public void removeContact(String name) {
        if (map.containsKey(name)) {
            map.remove(name);
            System.out.println("Контакт \"" + name + "\" удален");
        }
    }

    public void showContact() {
        System.out.println("Список контактов:");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        MapContact contacts = new MapContact();
        contacts.addContact("Alex", "12345");
        contacts.addContact("Bob", "67890");
        contacts.addContact("Eva", "54321");

        contacts.showContact();

        System.out.println("Есть ли контакт с именем 'Bob'? " + contacts.checkContact("Bob"));

        contacts.getPhone("Eva");

        contacts.removeContact("Bob");

        contacts.showContact();
    }

}

class GroupContactsByNumber {
    public static Map<String, List<String>> groupByFirstLetter(List<Contact> contacts) {
        Map<String, List<String>> group = new HashMap<>();

        for (Contact contact : contacts) {
            String firstLetter = contact.getName().substring(0, 1).toUpperCase();
            String number = contact.getPhone();
            if (!group.containsKey(firstLetter)) {
                group.put(firstLetter, new ArrayList<>());
            }
            group.get(firstLetter).add(number);
        }
        return group;
    }

    public static void main(String[] args) {
        List<Contact> contacts = new ArrayList<>(Arrays.asList(
                new Contact("Alice", "+12345"),
                new Contact("Anton", "+99999"),
                new Contact("Bob", "+23456"),
                new Contact("Boris", "+88888"),
                new Contact("Charlie", "+34567")
        ));

        Map<String, List<String>> group = groupByFirstLetter(contacts);

        for (Map.Entry<String, List<String>> entry : group.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}

class HashMapStudy {
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
        List<Contact> contacts = new ArrayList<>(Arrays.asList(
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