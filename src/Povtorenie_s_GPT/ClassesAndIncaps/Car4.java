package Povtorenie_s_GPT.ClassesAndIncaps;

import java.util.Scanner;

public class Car4 {
    private String model;
    private int year;

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void print() {
        System.out.println("Model: " + model + " Year: " + year);
    }
}
class mainn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car4 [] car = new Car4[3];

        for (int i = 0; i < 3; i++) {
            car[i] = new Car4();

            System.out.println("Enter the model car number " + (i + 1));
            String model = sc.nextLine();

            System.out.println("Enter the year car number " + (i + 1));
            int year = sc.nextInt();
            sc.nextLine();

            car[i].setModel(model);
            car[i].setYear(year);

        }

        for (Car4 c : car) {
            c.print();
        }

    }
}