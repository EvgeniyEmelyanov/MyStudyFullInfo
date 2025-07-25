package Basic_Part_1;

import java.util.Scanner;

public class Seconds_to_Time_Conversion_55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        sc.close();

        int Sec =a%60;
        int Hour =a/60;
        int Min =Hour%60;
        Hour /=60;

        System.out.println(Hour  + ":" + Min + ":" +Sec);
    }
}
