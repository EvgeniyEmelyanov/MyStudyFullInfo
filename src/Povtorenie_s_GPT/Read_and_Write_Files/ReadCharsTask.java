package Povtorenie_s_GPT.Read_and_Write_Files;

import GPT_Task.Switch;

import java.io.*;
import java.nio.file.*;
import java.io.IOException;
import java.util.*;

import static java.util.Collections.sort;


public class ReadCharsTask {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("C:\\Users\\User\\Desktop\\Текстовый документ.txt")) {
            // TODO: читать символы через fr.read() и печатать
            int c;
            while ((c = fr.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}

class ReadLinesTask {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\Текстовый документ.txt"))) {
            // TODO: читать строки через br.readLine() и печатать
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}

class WriteFileTask {
    public static void main(String[] args) {
        try (PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\User\\Desktop\\Текстовый документ.txt"))) {
            // TODO: записать две строки в файл
            pw.println("Привет, Java!");
            pw.println("Файлы — это легко \uD83D\uDE80");


        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
        }
    }
}

class AppendFileTask {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("C:\\Users\\User\\Desktop\\Текстовый документ.txt", true);
             PrintWriter pw = new PrintWriter(fw)) {
            // TODO: добавить строку в конец файла
            pw.println("Новая запись добавлена!");

        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}

class CountLinesTask {
    public static void main(String[] args) {
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\Текстовый документ.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                count++;
            }
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        System.out.println("Количество строк в файле: " + count);
    }
}

class CountWordsTask {
    public static void main(String[] args) {
        int wordCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\Текстовый документ.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                String[] words = line.split(" ");
                wordCount += words.length;

                // TODO: разбить строку на слова и увеличить wordCount
            }
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        System.out.println("Количество слов в файле: " + wordCount);
    }
}


class PhoneBookApp {
    private static final String FILE_PATH = "phonebook.txt"; // можно заменить на свой абсолютный путь


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            printMenu();
            String cmd = in.nextLine().trim();

            switch (cmd) {
                case "1":
                    addContact(in);


                    break;
                case "2":
                    showAll();           // TODO: реализовать чтение и вывод всего файла
                    break;
                case "0":
                    System.out.println("Пока!");
                    return;
                default:
                    System.out.println("Неизвестная команда. Повтори, пожалуйста.");
            }
            System.out.println(); // пустая строка между операциями
        }
    }

    private static void printMenu() {
        System.out.println("=== Телефонная книга ===");
        System.out.println("1) Добавить контакт");
        System.out.println("2) Показать все");
        System.out.println("0) Выход");
        System.out.print("Выбор: ");
    }

    // Шаг 1.A: Добавление контакта c простейшей валидацией и append в файл
    private static void addContact(Scanner in) {
        System.out.print("Имя: ");
        String name = in.nextLine().trim();

        System.out.print("Телефон: ");
        String phone = in.nextLine().trim();

        if (name.isEmpty() || phone.isEmpty()) {
            System.out.println("Ошибка: имя и телефон не должны быть пустыми.");
            return;
        }

        // простой запрет разделителя
        if (name.contains(";") || phone.contains(";")) {
            System.out.println("Ошибка: нельзя использовать символ ';' (он служит разделителем).");
            return;
        }

        // TODO: дописать строку "Имя;Телефон" в конец файла (append = true)
        try (FileWriter fw = new FileWriter(FILE_PATH, true);
             PrintWriter pw = new PrintWriter(fw)) {
            pw.println(name + ";" + phone);
            System.out.println("Сохранено: " + name + " -> " + phone);
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
        }
    }

    // Шаг 1.B: Показать все контакты — построчно прочитать файл и вывести
    private static void showAll() {
        File f = new File(FILE_PATH);
        if (!f.exists()) {
            System.out.println("Список пуст. Файл ещё не создан.");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            int n = 0;
            while ((line = br.readLine()) != null) {
                if (line.isBlank()) continue;
                n++;
                // Разбираем "Имя;Телефон" аккуратно
                String[] parts = line.split(";", 2);
                String name = parts.length > 0 ? parts[0] : "";
                String phone = parts.length > 1 ? parts[1] : "";
                System.out.println(n + ") " + name + " — " + phone);
            }
            if (n == 0) System.out.println("Список пуст.");
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }
    }
}

