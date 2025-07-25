package Povtorenie_s_GPT;


public abstract class Person2 {
    private String name;
    private int age;

    public void setInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void printInfo() {
        System.out.print("Name: " + name + ", Age: " + age);
    }

}


interface Printable2 {
    void print();
}

class Teacher2 extends Person2 implements Printable2 {

    public void printInfo() {
        super.printInfo();
    }

    @Override
    public void print() {
        System.out.print (" can write");
    }


}

class Student2 extends Person2 implements Printable2 {

    public void printInfo() {
        super.printInfo();
    }

    @Override
    public void print() {
        System.out.println(" can write");
    }
}

class Main2 {
    public static void main(String[] args) {
        Printable2 [] p = new Printable2[2];
        p[0] = new Teacher2();
        ((Teacher2) p[0]).setInfo ("Alex", 21);
        p[1] = new Student2();
        ((Student2) p[1]).setInfo ("Bob", 22);

        for (Printable2 p2 : p) {
            ((Person2)p2).printInfo();
            p2.print();
            System.out.println();
        }

    }
}