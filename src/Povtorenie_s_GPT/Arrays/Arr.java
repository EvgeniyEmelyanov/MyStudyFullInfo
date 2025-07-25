package Povtorenie_s_GPT.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Arr {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Алексей");
        names.add("Мария");
        names.add("Иван");

        System.out.println("Список сотрудников: " + names);
        names.remove("Мария");
        System.out.println("Список после удаления: " + names);

    }

}

class Arr1 {
    public static void main(String[] args) {
        ArrayList<String> productsNames = new ArrayList<>();
        productsNames.add("Хлеб");
        productsNames.add("Молоко");
        productsNames.add("Яйца");
        productsNames.add("Масло");
        productsNames.add("Сыр");
        System.out.println("Список товаров: " + productsNames);

        productsNames.set(2, "Яблоки");
        System.out.println("Список после замены :" + productsNames);
        productsNames.remove("Масло");
        boolean chess = productsNames.contains("Сыр");
        System.out.println("Товар 'Сыр' есть в списке: " + chess);
        System.out.println("Итоговый список:" + productsNames);
    }
}

class Arr2 {
    public static void main(String[] args) {
        ArrayList<Integer> studentsGrate = new ArrayList<Integer>();
        studentsGrate.add(5);
        studentsGrate.add(7);
        studentsGrate.add(9);
        studentsGrate.add(4);
        studentsGrate.add(6);
        System.out.println("List of students grate: " + studentsGrate);
        int sum = 0;
        for (int i = 0; i < studentsGrate.size(); i++) {
            sum += studentsGrate.get(i);

        }
        double averageGrade = (double) sum / studentsGrate.size();
        studentsGrate.remove(2);
        System.out.println("Sum = " + sum);
        System.out.println("average Grade = " + averageGrade);
        System.out.println("List of students grate after remove: " + studentsGrate);
    }
}

class Arr3 {
    public static ArrayList<Integer> doubleValues(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>(list.size());
        for (int i = 0; i < list.size(); i++) {
            result.add(list.get(i) * 2);
        }
        return result;
    }

    public static int sumList(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);

        }
        System.out.println("Сумма элементов списка: ");
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Исходный список: " + numbers);
        System.out.println("Список после умножения на 2 " + doubleValues(numbers));
        System.out.println(sumList(numbers));
    }
}

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;

    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Name: " + name + " Salary: " + salary;
    }


    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>(Arrays.asList(new Employee("Alice", 10), new Employee("Bob", 20), new Employee("Jack", 2000)));
        System.out.println("Список сотрудников:" + employees);


        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getName().equals("Alice")) {
                employees.remove(i);
                break; // иначе будет ConcurrentModificationException
            }
        }


        System.out.println("Список сотрудников:" + employees);


    }
}


class Employee1 {
    private final String name;
    private final double salary;

    public Employee1(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Salary: " + salary;
    }

    // ✅ TODO: Переопредели equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee1 employee1 = (Employee1) o;
        return Double.compare(employee1.salary, salary) == 0 && name.equals(employee1.name);
    }

    // ✅ TODO: Переопредели hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(name, salary);
    }


}

class Main1 {
    public static void main(String[] args) {
        ArrayList<Employee1> employee1 = new ArrayList<>(Arrays.asList(new Employee1("Alice", 5000), new Employee1("Bob", 6000), new Employee1("Jack", 7000)));

        System.out.println("Список сотрудников: " + employee1);

        // Пытаемся удалить Alice
        employee1.remove(new Employee1("Alice", 5000));

        System.out.println("Список сотрудников после удаления: " + employee1);
    }
}

class Employee2 {
    private final String name;
    private final double salary;

    public Employee2(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Salary: " + salary;
    }

    // ✅ TODO: Переопредели equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee2 employee2 = (Employee2) o;
        return Double.compare(employee2.salary, salary) == 0 && name.equals(employee2.name);
    }

    // ✅ TODO: Переопредели hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(name, salary);
    }

    public static Employee2 findEmployeeByName1(ArrayList<Employee2> list, String name) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)) {
                return list.get(i);
            }
        }
        return null;
    }


}

class Main3 {
    public static void main(String[] args) {
        ArrayList<Employee2> employee2 = new ArrayList<>(Arrays.asList(new Employee2("Alice", 5000), new Employee2("Bob", 6000), new Employee2("Jack", 7000)));

        System.out.println("Список сотрудников: " + employee2);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя сотрудника: ");
        String name = scanner.nextLine();

        System.out.println(Employee2.findEmployeeByName1(employee2, name));


    }
}

