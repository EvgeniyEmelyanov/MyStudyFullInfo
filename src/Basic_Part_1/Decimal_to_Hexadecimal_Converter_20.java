package Basic_Part_1;

import java.util.Scanner;

public class Decimal_to_Hexadecimal_Converter_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        String binary = Integer.toHexString(decimal);
        System.out.println(binary);
    }
}
