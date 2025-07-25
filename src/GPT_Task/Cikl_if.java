package GPT_Task;

import java.util.ArrayList;
import java.util.Scanner;

public class Cikl_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введие число: ");
        int num = sc.nextInt();
        sc.nextLine();

        if (num % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");

        }
    }
}

class Cikl_if2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Число положительно");
        } else if (num < 0) {
            System.out.println("Число отрицательно");
        } else if (num == 0) {
            System.out.println("Число равно 0");
        }
    }
}

class Cikl_if3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введи балл (от 0 до 100): ");

        int num = sc.nextInt();

        if (num >= 90 && num <= 100) {
            System.out.println("\n" + "Отлично");
        } else if (num >= 70 && num <= 89) {
            System.out.println("\n" + "Хорошо");
        } else if (num >= 50 && num <= 69) {
            System.out.println("\n" + "Удовлетворительно");
        } else if (num >= 0 && num <= 49) {
            System.out.println("\n" + "Неудовлетворительно");
        } else {
            System.out.println("\n" + "Введите корректное значение");
        }

    }
}

class Cikl_if4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = sc.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = sc.nextInt();
        System.out.print("Введите третье число: ");
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println(num3);
        }


    }
}

class Cikl_if5 {
    private final String rightLog = "admin";
    private final String rightPass = "1234";


    public boolean isEquals(String str, String str2) {
        return str.equals(rightLog) && str2.equals(rightPass);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите логин: ");
        String str = sc.nextLine();
        System.out.println("Введите пароль: ");
        String str2 = sc.nextLine();
        Cikl_if5 s1 = new Cikl_if5();

        if (s1.isEquals(str, str2)) {
            System.out.println("Доступ разрешён");
        } else {
            System.out.println("Ошибка входа");
        }


    }

}

class Cikl_if6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = sc.nextInt();

        // Проверяем условия високосного года
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Високосный год");
        } else {
            System.out.println("Не високосный год");
        }
    }
}

class Cikl_if7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите Ваш средний балл: ");
        double num1 = sc.nextDouble();
        System.out.print("Введите Ваш процент посещаемости: ");
        int num2 = sc.nextInt();

        if (num1 >= 4.0 && num1 <= 10.0 && num2 >= 75 && num2 <= 100) {
            System.out.println("Допуск получен");
        } else if (num1 < 0 || num1 > 10.0 || num2 < 0 || num2 > 100) {
            System.out.println("Введите корректное значение");
        } else {
            System.out.println("Допуск не получен");
        }
    }
}

class Cikl_if8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ввод данных
        System.out.print("Введите логин: ");
        String inputLogin = sc.nextLine();

        System.out.print("Введите пароль: ");
        String inputPass = sc.nextLine();

        // Правильные логины и пароли
        String adminLogin = "admin";
        String adminPass = "1234";

        String userLogin = "user";
        String userPass = "1234";

        // Логика проверки
        if (inputLogin.equals(adminLogin) && inputPass.equals(adminPass)) {
            System.out.println("Полный доступ");
        } else if (inputLogin.equals(userLogin) && inputPass.equals(userPass)) {
            System.out.println("Ограниченный доступ");
        } else {
            System.out.println("Доступ запрещён");
        }
    }
}

class Cikl_if9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = sc.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }
}
