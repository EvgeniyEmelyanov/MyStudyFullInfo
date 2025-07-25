package Basic_Part_1;

import java.util.Scanner;

public class Sum_Equals_Third_Integer_52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.println("Enter the third number: ");
        int num3 = sc.nextInt();
        sc.close();

        int sum = num1 + num2;
        boolean equals = sum == num3;
        System.out.println(equals);
    }
}
