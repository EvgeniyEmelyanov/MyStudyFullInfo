package Basic_Part_1;

import java.util.Scanner;

public class Number_Comparison_Logic_53 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.println("Enter the third number: ");
        int num3 = sc.nextInt();

        System.out.println("Enter the abc");
        boolean b1 = sc.nextBoolean();

        sc.close();

        System.out.println("\n");

//        if (b1==false && num2 > num1 && num2 > num3) {
//            System.out.println("Input the first number: " + num1);
//            System.out.println("Input the second number: " + num2);
//            System.out.println("Input the third number: " + num3);
//            System.out.println("The result is: true);
//        }else (b1 =true && num3>num2) {
//            System.out.println("Input the first number: " + num1);
//            System.out.println("Input the second number: " + num2);
//            System.out.println("Input the third number: " + num3);
//            System.out.println("The result is: true);
//        }


    }
}

     class Exercise53 {
        public static void main(String[] args) {
            // Create a Scanner object for user input
            Scanner in = new Scanner(System.in);

            // Prompt the user to input the first number
            System.out.print("Input the first number: ");
            int x = in.nextInt();

            // Prompt the user to input the second number
            System.out.print("Input the second number: ");
            int y = in.nextInt();

            // Prompt the user to input the third number
            System.out.print("Input the third number: ");
            int z = in.nextInt();

            // Prompt the user to input a boolean value (true or false)
            System.out.print("Input a boolean value (true/false): ");
            boolean xyz = in.nextBoolean();

            // Calculate the result using the test function and display it
            System.out.print("The result is: " + test(x, y, z, xyz));

            // Print a new line for better formatting
            System.out.print("\n");
        }

        // Function to test conditions based on boolean input
        public static boolean test(int p, int q, int r, boolean xyz) {
            if (xyz)
                return (r > q);
            return (q > p && r > q);
        }
    }
