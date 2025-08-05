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
        return "Student (" + name + ", " + age + ")";
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