class Contact {
    String name;
    String phone;

    Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return name + " — " + phone;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(name, contact.name) && Objects.equals(phone, contact.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone);
    }
}

class PhoneBookListDemo {
    final static String FILE_PATH = "phonebook.txt";
    static List<Contact> contacts = new ArrayList<>();

    private static void printMenu() {
        System.out.println("=== Телефонная книга ===");
        System.out.println("1) Добавить контакт");
        System.out.println("2) Показать все");
        System.out.println("3) Найти по имени");
        System.out.println("4) Удалить контакт");
        System.out.println("5) Редактировать контакт");
        System.out.println("0) Выход");
    }

    private static void saveAllToFile() {
        contacts.sort(Comparator.comparing((Contact c) -> c.name, String.CASE_INSENSITIVE_ORDER)
                .thenComparing(c -> c.phone));

        try (PrintWriter pw = new PrintWriter(new FileWriter(FILE_PATH))) {

            for (Contact contact : contacts) {
                pw.println(contact.name + ";" + contact.phone);
            }

        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }


    private static void addContact(Scanner in) {
        System.out.print("\nИмя:");
        String name = in.nextLine().trim();

        System.out.print("Телефон:");
        String phone = in.nextLine().trim();

        if (name.isEmpty() || phone.isEmpty()) {
            System.out.println("Заполните все данные!");
            return;
        }

        if (name.contains(";") || phone.contains(";")) {
            System.out.println("Разделитель \";\" не допускается.");
            return;
        }

        for (Contact c : contacts) {
            if (c.name.equals(name) && c.phone.equals(phone)) {
                System.out.println("Такой контакт уже создан.");
                return;
            }
        }

        contacts.add(new Contact(name, phone));

        saveAllToFile();
    }

    private static void loadContactsFromFile() {
        contacts.clear();

        File f = new File(FILE_PATH);
        if (!f.exists()) {
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;

            while ((line = br.readLine()) != null) {
                if (line.isBlank()) continue;

                String[] parts = line.split("\\s*;\\s*", 2);
                String name = parts.length > 0 ? parts[0] : "";
                String phone = parts.length > 1 ? parts[1] : "";


                if (name.isEmpty() || phone.isEmpty()) {
                    continue;
                }

                boolean exists = false;
                for (Contact c : contacts) {
                    if (c.name.equals(name) && c.phone.equals(phone)) {
                        exists = true;
                        break;
                    }
                }

                if (!exists) {
                    contacts.add(new Contact(name, phone));
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private static void showAll() {

        if (!contacts.isEmpty()) {
            System.out.println("\nСписок контактов:");
        } else {
            System.out.println("Список пуст");
            return;
        }

        List<Contact> sorted = new ArrayList<>(contacts);
        Comparator<Contact> comp = Comparator.comparing((Contact c) -> c.name, String.CASE_INSENSITIVE_ORDER)
                .thenComparing(c -> c.phone);
        sorted.sort(comp);

        int n = 1;

        for (Contact c : sorted) {
            System.out.println((n++) + ") " + c.name + " - " + c.phone);
        }

    }

    private static void findByName(Scanner in) {

        if (!contacts.isEmpty()) {
            System.out.print("Введите часть имени (поиск без учета регистра): ");
        } else {
            System.out.println("Список пуст.");
            return;
        }

        String q = in.nextLine();

        if (q.isBlank()) {
            System.out.println("Пустой запрос.");
            return;
        }

        String qNorm = q.toLowerCase().trim();

        List<Contact> result = new ArrayList<>();

        for (Contact c : contacts) {
            String name = c.name.toLowerCase().trim();
            if (name.contains(qNorm)) {
                result.add(c);
            }
        }

        if (result.isEmpty()) {
            System.out.println("Ничего не найдено");
        } else {
            result.sort(
                    Comparator.comparing((Contact c) -> c.name, String.CASE_INSENSITIVE_ORDER)
                            .thenComparing(c -> c.phone));

            int n = 1;
            for (Contact c : result) {
                System.out.println((n++) + ") " + c.name + " - " + c.phone);
            }
        }


    }

    private static void deleteContact(Scanner in) {

        if (!contacts.isEmpty()) {
            System.out.print("Выберите номер из списка для удаления: ");
        } else {
            System.out.println("Список пуст.");
            return;
        }

        showAll();


        String deleteName = in.nextLine();

        if (contacts.isEmpty()) {
            System.out.println("Список пуст");
            return;
        }

        if (deleteName.isBlank()) {
            System.out.println("Номер не указан.");
            return;
        }

        for (char d : deleteName.toCharArray()) {
            if (!Character.isDigit(d)) {
                System.out.println("Введите целое число.");
                return;
            }

        }

        int n = Integer.parseInt(deleteName);
        int index = 0;

        if (1 <= n && n <= contacts.size()) {
            index = n - 1;
        } else {
            System.out.println("Номер вне диапазона");
            return;
        }

        contacts.sort(Comparator.comparing((Contact c) -> c.name, String.CASE_INSENSITIVE_ORDER)
                .thenComparing(c -> c.phone));

        Contact removed = contacts.remove(index);

        saveAllToFile();

        System.out.println("Удалён: " + removed.name + " — " + removed.phone);


    }

    private static void editContact(Scanner in) {
        if (!contacts.isEmpty()) {
            System.out.print("Выберите номер из списка для редактирования контакта: ");
        } else {
            System.out.println("Список пуст.");
            return;
        }

        showAll();

        System.out.print("Введите номер поля для редактирования:");
        String editor = in.nextLine().trim();

        if (editor.isBlank()) {
            System.out.println("Номер не указан.");
            return;
        }

        for (char d : editor.toCharArray()) {
            if (!Character.isDigit(d)) {
                System.out.println("Введите целое число.");
                return;
            }

        }

        int n = Integer.parseInt(editor);
        int index = 0;

        if (1 <= n && n <= contacts.size()) {
            index = n - 1;
        } else {
            System.out.println("Номер вне диапазона");
            return;
        }

        ArrayList<Contact> edited = new ArrayList<>(contacts);
        edited.sort(Comparator.comparing((Contact c) -> c.name, String.CASE_INSENSITIVE_ORDER)
                .thenComparing(c -> c.phone));

        System.out.print("Введите новое имя: ");
        String newName = in.nextLine().trim();
        System.out.print("Введите новый номер: ");
        String newPhone = in.nextLine().trim();

        String finalName;
        String finalPhone;

        Contact selected = edited.get(index);

        String oldName = selected.name;
        String oldPhone = selected.phone;


        if (newName.contains(";") || newPhone.contains(";")) {
            System.out.println("Разделитель \";\" не допускается.");
            return;
        }

        String finalNewName = newName.isBlank() ? oldName : newName;
        String finalNewPhone = newPhone.isBlank() ? oldPhone : newPhone;


        for (Contact c : contacts) {
            if (c == selected) continue; // пропускаем самого себя
            if (c.name.equals(finalNewName) && c.phone.equals(finalNewPhone)) {
                System.out.println("Такой контакт уже существует");
                return;
            }
        }

        selected.name = finalNewName;
        selected.phone = finalNewPhone;

        saveAllToFile();
    }


    public static void main(String[] args) {
        loadContactsFromFile();

        Scanner in = new Scanner(System.in);
        while (true) {
            printMenu();
            System.out.print("\nВыбор команды: ");
            String cmd = in.nextLine().trim();
            System.out.println();


            switch (cmd) {
                case "1":
                    addContact(in);
                    break;

                case "2":
                    showAll();
                    break;

                case "3":
                    findByName(in);
                    break;

                case "4":
                    deleteContact(in);
                    break;

                case "5":
                    editContact(in);
                    break;

                case "0":
                    in.close();
                    System.out.println("Пока!");
                    return;

                default:
                    System.out.println("Введите корректную команду");
            }

        }
    }

}
