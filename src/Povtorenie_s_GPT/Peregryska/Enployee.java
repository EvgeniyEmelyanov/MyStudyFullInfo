package Povtorenie_s_GPT.Peregryska;

import Povtorenie_s_GPT.Inheritance.Employee;

public class Enployee {
    private String name;
    private double salary;
    private String department;

    public void setInfo(String name) {
        this.name = name;
        salary = 0;
        department = "Unknown";
    }

    public void setInfo(String name, double salary) {
        this.name = name;
        this.salary = salary;
        department = "Unknown";
    }



    public void setInfo(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }



    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

}
class Main {
    public static void main(String[] args) {
        Enployee e1 = new Enployee();
        e1.setInfo("Alex");
        Enployee e2 = new Enployee();
        e2.setInfo("Bob", 12);
        Enployee e3 = new Enployee();
        e3.setInfo("Charlie",12, "IT");
    }
}
