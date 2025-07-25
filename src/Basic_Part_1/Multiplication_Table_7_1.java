package Basic_Part_1;

import java.util.Scanner;

public class Multiplication_Table_7_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(a + "*" + i + "=" + a*i);
        }
    }

}
