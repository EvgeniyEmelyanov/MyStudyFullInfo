package Povtorenie_s_GPT.ClassesAndIncaps;

import java.util.Scanner;

class Person {
    String name;
    int age;


    public void sayHello() {
        System.out.println("Hello my name is " + name + " I'm " +
                age + "y.o.");
    }
}

class Main {
    public static void main(String[] args) {
        Person anton = new Person();
        anton.name = "Anton";
        anton.age = 12;
        anton.sayHello();


    }
}

class Person2 {
    String name;
    int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public void sayHello() {
        System.out.println("Hello my name is " + name + " I'm " +
                age + " y.o.");
    }
}

class Main2 {
    public static void main(String[] args) {
        Person2[] people = new Person2[3];

        Person2 anton = new Person2("Anton", 12);
        Person2 abdul = new Person2("Abdul", 12);
        Person2 boris = new Person2("Boris", 12);
        people[0] = anton;
        people[1] = abdul;
        people[2] = boris;

        for (int i = 0; i < people.length; i++) {
            people[i].sayHello();
        }


    }
}

class Car {
    String model;
    int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;

    }

    public void printInfo() {
        System.out.println("Model: " + model + " Year: " + year);
    }
}

class Main3 {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        Car bmw = new Car("BMW", 2024);
        Car mazda = new Car("Mazda", 2024);
        Car toyota = new Car("Toyota", 2024);

        cars[0] = bmw;
        cars[1] = mazda;
        cars[2] = toyota;

        for (int i = 0; i < cars.length; i++) {
            cars[i].printInfo();
        }
    }

}

class Student {
    String name;
    int grade;

    public void setInfo(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public void printInfo() {
        System.out.println("Name: " + name + ", Grade: " + grade);
    }
}

class Main4 {
    public static void main(String[] args) {
        Student[] students = new Student[3];

        students[0] = new Student();
        students[0].setInfo("Alice", 90);

        students[1] = new Student();
        students[1].setInfo("Bob", 85);

        students[2] = new Student();
        students[2].setInfo("Charlie", 95);

        for (Student s : students) {
            s.printInfo();
        }
    }
}

class Student2 {
    public String name;
    public int grade;

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public void printInfo() {
        System.out.println("Name: " + name + ", Grade: " + grade);
    }
}

class Main5 {
    public static void main(String[] args) {
        Student2[] students = new Student2[3];
        students[0] = new Student2();
        students[1] = new Student2();
        students[2] = new Student2();


        students[0].setName("Alice");
        students[1].setName("Bob");
        students[2].setName("Charlie");
        students[0].setGrade(90);
        students[1].setGrade(85);
        students[2].setGrade(95);


        for (Student2 s : students) {
            s.printInfo();

        }
    }
}

class Student3 {
    private String name;
    private int grade;

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public void printInfo() {
        System.out.println("Name: " + name + ", Grade: " + grade);
    }
}

class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student3[] students = new Student3[3];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student3();

            System.out.print("Введите имя студента #" + (i + 1) + ": ");
            String name = scanner.nextLine();
            students[i].setName(name);


            System.out.print("Введите оценку студента #" + (i + 1) + ": ");
            int grade = scanner.nextInt();
            students[i].setGrade(grade);

            scanner.nextLine();
        }

        System.out.println("\nСписок студентов:");
        for (Student3 s : students) {
            s.printInfo();
        }
    }
}

class Student4 {
    private String name;
    private int grade;

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public void printInfo() {
        System.out.println("Name: " + name + ", Grade: " + grade);
    }
}
class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student4[] students = new Student4[3];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student4();

            System.out.print ("Введите имя студента №" + (i + 1) + ": ");
            String name = scanner.nextLine();
            students[i].setName(name);

            System.out.print ("Введите оценку студента №" + (i + 1) + ": ");
            int grade = scanner.nextInt();
            students[i].setGrade(grade);

            scanner.nextLine();
        }
        for (Student4 s : students) {
            s.printInfo();
        }

        Student4 topstudent = students [0];
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGrade() > topstudent.getGrade()) {
                topstudent = students[i];

            }
        }
        System.out.println("Студент с максимальной оценкой: " + topstudent.getName() + " ("
                + topstudent.getGrade() + ")");

        int sumOfGrade = 0;
        for (int i = 0; i < students.length; i++) {
            sumOfGrade += students[i].getGrade();
        }
        double averageGrade = (double) sumOfGrade / students.length;
        System.out.printf("Средняя оценка студентов: %.1f%n", averageGrade);
    }
}
