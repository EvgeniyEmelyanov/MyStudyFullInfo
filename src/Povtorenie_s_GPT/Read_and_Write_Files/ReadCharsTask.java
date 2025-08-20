package Povtorenie_s_GPT.Read_and_Write_Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.nio.file.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


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
}

class PhoneBookListDemo {
    private static final String FILE_PATH = "phonebooklist.txt";

    public static void main(String[] args) {
        List<Contact> contacts = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        while (true) {
            printMenu();
            String cmd = in.nextLine().trim();
            switch (cmd) {
                case "1":
                    addContact(in, contacts);
                    break;
                case "2":
                    showAll(contacts);
                    break;

                case "0":
                    System.out.println("Пока");
                    return;
            }
        }


    }

    private static void printMenu() {
        System.out.println("=== Телефонная книга ===");
        System.out.println("1) Добавить контакт");
        System.out.println("2) Показать все");
        System.out.println("0) Выход");
        System.out.print("Выбор: ");
    }

    private static void addContact(Scanner in, List<Contact> contacts) {
        System.out.print("Имя: ");
        String name = in.nextLine().trim();

        System.out.print("Номер: ");
        String phone = in.nextLine().trim();


        contacts.add(new Contact(name, phone));

        if (name.isEmpty() || phone.isEmpty()) {
            System.out.println("Ошибка: имя и телефон не должны быть пустыми.");
            return;
        }


        try (FileWriter fw = new FileWriter(FILE_PATH, true);
             PrintWriter pw = new PrintWriter(fw)) {
            pw.println(name + ";" + phone);
            System.out.println("Сохранено: " + name + " -> " + phone);
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }


    }

    private static void showAll(List<Contact> contacts) {
        System.out.println("Список контактов: ");

        for (Contact contact : contacts) {
            System.out.println(contact.toString());
        }

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))){
            String line;
            int n = 0;

        }
    }


}