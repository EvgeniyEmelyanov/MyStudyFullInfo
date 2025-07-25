package Basic_Part_1;

import java.util.Scanner;

public class Convert_to_Lowercase_59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();
        String lowercase = sentence.toLowerCase();

        System.out.println(lowercase);
    }
}
