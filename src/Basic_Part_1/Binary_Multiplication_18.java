package Basic_Part_1;

import java.util.Scanner;

public class Binary_Multiplication_18 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Input first binary number: ");
            int binary1 = sc.nextInt();
            System.out.print("Input second binary number: ");
            int binary2 = sc.nextInt();

            String binary3 = Integer.toBinaryString(binary1);
            String binary4 = Integer.toBinaryString(binary2);

            int result = binary1*binary2;
            System.out.println(result);

        }
    }
