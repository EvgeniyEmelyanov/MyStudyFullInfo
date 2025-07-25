package Basic_Part_1;

import java.util.Scanner;

public class Decimal_to_Binary_Converter_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Decimal Number: ");
        int decimal = sc.nextInt();
        String converted = Integer.toBinaryString(decimal);
        System.out.println(converted);
    }
}
