package Basic_Part_1;

import java.util.Scanner;

public class Compare_Two_Numbers_32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        sc.close();

        if (a == b) {
            System.out.printf("%d == %d\n", a, b);
        }
        if (a > b) {
            System.out.printf("%d > %d\n", a, b);
        }
        if (a < b) {
            System.out.printf("%d < %d\n", a, b);
        }
        if (a >=b){
            System.out.printf("%d >= %d\n", a, b);
        }
        if (a <=b) {
            System.out.printf("%d <= %d\n", a, b);
        }
        if (a !=b) {
            System.out.printf("%d != %d\n", a, b);
        }

    }
}
