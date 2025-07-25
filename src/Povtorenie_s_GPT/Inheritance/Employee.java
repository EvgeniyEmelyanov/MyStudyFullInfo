package Povtorenie_s_GPT.Inheritance;

import java.util.Scanner;

public abstract class Employee {
    private String name;
    private double salary;

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

    public abstract void printInfo();

    public void increaseSalary(double multiplier) {
        setSalary(salary * multiplier);
    }
}

interface Payable {
    void pay();
}

interface Printable {
    void print();


    class Manager extends Employee implements Payable, Printable {
        private String department;

        public void setDepartment(String department) {
            this.department = department;
        }

        public String getDepartment() {
            return department;
        }

        @Override
        public void printInfo() {
            System.out.print("Name: " + getName() + ", Salary: " + getSalary() + ", Department: " + getDepartment());
        }

        @Override
        public void pay() {
            System.out.println(getName() + " получил зарплату: " + getSalary());
        }

        @Override
        public void print() {
            System.out.println(getName() + " умеет печатать текст");
        }
    }

    class Counter extends Employee implements Payable, Printable {
        private String department;

        public void setDepartment(String department) {
            this.department = department;
        }

        public String getDepartment() {
            return department;
        }

        @Override
        public void printInfo() {
            System.out.print("Name: " + getName() + ", Salary: " + getSalary() + ", Department: " + getDepartment());
        }

        @Override
        public void pay() {
            System.out.println(getName() + " получил зарплату: " + getSalary());
        }

        @Override
        public void print() {
            System.out.println(getName() + " умеет печатать текст");
        }
    }

    class Document implements Printable {
        private String title;

        public Document(String title) {
            this.title = title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }

        @Override
        public void print() {
            System.out.println("Название документа: " + getTitle());
        }
    }


    class Main1 {
        public static void main(String[] args) {
/*
            Scanner sc = new Scanner(System.in);
            Employee[] employees = new Employee[4];

            for (int i = 0; i < employees.length; i++) {
                System.out.print("Введите тип работника (1-Менеджер, 2-Бухгалтер): ");
                int choice = sc.nextInt();
                sc.nextLine();

                System.out.print("Введите имя работника: ");
                String name = sc.nextLine();

                System.out.print("Введите зарплату работника: ");
                double salary = sc.nextDouble();
                sc.nextLine();

                if (choice == 1) {
                    Manager manager = new Manager();
                    manager.setName(name);
                    manager.setSalary(salary);
                    System.out.print("Введите департамент: ");
                    String department = sc.nextLine();
                    manager.setDepartment(department);
                    employees[i] = manager;

                } else if (choice == 2) {
                    Counter counter = new Counter();
                    counter.setName(name);
                    counter.setSalary(salary);
                    System.out.print("Введите департамент: ");
                    String department = sc.nextLine();
                    counter.setDepartment(department);
                    employees[i] = counter;

                } else {
                    System.out.println("Перезапустите программу и введите корректные данные");
                    i--; // чтобы повторить итерацию
                }
            }

            System.out.println("\n=== Список сотрудников ===");
            for (Employee employee : employees) {
                employee.printInfo();
                System.out.println();
            }

            System.out.println("\n=== Выплата зарплаты ===");
            for (Employee employee : employees) {
                if (employee instanceof Payable) {
                    ((Payable) employee).pay();
                }
            }

            System.out.println("\n=== Повышение зарплаты на 20% ===");
            for (Employee employee : employees) {
                double oldSalary = employee.getSalary();
                employee.increaseSalary(1.2); // +20%
                System.out.println("Name: " + employee.getName() + ", OldSalary: " + oldSalary
                        + ", NewSalary: " + employee.getSalary());
            }

*/
            Scanner sc = new Scanner(System.in);
            Printable[] p = new Printable[3];
            for (int i = 0; i < p.length; i++) {

                System.out.println("Выберите какой объект создать " +
                        "(1-Менеджер, 2-Бухгалтер, 3-Документ): ");
                int choice = sc.nextInt();
                sc.nextLine();


                if (choice == 1) {
                    System.out.print("Введите имя: ");
                    String name = sc.nextLine();

                    System.out.print("Укажите зарплату: ");
                    double salary = sc.nextDouble();
                    sc.nextLine();

                    Manager m = new Manager();
                    m.setName(name);
                    m.setSalary(salary);
                    System.out.print("Введите департамент: ");
                    String department = sc.nextLine();
                    p[i] = m;

                } else if (choice == 2) {

                    System.out.print("Введите имя: ");
                    String name = sc.nextLine();
                    System.out.print("Укажите зарплату: ");
                    double salary = sc.nextDouble();
                    sc.nextLine();

                    Counter c = new Counter();
                    c.setName(name);
                    c.setSalary(salary);
                    System.out.print("Введите департамент: ");
                    String department = sc.nextLine();
                    p[i] = c;

                } else if (choice == 3) {
                    System.out.print("Введите имя документа: ");
                    String title = sc.nextLine();
                    Document d = new Document(title);

                    p[i] = d;

                } else {
                    System.out.println("Перезапустите программу и введите корректные данные");
                    i--; // чтобы повторить итерацию
                }
            }

            for (Printable printable : p) {
                if (printable instanceof Employee) {
                    ((Employee) printable).printInfo();
                } else {
                    printable.print(); // для документов
                }
            }


        }
    }
}