class ContactBook {
    private String name;
    private String number;

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }


    ContactBook(String name, String number) {
        this.name = name;
        this.number = number;
    }


    @Override
    public String toString() {
        return "Name: " + name + ", Number: " + number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactBook that = (ContactBook) o;
        return name.equals(that.name) && number.equals(that.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number);
    }

    public static void redactor(ArrayList<ContactBook> contacts) {
        while (true) {
            System.out.println("=== Телефонная книга ===");
            System.out.println("1. Добавить контакт\n" + "2. Удалить контакт\n" + "3. Найти контакт\n" + "4. Показать все контакты\n" + "5. Выйти");
            System.out.print("Выберите действие: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            scanner.nextLine();


            switch (choice) {
                case 1:
                    System.out.print("Введите имя: ");
                    String name = scanner.nextLine();
                    System.out.print("Введите телефон: ");
                    String number = scanner.nextLine();

                    ContactBook contactBook = new ContactBook(name, number);
                    contacts.add(contactBook);
                    System.out.println("Контакт добавлен " + contactBook);
                    break;

                case 2:
                    System.out.println("Введите имя или номер для удаления:");
                    String numbOrName = scanner.nextLine();
                    for (int i = 0; i < contacts.size(); i++) {
                        if (contacts.get(i).getName().equals(numbOrName) || contacts.get(i).getNumber().equals(numbOrName)) {
                            System.out.println("Контакт " + contacts.get(i).getName() + " удален");
                            contacts.remove(i);
                            break;
                        }
                    }
                    break;


                case 3:
                    System.out.println("Введите имя или номер для поиска:");
                    String findNumbOrName = scanner.nextLine();
                    boolean found = false;
                    for (int i = 0; i < contacts.size(); i++) {
                        if (contacts.get(i).getName().equals(findNumbOrName) || contacts.get(i).getNumber().equals(findNumbOrName)) {
                            System.out.println("Контакт " + contacts.get(i).getName() + " найден");
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Контакт не найден");
                    }
                    break;

                case 4:
                    System.out.println("Список контактов: ");
                    for (ContactBook contact : contacts) {
                        System.out.println(contacts);
                    }
                    break;

                case 5:
                    scanner.close();
                    return;
            }


        }
    }

    public static void main(String[] args) {
        ArrayList<ContactBook> contacts = new ArrayList<>();
        redactor(contacts);
    }
}


class ProductBasket {
    private String product;

    public ProductBasket(String product) {
        this.product = product;
    }

    public String getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductBasket that = (ProductBasket) o;
        return product.equals(that.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product);
    }

    public static void manageProducts(ArrayList<String> products) {
        Scanner scanner = new Scanner(System.in); // ✅ создаём Scanner один раз

        while (true) {
            System.out.println("\n=== Список товаров ===");
            System.out.println("1. Добавить товар" +
                    "\n2. Удалить товар" +
                    "\n3. Заменить товар" +
                    "\n4. Показать список" +
                    "\n5. Выйти");
            System.out.print("Выберите действие: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // очистка буфера после nextInt()

            switch (choice) {
                case 1:
                    System.out.print("Введите наименование товара: ");
                    String addProductName = scanner.nextLine();
                    products.add(addProductName);
                    System.out.println("Товар \"" + addProductName + "\" добавлен в список.");
                    break;

                case 2:
                    System.out.print("Введите наименование товара для удаления: ");
                    String findProductName = scanner.nextLine();
                    if (products.remove(findProductName)) { // ✅ удаление без цикла
                        System.out.println("Товар \"" + findProductName + "\" удалён.");
                    } else {
                        System.out.println("Товар \"" + findProductName + "\" не найден.");
                    }
                    break;

                case 3:
                    System.out.print("Введите наименование товара для замены: ");
                    String oldProductName = scanner.nextLine();
                    System.out.print("Введите новое наименование товара: ");
                    String newProductName = scanner.nextLine();

                    int index = products.indexOf(oldProductName); // ✅ ищем индекс сразу
                    if (index != -1) {
                        products.set(index, newProductName);
                        System.out.println("Товар \"" + oldProductName + "\" заменён на \"" + newProductName + "\".");
                    } else {
                        System.out.println("Товар \"" + oldProductName + "\" не найден для замены.");
                    }
                    break;

                case 4:
                    if (products.isEmpty()) {
                        System.out.println("Список товаров пуст.");
                    } else {
                        System.out.println("Список товаров:");
                        for (int i = 0; i < products.size(); i++) {
                            System.out.println((i + 1) + ". " + products.get(i));
                        }
                    }
                    break;

                case 5:
                    System.out.println("Выход из программы...");
                    scanner.close();
                    return; // ✅ завершение метода и программы

                default:
                    System.out.println("Некорректный выбор. Попробуйте ещё раз.");
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<String> products = new ArrayList<>();
        manageProducts(products);
    }
}




