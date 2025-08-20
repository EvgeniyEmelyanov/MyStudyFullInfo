package Povtorenie_s_GPT.Exception;

public class DivisionTask {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0; // попробуй менять на 2, 0, -5
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка:Деление на ноль!");
        }

        // TODO: реализовать try-catch для деления
    }
}

class ArrayTask {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};

            // TODO: попробуй обратиться к arr[5]
            // и обработать ArrayIndexOutOfBoundsException
            System.out.println(arr[5]);


        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива!");
        }
    }
}

class ParseTask {
    public static void main(String[] args) {
        try {
            String str = "1s"; // попробуй менять на "123", "42a", "0"
            int num = Integer.parseInt(str);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: некорректный формат числа!");
        }


        // TODO: преобразовать строку в число
        // и обработать NumberFormatException
    }
}

class FinallyTask {
    public static void main(String[] args) {
        int[] arr = {10, 20};

        try {
            // TODO: обратиться к arr[5]
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: выход за пределы массива!");
        } finally {
            int a = 1 + 2;
            System.out.println("finally сработал " + a);
        }

        System.out.println("Программа продолжает работу.");
    }
}

class ThrowTask {
    public static void main(String[] args) {
        try {
            checkAge(15); // должен сработать throw
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        checkAge(20); // должен вывести "Доступ разрешён!"
    }

    static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Доступ запрещён!");
        } else {
            System.out.println("Доступ разрешён!");
        }
    }
}

class ThrowsTask {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Результат: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль невозможно!");
        }
        return a / b;


        // TODO: реализовать проверку и выброс исключения
    }
}

// 1. Свой класс исключения
class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

class CustomExceptionTask {
    public static void main(String[] args) {
        try {
            checkAge(15); // должно выбросить AgeException
        } catch (AgeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            checkAge(20); // должно вывести "Доступ разрешён!"
        } catch (AgeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    // 2. Метод с throws
    static void checkAge(int age) throws AgeException {
        // TODO: реализовать проверку возраста
        if (age < 18) {
            throw new AgeException("Доступ запрещён!");
        } else {
            System.out.println("Доступ разрешён!");
        }
    }
}


// 1. Свой класс исключения
class BankException extends Exception {
    public BankException(String message) {
        super(message);
    }
}

class BankTask {
    public static void main(String[] args) {
        try {
            withdraw(100, 150); // недостаточно средств
        } catch (BankException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            System.out.println("Операция завершена.\n");
        }

        try {
            withdraw(100, -5); // некорректная сумма
        } catch (BankException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            System.out.println("Операция завершена.\n");
        }

        try {
            withdraw(100, 50); // успех
        } catch (BankException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            System.out.println("Операция завершена.\n");
        }
    }

    // 2. Метод с throws
    static void withdraw(int balance, int amount) throws BankException {
        if (balance < amount) {
            throw new BankException("Недостаточно средств");
        } else if (amount <=0) {
            throw  new BankException("Некорректная сумма");
        }
        else  {
            System.out.println("Остаток средств: " + (double) balance/amount);
        }
    }
}
