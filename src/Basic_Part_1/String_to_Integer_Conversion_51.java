package Basic_Part_1;

import java.util.Scanner;

public class String_to_Integer_Conversion_51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        int res = Integer.parseInt(str);
        System.out.println("The integer value is: " + res);

    }
}
