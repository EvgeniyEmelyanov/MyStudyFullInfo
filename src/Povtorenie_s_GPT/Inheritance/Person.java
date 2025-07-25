package Povtorenie_s_GPT.Inheritance;

import java.util.Scanner;

public class Person {
    private String name;
    private int age;

    public void setInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.print ("Name: " + name + ", Age: " + age);
    }
}

class Student extends Person {
    private int grade;

    public void setInfo (String name, int age, int grade){
        super.setInfo(name, age);
        this.grade = grade;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println(", Grade: " + grade);
    }

}

class Teacher extends Person {
    private String subject;

    public void setInfo(String name, int age, String subject) {
        super.setInfo(name, age);
        this.subject = subject;
    }
    public void printInfo() {
        super.printInfo();
        System.out.print (", Subject: " + subject + "\n");
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person [] people = new Person[4];

        int couterTeacher = 0;
        int couterStudent = 0;
        for (int i = 0; i < people.length; i++) {
            System.out.print("Введите тип (1 = Student, 2 = Teacher): ");
            int type = sc.nextInt();
            sc.nextLine();

            System.out.print ("Введите имя: ");
            String name = sc.nextLine();

            System.out.print("Введите возраст: ");
            int age = sc.nextInt();
            sc.nextLine();

            if (type == 1) { // Student
                people[i] = new Student();
                couterStudent++;
                System.out.print("Введите оценку: ");
                int grade = sc.nextInt();
                sc.nextLine();
                ((Student) people[i]).setInfo(name, age, grade);

            } else if (type == 2) { // Teacher
                people[i] = new Teacher();
                couterTeacher++;
                System.out.print("Введите предмет: ");
                String subject = sc.nextLine();
                ((Teacher) people[i]).setInfo(name, age, subject);

            } else {
                System.out.println("Неверный тип! Пропускаем...");
            }
        }



/*
        people[0] = new Student();
        ((Student) people[0]).setInfo("Alex", 12, 22);
        people[1] = new Teacher();
        ((Teacher) people [1]).setInfo("John", 60, "Math");
        people[2] = new Student();
        ((Student) people[2]).setInfo("Bob", 17, 45);
        people[3] = new Teacher();
        ((Teacher)people[3]).setInfo("Alex", 12, "Psychology");
*/

        for (Person p: people){
            p.printInfo();
        }

        System.out.println("Всего студентов: " + couterStudent);
        System.out.println("Всего учтителей: " + couterTeacher);
    }
}