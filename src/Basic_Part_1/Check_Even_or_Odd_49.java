package Basic_Part_1;

import java.util.Scanner;

public class Check_Even_or_Odd_49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n%2==0){
            System.out.println("This number is even" + " 1");
        } else {
            System.out.println("This number is odd" + " 0");
        }
    }
}
