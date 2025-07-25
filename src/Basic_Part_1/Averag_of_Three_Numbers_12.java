package Basic_Part_1;

import java.util.Scanner;

public class Averag_of_Three_Numbers_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Enter the third number: ");
        int c = sc.nextInt();
        System.out.println((a + b + c)/3);
        sc.close();
    }
}
