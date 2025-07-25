package Povtorenie_s_GPT.LinkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TaskQueue {
    private LinkedList<String> tasks = new LinkedList<>(); // поле класса

    // Добавить задачу в конец очереди
    public void addTask(String task) {
        tasks.addLast(task);
        System.out.println("Добавлена задача: " + task);
    }

    // Вернуть и удалить первую задачу из очереди
    public String nextTask() {
        if (!tasks.isEmpty()) {
            String task = tasks.removeFirst();
            System.out.println("Следующая задача: " + task);
            return task;
        } else {
            System.out.println("Очередь пуста");
            return null;
        }
    }

    // Проверить, пуст ли список задач
    public boolean isEmpty() {
        return tasks.isEmpty();
    }

    // Вывести все задачи на экран
    public void showAllTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Список задач пуст");
        } else {
            System.out.println("Очередь задач: " + tasks);
        }
    }

    public static void main(String[] args) {
        TaskQueue queue = new TaskQueue();

        // Добавляем задачи
        queue.addTask("Уборка комнаты");
        queue.addTask("Помыть посуду");
        queue.addTask("Сделать домашку");

        // Показать все задачи
        queue.showAllTasks();

        // Получить следующую задачу
        queue.nextTask();

        // Показать оставшиеся задачи
        queue.showAllTasks();

        // Удалить все оставшиеся задачи
        queue.nextTask();
        queue.nextTask();

        // Попытка взять задачу из пустой очереди
        queue.nextTask();

        // Проверка пустоты списка
        System.out.println("Очередь пуста? " + queue.isEmpty());
    }
}

class ActionHistory {
    private LinkedList<String> action = new LinkedList<>();

    public void addAction(String action) {
        this.action.addLast(action);
    }

    public String undoAction() {
        if (!action.isEmpty()) {
            String temp = action.removeLast();
            System.out.println("Действие: \"" + temp + "\" удалено");
            return temp;
        } else {
            System.out.println("История пуста");
        }
        return null;
    }

    public void showHistory() {
        if (!action.isEmpty()) {
            System.out.println("История " + action);
        }
    }

    public void clearHistory() {
        action.clear();
        System.out.println("История очищена");

    }

    public static void main(String[] args) {
        ActionHistory actionHistory = new ActionHistory();
        actionHistory.addAction("Открыть сайт");
        actionHistory.addAction("Скачать файл");
        actionHistory.addAction("Запустить файл");
        actionHistory.showHistory();
        actionHistory.undoAction();
        actionHistory.showHistory();
        actionHistory.clearHistory();
        actionHistory.undoAction();
    }

}


class ShoppingList {
    private LinkedList<String> shoppingList = new LinkedList<>();

    public void addItem(String item) {
        shoppingList.addLast(item);
        System.out.println("Добавлено: " + item);
    }

    public void removeItem(String item) {
        if (shoppingList.contains(item)) {
            shoppingList.remove(item);
            System.out.println("Удалено: " + item);
        } else {
            System.out.println("Товар не найден: " + item);
        }
    }

    public boolean containsItem(String item) {
        return shoppingList.contains(item);
    }

    public int findItemIndex(String item) {
        int index = shoppingList.indexOf(item);
        if (index != -1) {
            System.out.println("Индекс товара \"" + item + "\": " + index);
        } else {
            System.out.println("Товар не найден: " + item);
        }
        return index;
    }

    public void showList() {
        if (shoppingList.isEmpty()) {
            System.out.println("Список пуст");
        } else {
            System.out.println("Список покупок:");
            for (int i = 0; i < shoppingList.size(); i++) {
                System.out.println((i + 1) + ". " + shoppingList.get(i));
            }
        }
    }

    public void clear() {
        shoppingList.clear();
        System.out.println("Список очищен");
    }

    public boolean isEmpty() {
        return shoppingList.isEmpty();
    }

    public static void main(String[] args) {
        ShoppingList shoppingList = new ShoppingList();
        Scanner sc = new Scanner(System.in);

        shoppingList.addItem("Хлеб");
        shoppingList.addItem("Молоко");
        shoppingList.addItem("Сыр");
        shoppingList.showList();

        System.out.print("\nВведите товар для поиска: ");
        String itemToFind = sc.nextLine();
        shoppingList.containsItem(itemToFind);

        System.out.print("Введите товар для определения индекса: ");
        String itemIndex = sc.nextLine();
        shoppingList.findItemIndex(itemIndex);

        System.out.print("Введите товар для удаления: ");
        String itemToRemove = sc.nextLine();
        shoppingList.removeItem(itemToRemove);

        System.out.println(shoppingList.isEmpty());
        shoppingList.showList();

        shoppingList.clear();
        shoppingList.showList();
    }
}

class PhoneBook {
    private  List<Contact> phoneBook = new LinkedList<Contact>();

    public  void addContact(String name, String phone) {
        Contact contact = new Contact(name, phone);
        phoneBook.add(contact);
        System.out.println("Контакт " + contact + " создан");
    }

    public  void removeContact(String name) {
        for (Contact contact : phoneBook) {
            if (contact.name.equals(name)) {
                System.out.println("Контакт \"" + contact.name + "\" удален" );
                phoneBook.remove(contact);
                break;
            }
        }
    }

    public  boolean hasContact(String name) {
        for (Contact contact : phoneBook) {
            if (contact.name.equals(name)) {
                System.out.println("Контакт с именем " +  name + " найден");
                return true;
            }
        }
        System.out.println("Контакт с именем " +  name + " не найден");
        return false;
    }

    public  void showContacts() {
        if (!phoneBook.isEmpty()) {
            System.out.println("Список контактов: ");
            for (int i = 0; i < phoneBook.size(); i++) {
                System.out.println((i + 1) + ". " + phoneBook.get(i));
            }
        } else {
            System.out.println("Список контактов пуст");
        }

    }

    public  void clear() {
        phoneBook.clear();
        System.out.println("Телефонная книга очищена");
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact("Alex", "12345");
        phoneBook.addContact("Bob", "56789");
        phoneBook.addContact("Jon", "99999");

        phoneBook.showContacts();

        phoneBook.removeContact("Bob");

        phoneBook.showContacts();

        phoneBook.hasContact("Jon");
        phoneBook.hasContact("Bob");

        phoneBook.clear();
        phoneBook.showContacts();
    }
}



class Contact {
    String name;
    String phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return name + " - " + "+" + phone;
    }
}
