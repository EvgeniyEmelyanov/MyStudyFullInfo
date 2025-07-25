package Basic_Part_1;

import java.util.Scanner;

public class Reverse_a_String_37 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        String a = sc.nextLine();

        StringBuilder sb = new StringBuilder(a);
        System.out.println(sb.reverse());
        sc.close();
    }
}
class Basic_Part_1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        char [] a = sc.nextLine().toCharArray();
        sc.close();

        for (int i = a.length-1; i >= 0; i--) {
            System.out.print(a[i]);
        }
        System.out.print("\n");

    }
}
