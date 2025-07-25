package Basic_Part_1;

import java.util.Scanner;



public class Product_of_Two_Numbers_5 {
    public static void main(String[] args) {
        int a, b;
        a = 25;
        b = 5;
        System.out.println(a*b);
    }
}

class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое значение");
        int num1 = sc.nextInt();

        System.out.println("Введите второе значение");
        int num2 = sc.nextInt();

        System.out.println(num1 + " x " + num2 + " = " + num1 * num2);


    }

}