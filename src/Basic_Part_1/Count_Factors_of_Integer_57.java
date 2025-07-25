package Basic_Part_1;

import java.util.Scanner;

public class Count_Factors_of_Integer_57 {
    static int count;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count ++;
                System.out.println(i);
            }

        }
       System.out.println();
        System.out.println(count);
    }
}
class CountDivisors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        int count = 0;
        int i = 1; // Инициализация счетчика для делителей

        // Подсчет делителей с использованием цикла while
        while (i <= number) {
            if (number % i == 0) {
                count++;
            }
            i++; // Увеличиваем i на 1
        }

        System.out.println("Количество делителей числа " + number + ": " + count);
    }
}