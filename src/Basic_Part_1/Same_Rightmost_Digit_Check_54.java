package Basic_Part_1;

import java.util.Scanner;

public class Same_Rightmost_Digit_Check_54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Enter the third number: ");
        int c = sc.nextInt();
        System.out.println("Input a boolean value (true/false): ");
        boolean x = sc.nextBoolean();
        sc.close();
        System.out.println("The result is: " + test(a, b, c, x));
    }
    public static boolean test(int a, int b, int c, boolean x) {
        return (a%10 == b%10) || (a%10 == c%10) || (b%10==c%10);
    }
}
