package Povtorenie_s_GPT.HashMap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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



