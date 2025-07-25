package GPT_Task;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Put month number");
        int month = sc.nextInt();

        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month");
                break;

        }
    }

}

class Switch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер времени суток (1-4): ");
        int time = sc.nextInt();
        switch (time) {
            case 1:
                System.out.println("Утро");
                break;
            case 2:
                System.out.println("День");
                break;
            case 3:
                System.out.println("Вечер");
                break;
            case 4:
                System.out.println("Ночь");
                break;
            default:
                System.out.println("Invalid time");
                break;
        }
    }
}

class Switch3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введи номер месяца (1–12): ");
        int monthNum = sc.nextInt();
        switch (monthNum) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.print("Выбран месяц: ");
                if (monthNum == 1) {
                    System.out.print("Январь");
                } else if (monthNum == 3) {
                    System.out.print("Март ");
                } else if (monthNum == 5) {
                    System.out.print("Май ");
                } else if (monthNum == 7) {
                    System.out.print("Июль ");
                } else if (monthNum == 8) {
                    System.out.print("Август ");
                } else if (monthNum == 10) {
                    System.out.print("Октябрь ");
                } else if (monthNum == 12) {
                    System.out.print("Декабрь");
                }
                System.out.print("\n" + "В этом месяце 31 день.");
                break;

            case 4, 6, 9, 11:
                System.out.print("Выбран месяц: ");
                if (monthNum == 4) {
                    System.out.println("Апрель ");
                } else if (monthNum == 6) {
                    System.out.println("Июнь ");
                } else if (monthNum == 9) {
                    System.out.println("Сентябрь ");
                } else if (monthNum == 11) {
                    System.out.println("Ноябрь ");
                }
                System.out.print("\n" + "В этом месяце 30 дней.");
                break;

            case 2:
                System.out.print("Выбран месяц: февраль");
                System.out.print("\n" + "В этом месяце 28 дней.");
                break;
            default:
                System.out.println("Некорректный номер месяца");
        }
    }
}

class Switch4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double num = sc.nextDouble();
        System.out.println("Введите второе число: ");
        double num2 = sc.nextDouble();
        System.out.println("Введите символ операции (+, -, *, /): ");
        String op = sc.next();
        double result;

        switch (op) {
            case "+":
                result = num + num2;
                System.out.println(result);
                break;

            case "-":
                result = num - num2;
                System.out.println(result);
                break;

            case "*":
                result = num * num2;
                System.out.println(result);
                break;

            case "/":
                result = num / num2;
                System.out.println(result);
                break;
            default:
                if (!op.equals("+") && !op.equals("-") && !op.equals("*") && !op.equals("/")) {
                    System.out.println("Некорректная операция");
                }
        }
    }
}
