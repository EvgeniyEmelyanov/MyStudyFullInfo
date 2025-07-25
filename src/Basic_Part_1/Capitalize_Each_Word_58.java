package Basic_Part_1;

import java.util.Scanner;

public class Capitalize_Each_Word_58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any words: ");
        String line = sc.nextLine();

        String UpperCaseLine = "";

        Scanner sc1 = new Scanner(line);
        while (sc1.hasNextLine()) {
            String word = sc1.next();
            UpperCaseLine += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }


        System.out.println(UpperCaseLine.trim());
    }
}
