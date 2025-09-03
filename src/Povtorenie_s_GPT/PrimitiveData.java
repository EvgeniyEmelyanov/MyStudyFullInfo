package Povtorenie_s_GPT;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class PrimitiveData {
    public static int calculateExpression(int a, int b) {
        int res = (a + b) * 2;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(calculateExpression(1, 2));
    }
}

class PrimitiveData1 {
    public static boolean isEven(int a) {

        return a % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println(isEven(3));
    }
}

class If_esle {
    public static void checkNumber(int numb) {
        if (numb < 0) {
            System.out.println("Меньше нуля");
        } else if (numb == 0) {
            System.out.println("Ноль");
        } else if (numb > 0 && numb <= 10) {
            System.out.println("От 1 до 10");
        } else if (numb > 10) {
            System.out.println("Больше 10");
        }

    }

    public static void main(String[] args) {
        If_esle.checkNumber(22);
    }
}

class If_esle1 {
    public static boolean canDrive(int age, boolean hasLicense) {
        if (age >= 18 && hasLicense == true) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(canDrive(18, false));
        System.out.println(canDrive(18, true));
        System.out.println(canDrive(16, true));
    }
}

class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose day of week (1-7): ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");

            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}


class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Please enter the options");
        char option1 = sc.next().charAt(0);
        System.out.println("Please enter the second number: ");
        double num2 = sc.nextDouble();
        double result = 0;

        switch (option1) {
            case '+':
                result = num1 + num2;
                System.out.println("The result is: " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("The result is: " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("The result is: " + result);
                break;

            case '/':
                if (num2 == 0) {
                    System.out.println("The number is zero");
                    break;

                } else {
                    result = num1 / num2;
                    System.out.println("The result is: " + result);
                }
                break;

            default:
                if (option1 != '+' && option1 != '-' && option1 != '*' && option1 != '/') {
                    System.out.println("Please enter correct option");

                }
                break;
        }
        sc.close();
    }
}

class For {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

class For_1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
            System.out.println(sum);
        }
    }
}

class For_2 {
    public static void main(String[] args) {
        int startNum = 5;
        int lastNum = 10;
        for (int i = 1; i <= lastNum; i++) {
            System.out.printf("%d * %d = %d%n", startNum, i, startNum * i);
        }
    }
}

class While {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        while (i <= 50) {
            if (i % 2 != 0) {
                i++;
                continue;
            }
            sum += i;
            System.out.println(sum);
            i++;

        }
    }
}

class Do_While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int sum = 0;

        do {
            System.out.print("Введите число (0 для выхода): ");
            i = sc.nextInt();
            sum += i;
        } while (i != 0);

    }
}

class While_1 {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }
}

class While_2 {
    public static void main(String[] args) {
        int startNum = 0;
        Scanner sc = new Scanner(System.in);
        int lastNum = sc.nextInt();
        int sum = 0;
        while (startNum <= lastNum) {
            sum += startNum;
            startNum++;

        }
        System.out.println(sum);
    }
}

class While_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int startNum = 1;
        int res = 1;
        while (startNum <= n) {
            res *= startNum;
            System.out.println(res);
            startNum++;
        }

    }
}

class While_4 {
    public static void main(String[] args) {
        int counter = 0;
        int startNum = 1;
        while (startNum <= 100) {
            if (startNum % 2 == 0) {
                counter++;
            }
            startNum++;
            System.out.println(counter);
        }
    }
}

class do_While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        do {
            System.out.print("Введите  число (чтобы завершить программу любое больше 0)): ");
            i = sc.nextInt();


        } while (i <= 0);
        System.out.println("Вы ввели положительное число " + i);

    }
}

class do_While_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        do {
            System.out.println("Выберите опцию: \n" + "1. Сложить \n" + "2. Вычесть\n" + "3. Выйти");
            i = sc.nextInt();

        } while (i != 3);
        System.out.println("Выход из программы");
    }
}

class do_While_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int sum = 0;

        do {
            System.out.print("Ведите число для последующего сложения (0 - выход)):  ");
            i = sc.nextInt();
            sum += i;

        } while (i != 0);
        System.out.println(sum);
        System.out.println("Выход из программы");
    }
}

class do_While_4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int secret = rand.nextInt(100) + 1;
        ;
        Scanner sc = new Scanner(System.in);
        int i;
        do {
            System.out.print("Угадайте число от 1 до 100: ");
            i = sc.nextInt();
            if (i > secret) {
                System.out.println("Ваш вариает: " + i);
                System.out.println("Слишком много!");

            } else if (i < secret) {
                System.out.println("Ваш вариает: " + i);
                System.out.println("Слишком мало!");

            }

        } while (secret != i);
        System.out.println("Вы угадали");

    }
}

class Methods {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 2));
    }
}

class Methods2 {
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        System.out.println(max(4, 2));
    }
}

class Methods3 {
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        System.out.println(max(1, 2));
    }
}

class TernaryOperator {
    public static String checkNumber(int a) {
        ;
        return a > 0 ? "Положительное" : (a == 0 ? "Ноль" : "Отрицательное");

    }

    public static void main(String[] args) {
        System.out.println(checkNumber(1));

    }
}

class TernaryOperator2 {
    public static String gradeMessage(int a) {
        return a >= 90 ? "Отлично" : (a >= 70 && a <= 89 ? "Хорошо" : (a >= 50 && a <= 69 ? "Удовлетворительно" : "Неудовлетворительно"));
    }

    public static void main(String[] args) {
        System.out.println(gradeMessage(50));
    }
}

class Massive {
    public static void main(String[] args) {
        int[] a = {3, 17, 6, 22, 1};
        System.out.println(findMax(a));

    }

    public static int findMax(int[] massive) {
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] > maxValue) {
                maxValue = massive[i];
            }
        }
        return maxValue;
    }
}

class Massive1 {
    public static int sumEven(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a = {3, 4, 6, 7, 10};
        System.out.println(sumEven(a));
    }

}

class Massive2 {
    public static int countGreaterThan(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > n) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = {1, 5, 9, 3, 12};
        System.out.println(countGreaterThan(a, 4));
    }
}

class Massive3 {
    public static int findMinIndex(int[] arr) {
        int min = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] a = {5, 3, 8, 1, 4};
        System.out.println(findMinIndex(a));
    }
}

class Massive4 {
    public static boolean isStrictlyIncreasing(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(isStrictlyIncreasing(new int[]{1, 2, 3, 4}));
        System.out.println(isStrictlyIncreasing(new int[]{1, 2, 2, 3}));
        System.out.println(isStrictlyIncreasing(new int[]{5, 4, 3}));

    }
}

class Massive5 {
    public static void doubleElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i];


        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        doubleElements(a);
        System.out.println(Arrays.toString(a));
    }

}

class Massive6 {
    public static int[] filterOdd(int[] arr) {
        int count = 0;
        // 1. Считаем нечётные числа
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }

        // 2. Создаём новый массив нужного размера
        int[] result = new int[count];
        int index = 0;

        // 3. Заполняем новый массив нечётными числами
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result[index] = arr[i];
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(filterOdd(a)));  // [1, 3, 5]
    }
}

class Massive7 {
    public static int[] filterEven(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result[index] = arr[i];
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(filterEven(a)));
    }

}

class Massive8 {
    public static int[] findElementsMoreThanAverage(int[] arr) {
        int sum = 0;
        int average = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        average = sum / arr.length;

        for (int i = 0; i < arr.length; i++) {
            if (average < arr[i]) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (average < arr[i]) {
                result[index] = arr[i];
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(findElementsMoreThanAverage(a)));
    }
}

class Massive9 {
    public static void findIndexOfElementsLessThanAverage(int[] arr) {
        int sum = 0;
        int average = 0;
        int count = 0;


        //Ищем среднее значение в массиве.
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        average = sum / arr.length;

        /*Ищем количество элементов, которые меньше среднего и находятся на четной позиции индекса,
        чтобы понимать, какого размера массив нам необходимо создать.*/


        for (int i = 0; i < arr.length; i++) {
            if (average > arr[i] && i % 2 == 0) {
                count++;
            }
        }

        //Создаем массив нужного размера, исходя из количества элементов,
        // которые меньше среднего и находятся на четной позиции индекса.
        int[] result = new int[count];
        int index = 0;

        /*Заполняем наш вновь созданный массив индексами, элементы которых
        меньше среднего и находятся на четной позиции индекса*/
        for (int i = 0; i < arr.length; i++) {
            if (average > arr[i] && i % 2 == 0) {
                result[index] = i;
                index++;
            }
        }


        System.out.println(Arrays.toString(result));
    }

    public static void main(String[] args) {
        int[] a = {10, 5, 3, 8, 2, 7};
        findIndexOfElementsLessThanAverage(a);

    }
}

class Massive10 {
    public static int[] findElementsLessThanNeighbours(int[] arr) {
        int count = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i - 1] > arr[i] && arr[i] < arr[i + 1]) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i - 1] > arr[i] && arr[i] < arr[i + 1]) {
                result[index] = arr[i];
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {5, 8, 3, 7, 9, 4, 6};
        System.out.println(Arrays.toString(findElementsLessThanNeighbours(a)));

        //Проверяем не изменили ли мы исходный массив
        System.out.println(Arrays.toString(a));
    }
}

class Massive11 {
    public static int[] findCountOfTarget(int[] arr, int target) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    count++;
                }
            }
        }

        int[] result = new int[count * 2];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    result[index] = arr[i];
                    result[index + 1] = arr[j];
                    index += 2;
                }
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 4, 2, 3, 5};
        int target = 6;
        System.out.println(Arrays.toString(findCountOfTarget(a, target)));
    }
}

class Massive12 {
    public static int[] findDiffOfTarget(int[] arr, int targetDiff) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] - arr[j] == targetDiff || arr[j] - arr[i] == targetDiff) {
                    count++;
                }
            }
        }
        int[] result = new int[count * 2];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] - arr[j] == targetDiff || arr[j] - arr[i] == targetDiff) {
                    result[index] = arr[i];
                    result[index + 1] = arr[j];
                    index += 2;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 7};
        int targetDiff = 2;
        System.out.println(Arrays.toString(findDiffOfTarget(arr, targetDiff)));

    }
}

class Massive13 {
    public static int[] findProductOfTarget(int[] arr, int targetDiff) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] * arr[j] == targetDiff) {
                    count++;
                }
            }
        }

        int[] result = new int[count * 2];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] * arr[j] == targetDiff) {
                    result[index] = arr[i];
                    result[index + 1] = arr[j];
                    index += 2;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};
        int targetProduct = 6;
        System.out.println(Arrays.toString(findProductOfTarget(arr, targetProduct)));
    }
}

class Massive14 {
    public static int[] findThreeSumOfTarget(int[] arr, int targetSum) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == targetSum) {
                        count++;
                    }

                }
            }
        }

        int[] result = new int[count * 3];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == targetSum) {
                        result[index] = arr[i];
                        result[index + 1] = arr[j];
                        result[index + 2] = arr[k];
                        index += 3;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0, 4, -1};
        int target = 6;
        System.out.println(Arrays.toString(findThreeSumOfTarget(arr, target)));

    }
}

class Massive15 {
    public static int[] findTargetDiff(int[] arr, int targetSum) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] - arr[j] == targetSum || arr[j] - arr[i] == targetSum) {
                    count++;
                }
            }
        }
        int[] result = new int[count * 2];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] - arr[j] == targetSum || arr[j] - arr[i] == targetSum && !isPairAlreadyAdded(result, index, arr[i], arr[j])) {
                    result[index] = arr[i];
                    result[index + 1] = arr[j];
                    index += 2;
                }
            }
        }

        return result;

    }

    public static boolean isPairAlreadyAdded(int[] result, int length, int a, int b) {
        for (int i = 0; i < length; i += 2) {
            if ((result[i] == a && result[i + 1] == b) || (result[i] == b && result[i + 1] == a)) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 3, 7, 5};
        int targetDiff = 2;
        System.out.println(Arrays.toString(findTargetDiff(arr, targetDiff)));

    }
}

class Massive16 {
    public static int[] findTarget(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] * arr[j] < target) {
                    count++;
                }
            }
        }
        int[] result = new int[count * 2];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] * arr[j] < target) {
                    result[index] = arr[i];
                    result[index + 1] = arr[j];
                    index += 2;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 6};
        int target = 10;
        System.out.println(Arrays.toString(findTarget(arr, target)));

    }
}


class Massive17 {
    public static int[] bubbleSort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Обмен элементов
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // Если на этом проходе не было обменов — массив уже отсортирован
            if (!swapped) break;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        System.out.println(Arrays.toString(bubbleSort(arr))); // [1, 2, 4, 5, 8]
    }
}

class Massive18 {
    public static int[] bubbleSort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 1, 9};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
}

class Massive19 {
    public static int[] bubbleSort(int[] arr) {
        boolean swapped;
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                    swapped = true;
                    count++;
                }
            }
            if (!swapped) break;
        }
        System.out.println("Количество обменов: " + count);
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
}

class Massive20 {
    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minindex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[minindex]) {
                    minindex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minindex];
            arr[minindex] = temp;

        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 13};
// Ожидаемый результат: [10, 13, 14, 29, 37]
        System.out.println(Arrays.toString(selectionSort(arr)));

    }
}

class Massive21 {
    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int maxindex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[maxindex]) { // ← исправлено
                    maxindex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[maxindex];
            arr[maxindex] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 13};
        System.out.println(Arrays.toString(selectionSort(arr))); // [37, 29, 14, 13, 10]
    }
}

class Massive22 {
    public static int[] selectionSort(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                // обмен действительно произойдёт
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
                counter++;
            }
        }
        System.out.println("Количество обменов: " + counter);
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println(Arrays.toString(selectionSort(arr))); // [11, 12, 22, 25, 64]
    }
}

class Massive23 {
    public static int[] ArraySort(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {9, 4, 1, 7, 3};
        System.out.println(Arrays.toString(ArraySort(arr)));

    }
}

class Massive24 {
    public static int[] ArraySort(int[] arr) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 7, 9};  // Длина 5
        System.out.println(Arrays.toString(ArraySort(arr)));

    }
}

class Massive25 {
    public static int ArraySort(int[] arr, int x) {
        int minAboveX = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x && arr[i] < minAboveX) {
                minAboveX = arr[i];
            }
        }
        return (minAboveX == Integer.MAX_VALUE) ? -1 : minAboveX;
    }

    public static void main(String[] args) {
        int[] arr = {8, 3, 6, 2, 9};
        int x = 5;
        System.out.println(ArraySort(arr, x)); // Ожидаемый вывод: 6
    }
}

class Massive26 {
    public static int ArraySort(int[] arr) {
        int minEven = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && minEven > arr[i]) {
                minEven = arr[i];
            }
        }
        return (minEven == Integer.MAX_VALUE) ? -1 : minEven;
    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 2, 9, 4}; // → 2
        int[] arr1 = {1, 3, 5};       // → -1
        System.out.println(ArraySort(arr));
        System.out.println(ArraySort(arr1));

    }
}

class Massive27 {
    public static int ArraySort(int[] arr) {
        int maxOdd = Integer.MIN_VALUE;
/*      Первое возможное решение:
        for (num:arr) {
            if (num % 2 != 0 && num > maxOdd) {
                maxOdd = arr[i];
            }
        }*/
        //Второе возможное решение
        for (int i = 0; i < arr.length; i++) {

        }
        return (maxOdd == Integer.MIN_VALUE) ? -1 : maxOdd;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 4, 6, 8};      // → -1 (нет нечётных)
        int[] arr2 = {3, 7, 2, 9, 4};   // → 9 (макс. нечётное)
        System.out.println(ArraySort(arr1));
        System.out.println(ArraySort(arr2));
    }
}

class Massive28 {
    public static int[] ArraySort(int[] arr) {
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length / 2; i++) {
            arr1[i] = arr[arr.length - i - 1];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
// → [5, 4, 3, 2, 1]
        System.out.println(Arrays.toString(ArraySort(arr)));

    }
}

class Massive28_1 {
    public static int[] reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            arr[i] = arr[i] + arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[i] - arr[arr.length - 1 - i];
            arr[i] = arr[i] - arr[arr.length - 1 - i];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(reverseArray(arr))); // [5, 4, 3, 2, 1]
    }
}

class Massive28_2 {
    public static int[] reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            arr[i] ^= arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] ^= arr[i];
            arr[i] ^= arr[arr.length - 1 - i];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(reverseArray(arr))); // [5, 4, 3, 2, 1]
    }
}

class Massive29 {
    public static boolean isSortedAsc(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};      // → true
        int[] b = {2, 2, 2, 2};         // → true
        int[] c = {1, 3, 2};            // → false
        int[] d = {5, 4, 3, 2, 1};      // → false
        System.out.println(isSortedAsc(a));
        System.out.println(isSortedAsc(b));
        System.out.println(isSortedAsc(c));
        System.out.println(isSortedAsc(d));
    }
}

class Massive30 {
    public static boolean isSortedAsc(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = {5, 4, 3, 2, 1};     // → true
        int[] b = {9, 9, 9, 9};        // → true
        int[] c = {3, 2, 4};           // → false
        int[] d = {1, 2, 3, 4};        // → false
        System.out.println(isSortedAsc(a));
        System.out.println(isSortedAsc(b));
        System.out.println(isSortedAsc(c));
        System.out.println(isSortedAsc(d));

    }
}

class Massive31 {
    public static boolean isSortedAsc(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};     // → true
        int[] b = {1, 1, 2, 2, 2};     // → true
        int[] c = {3, 2, 4};           // → false
        int[] d = {5, 4, 3, 2};        // → false
        System.out.println(isSortedAsc(a));
        System.out.println(isSortedAsc(b));
        System.out.println(isSortedAsc(c));
        System.out.println(isSortedAsc(d));

    }
}

class Massive32 {
    public static void findDuplicates(int[] arr) {
        System.out.print("Повторяющиеся элементы: ");
        for (int i = 0; i < arr.length; i++) {
            boolean alreadyPrinted = false;

            // Проверка: уже печатали это число?
            for (int k = 0; k < i; k++) {
                if (arr[k] == arr[i]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted) {
                continue;
            }

            // Ищем дубликат после i
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 3, 8, 5, 6, 3};
        findDuplicates(arr); // → 3 5
    }
}

class Massive33 {
    public static void findDuplicates(int[] arr) {
        System.out.println("Повторяющиеся элементы: ");
        for (int i = 0; i < arr.length; i++) {
            boolean alreadyPrinted = false;

            for (int k = 0; k < i; k++) {
                if (arr[k] == arr[i]) {
                    alreadyPrinted = true;
                }
            }
            if (alreadyPrinted) {
                continue;
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break;
                }
            }

        }

    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 4, 3, 2, 1, 6, 7};
// Ожидаемый вывод: 4 1 2
        findDuplicates(arr);

    }
}

class Massive34 {
    public static void findDuplicates(int[] arr) {
        System.out.print("Элементы, встречающиеся более двух раз: ");
        for (int i = 0; i < arr.length; i++) {
            boolean alreadyPrinted = false;

            for (int k = 0; k < i; k++) {
                if (arr[k] == arr[i]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }

            if (count > 2) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 2, 6, 1, 1};
        findDuplicates(arr);
    }
}

class Massive35 {
    public static void mostFrequent(int[] arr) {
        int maxCount = 0;
        int mostFrequent = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            // Только если этот элемент еще не учитывался ранее
            boolean alreadyChecked = false;
            for (int k = 0; k < i; k++) {
                if (arr[k] == arr[i]) {
                    alreadyChecked = true;
                    break;
                }
            }
            if (alreadyChecked) {
                continue;
            }

            if (count > maxCount) {
                maxCount = count;
                mostFrequent = arr[i];
            }
        }

        System.out.println("Самый часто встречающийся элемент: " + mostFrequent + " (встречается " + maxCount + " раз)");
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 4, 3, 2, 1, 6, 7, 2, 4};
        mostFrequent(arr);
    }
}

class Massive36 {
    public static void findDuplicates(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean alreadyPrinted = false;
            for (int k = 0; k < i; k++) {
                if (arr[k] == arr[i]) {
                    alreadyPrinted = true;
                    break;
                }
            }
            if (alreadyPrinted) {
                continue;
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1};
        findDuplicates(arr);
    }
}

class Massive37 {
    public static void findFrequentElements(int[] arr) {
        System.out.print("Элементы, встречающиеся более двух раз: ");
        for (int i = 0; i < arr.length; i++) {
            boolean alreadyPrinted = false;

            for (int k = 0; k < i; k++) {
                if (arr[k] == arr[i]) {
                    alreadyPrinted = true;
                    break;
                }
            }
            if (alreadyPrinted) {
                continue;

            }
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count >= 3) {
                System.out.print(arr[i] + " ");

            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 2, 6, 1, 1};
        findFrequentElements(arr);
    }
}


class Massive38 {
    public static int[] mergeArrays(int[] a, int[] b) {
        int[] result = new int[a.length + b.length]; // Создаём массив нужного размера

        // Копируем элементы из первого массива
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }

        // Копируем элементы из второго массива
        for (int i = 0; i < b.length; i++) {
            result[a.length + i] = b[i];

        }
        Arrays.sort(result);

        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 5};
        int[] b = {2, 4, 6};
        int[] merged = mergeArrays(a, b);

        System.out.println("Результат: " + Arrays.toString(merged));
        // Ожидаемый вывод: [1, 3, 5, 2, 4, 6]
    }
}

class Massive39 {
    public static int[] removeOddNumbers(int[] arr) {
        // Считаем количество чётных чисел
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                count++;
            }
        }

        // Создаём новый массив только для чётных чисел
        int[] result = new int[count];
        int index = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                result[index++] = num;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println("Без нечётных: " + Arrays.toString(removeOddNumbers(arr)));
        // Ожидаемый результат: [2, 4, 6]
    }
}

class Massive40 {
    public static int[] deleteNegativeNumbers(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num >= 0 && num <= 100) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int num : arr) {
            if (num >= 0 && num <= 100) {
                result[index++] = num;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {150, -3, 45, 100, -1, 77, 0, 101, 33};
// → Результат: [45, 100, 77, 0, 33]
        System.out.println(Arrays.toString(deleteNegativeNumbers(arr)));

    }
}

class Massive41 {
    public static boolean hasAdjacentDuplicates(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3};
        int[] b = {4, 5, 6, 7};
        int[] c = {9, 9, 9, 1};

        System.out.println(hasAdjacentDuplicates(a)); // true
        System.out.println(hasAdjacentDuplicates(b)); // false
        System.out.println(hasAdjacentDuplicates(c)); // true
    }
}

class Massive42 {
    public static boolean hasAnyDuplicates(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};      // → false (все разные)
        int[] b = {5, 1, 2, 5};      // → true  (повторяется 5)
        int[] c = {9, 9, 9, 9};      // → true  (все одинаковые)
        System.out.println(hasAnyDuplicates(a));
        System.out.println(hasAnyDuplicates(b));
        System.out.println(hasAnyDuplicates(c));
    }
}

class MassiveDvumerniy {
    public static int sumAll(int[][] m) {
        int sum = 0;
        // Внешний цикл по строкам
        for (int i = 0; i < m.length; i++) {
            // Внутренний — по столбцам текущей строки
            for (int j = 0; j < m[i].length; j++) {
                sum += m[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Сумма: " + sumAll(matrix)); // Сумма: 45
    }
}

class MassiveDvumerniy2 {
    public static int sumEvenIndex(int[][] m) {
        int sum = 0;
        for (int i = 0; i < m.length; i++) {
            if (i % 2 == 0) { // Только чётные строки
                for (int j = 0; j < m[i].length; j++) {
                    sum += m[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3},   // строка 0
                {4, 5, 6},   // строка 1
                {7, 8, 9}    // строка 2
        };
        // Ожидаемая сумма: 1+2+3 + 7+8+9 = 30
        System.out.println(sumEvenIndex(matrix));
    }
}

class MassiveDvumerniy3 {
    public static int sumEvenIndex(int[][] m) {
        int sum = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (j % 2 == 0) {
                    sum += m[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(sumEvenIndex(matrix));
    }
}

class MassiveDvumerniy4 {
    public static int sumEvenIndex(int[][] m) {
        int sum = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i == j) {
                    sum += m[i][j];
                }
            }
        }
        return sum;

    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
// Диагональ: 1, 5, 9 → сумма = 15
        System.out.println(sumEvenIndex(matrix));

    }
}

class MassiveDvumerniy5 {
    public static int sumSecondaryDiagonal(int[][] m) {
        int sum = 0;
        int size = m.length; // предполагаем, что квадратная матрица

        for (int i = 0; i < size; i++) {
            sum += m[i][size - 1 - i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(sumSecondaryDiagonal(matrix)); // → 15 (3 + 5 + 7)
    }
}

class MassiveDvumerniy6 {
    public static int productSecondaryDiagonal(int[][] m) {
        int product = 1;
        int size = m.length;
        for (int i = 0; i < size; i++) {
            product *= m[i][size - 1 - i];
        }
        return product;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Произведение побочной диагонали: " + productSecondaryDiagonal(matrix));
    }

}

class MassiveDvumerniy7 {
    public static int sumAboveSecondaryDiagonal(int[][] m) {
        int sum = 0;
        int size = m.length;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j < size - 1 - i) {
                    sum += m[i][j];
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println(sumAboveSecondaryDiagonal(matrix));
    }
}

class MassiveDvumerniy8 {
    public static int sumSecondaryDiagonal(int[][] m) {
        int size = m.length;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j > size - 1 - i) {
                    sum += m[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(sumSecondaryDiagonal(matrix));

    }
}

class MassiveDvumerniy9 {
    public static void valueAboveN(int[][] m, int enterval) {
        System.out.print("Результат: ");
        int size = m.length;
        int res;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == enterval) {
                    res = m[i][j];
                    System.out.print(res + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int n = 1;
        valueAboveN(matrix, n);

    }
}

class MassiveDvumerniy10 {
    public static void printColumn(int[][] m, int columnIndex) {
        System.out.print("Результат: ");
        int res;
        for (int i = 0; i < m.length; i++) {
            res = m[i][columnIndex];
            System.out.print(res + " ");
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int n = 2;
        printColumn(matrix, n);
    }
}

class MassiveDvumerniy11 {
    public static void sumColumn(int m[][], int n) {
        int sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][n];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int n = 1;
        sumColumn(matrix, n);

    }
}

class MassiveDvumerniy12 {
    public static void sumAboveMainDiagonal(int m[][]) {
        int sum = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (j > i) {
                    sum += m[i][j];
                }
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        sumAboveMainDiagonal(matrix);


    }
}

class MassiveDvumerniy13 {
    public static void sumEvenElements(int m[][]) {
        int sum = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j] % 2 == 0) {
                    sum += m[i][j];
                }
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        sumEvenElements(matrix);


    }
}

class MassiveDvumerniy14 {
    public static int[][] transpose(int[][] m) {
        int[][] res = new int[m[0].length][m.length];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                res[j][i] = m[i][j];
            }
        }


        return res;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.toString(transpose(matrix)));
    }
}

class MassiveDvumerniy15 {
    public static int[][] transpose(int[][] m) {
        int[][] res = new int[m[0].length][m.length];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                res[j][i] = m[i][j];
            }
        }


        return res;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}};

        System.out.println(Arrays.deepToString(transpose(matrix)));
    }
}

class MassiveDvumerniy16 {
    public static void sortRows(int[][] m) {
        int[][] res = new int[m.length][m.length];
        for (int i = 0; i < m.length; i++) {
            Arrays.sort(m[i]);
            for (int j = 0; j < m.length; j++) {
                res[i][j] = m[i][j];
            }
        }
        System.out.println(Arrays.deepToString(res));
    }

    public static void main(String[] args) {
        int[][] matrix = {{3, 2, 1}, {9, 5, 6}, {7, 8, 4}};
        sortRows(matrix);
    }


}

class MassiveDvumerniy17 {
    public static void maxIndex(int[][] m) {
        int maxSum = Integer.MIN_VALUE;
        int maxRow = -1;

        for (int i = 0; i < m.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < m.length; j++) {
                rowSum += m[i][j];
            }

            if (rowSum > maxSum) {
                maxSum = rowSum;
                maxRow = i;
            }
        }

        System.out.println("Строка с максимальной суммой: " + maxRow);

    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3},   // сумма = 6
                {4, 5, 6},   // сумма = 15
                {7, 8, 9}    // сумма = 24 ← максимальная
        };
        maxIndex(matrix);

    }
}

class MassiveDvumerniy18 {
    public static void maxIndex(int[][] m) {
        int maxSum = Integer.MIN_VALUE;
        int maxRow = -1;

        for (int j = 0; j < m[0].length; j++) {
            int rowSum = 0;
            for (int i = 0; i < m.length; i++) {
                rowSum += m[i][j];
            }
            if (rowSum > maxSum) {
                maxSum = rowSum;
                maxRow = j;
            }

        }

        System.out.println("Столбец с максимальной суммой: " + maxRow);
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        maxIndex(matrix);
// Ожидаемый результат: 2 (сумма столбца: 3+6+9 = 18)

    }
}

class MassiveDvumerniy19 {
    public static void findMin(int[][] m) {

        int minLine = -1;

        for (int i = 0; i < m.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] < min) {
                    min = m[i][j];
                    minLine = i;
                }
            }
            System.out.println("Минимум в строке " + minLine + ": " + min);

        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{5, 3, 8}, {1, 7, 4}, {9, 2, 6}};
        findMin(matrix);
    }
}

class MassiveDvumerniy20 {
    public static void abc(int[][] m) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                sum += m[i][j];
                count++;
            }
        }
        int avg = sum / count;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] > avg) {
                    System.out.print(m[i][j] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] m = {{1, 2, 3}, {4, 5, 6}};
        abc(m);
    }
}

class MassiveDvumerniy21 {
    public static void printMainDig(int[][] m) {
        int size = m.length;
        for (int i = size - 1; i >= 0; i--) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    System.out.println(m[i][j]);
                }

            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        printMainDig(matrix);
    }
}

class MassiveDvumerniy22 {
    public static void printSecondaryDiagonalBottomUp(int[][] m) {
        int size = m.length;
        for (int i = size - 1; i >= 0; i--) {
            int j = size - 1 - i;
            System.out.println(m[i][j]);
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        printSecondaryDiagonalBottomUp(matrix);
    }
}

class MassiveDvumerniy23 {
    public static void abc(int[][] m) {
        int size = m.length;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i + j < size - 1) {
                    sum += m[i][j];
                }
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        abc(matrix);
    }
}

class MassiveDvumerniy24 {
    public static void abc(int[][] m) {
        int size = m.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i + j > size - 1 && m[i][j] > max) {
                    max = m[i][j];

                }
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        abc(matrix);

    }
}

class MassiveDvumerniy25 {
    public static void abc(int[][] m) {
        int size = m.length;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j > i) {
                    sum += m[i][j];
                }
            }

        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        abc(matrix);

    }
}

class MassiveDvumerniy26 {
    public static void abc(int[][] m) {
        int sum = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (i > j) {
                    sum += m[i][j];
                }
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        abc(matrix);
    }
}

class MassiveDvumerniy27 {
    public static void abc(int[][] m) {
        int size = m.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i + j < size - 1 && m[i][j] > max) {
                    max = m[i][j];
                }
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        abc(matrix);
    }
}

class MassiveDvumerniy28 {
    public static void abc(int[][] m) {
        int size = m.length;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i + j > size - 1 && m[i][j] < min) {
                    min = m[i][j];
                }
            }
        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        abc(matrix);
    }
}

class MassiveDvumerniy29 {
    public static void abc(int[][] m) {
        int conter = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (i == j && m[i][j] % 2 != 0) {
                    conter++;
                }
            }
        }
        System.out.println(conter);
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        abc(matrix);
    }
}

class MassiveDvumerniy30 {
    public static void abc(int[][] m) {
        int size = m.length;
        int conter = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i + j == size - 1 && m[i][j] % 2 == 0) {
                    conter++;
                }
            }
        }
        System.out.println(conter);
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        abc(matrix);
    }
}

class MassiveDvumerniy31 {
    public static void abc(int[][] m) {
        int size = m.length;
        int sum = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i + j < size - 1) {
                    sum += m[i][j];
                }
            }
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        abc(matrix);
    }
}

class PraktikaSmassivami {
    public static int[] filterEven(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }

        int[] result = new int[count];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result[j] = arr[i];
                j++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(filterEven(input)));
    }
}


class PraktikaSmassivami2 {
    public static int[] removeNegatives(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                count++;
            }
        }
        int[] res = new int[count];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                res[j] = arr[i];
                j++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] input = {5, -3, 0, 8, -1, 2};
        System.out.println(Arrays.toString(removeNegatives(input)));
    }
}

class PraktikaSmassivami3 {
    public static int[] removeTarget(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        int[] res = new int[arr.length - count];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != target) {
                res[j] = arr[i];
                j++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 2, 4, 2, 5};
        int target = 2;
        System.out.println(Arrays.toString(removeTarget(input, target)));
        // Ожидаемый результат: [1, 3, 4, 5]
    }
}

class PraktikaSmassivami4 {
    public static int[] removeGreaterThan(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > n) {
                count++;
            }
        }
        int[] res = new int[arr.length - count];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= n) {
                res[j] = arr[i];
                j++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] input = {3, 7, 1, 9, 2, 8};
        int n = 5;
        System.out.println(Arrays.toString(removeGreaterThan(input, n)));
    }
}

class PraktikaSmassivami5 {
    public static int[] removeEven(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        int[] res = new int[arr.length - count];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                res[j] = arr[i];
                j++;
            }
        }
        return res; // временно
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(removeEven(input)));
    }
}

class PraktikaSmassivami6 {
    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];


            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] input = {5, 9, 3, 7, 2};
        System.out.println(findMax(input)); // Ожидаемый результат: 9
    }
}

class PraktikaSmassivami7 {
    public static int findMinIndex(int[] arr) {
        System.out.print("Индекс минимального значения: ");
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex; // временно
    }

    public static void main(String[] args) {
        int[] input = {5, 9, 3, 7, 2};
        System.out.println(findMinIndex(input)); // Ожидаемый результат: 4
    }
}

class PraktikaSmassivami8 {
    public static int findSecondMin(int[] arr) {
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < firstMin) {
                firstMin = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < secondMin && arr[i] != firstMin) {
                secondMin = arr[i];
            }
        }

        return secondMin;
    }

    public static void main(String[] args) {
        int[] input = {5, 1, 3, 1, 4};
        System.out.println(findSecondMin(input)); // Ожидаемый результат: 3
    }
}

class PraktikaSmassivami9 {
    public static int sumPositive(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] input = {-1, 2, 3, -4, 5};
        System.out.println(sumPositive(input)); // Ожидаемый результат: 10
    }
}

class PraktikaSmassivami10 {
    public static int productNegatives(int[] arr) {
        int product = 1;
        boolean hasNegative = false; // чтобы отследить наличие отрицательных

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                product *= arr[i];
                hasNegative = true;
            }
        }

        return hasNegative ? product : 1;
    }

    public static void main(String[] args) {
        int[] input = {-2, 3, -4, 5};
        System.out.println(productNegatives(input)); // Ожидаемый результат: 8
    }
}

class PraktikaSmassivami11 {
    public static int[] removeMultiplesOfThree(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                count++;
            }
        }
        int[] res = new int[arr.length - count];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 != 0) {
                res[j] = arr[i];
                j++;
            }
        }
        return res; // временно
    }

    public static void main(String[] args) {
        int[] input = {3, 5, 9, 10, 12, 7};
        System.out.println(Arrays.toString(removeMultiplesOfThree(input)));
        // Ожидаемый результат: [5, 10, 7]
    }
}

class PraktikaMetodySMassivami {
    int umn = 10;

    public static int[] yourMethodName(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = 10 + arr[i];
        }

        return res; // или новый массив
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(yourMethodName(input)));
    }
}

class PraktikaMetodySMassivami2 {
    public static int[] yourMethodName(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = 5 * arr[i];
        }

        return res; // или новый массив
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(yourMethodName(input)));
    }
}

class PraktikaMetodySMassivami3 {
    public static int[] sortAndReturn(int[] arr) {
        int minIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }

        return arr;
    }


    public static void main(String[] args) {
        int[] input = {5, 1, 4, 2};
        System.out.println(Arrays.toString(sortAndReturn(input)));
    }
}

class PraktikaMetodySMassivami4 {
    public static int[] filterAndSort(int[] arr) {
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                counter++;
            }

        }

        int[] res = new int[counter];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                res[j] = arr[i];
                j++;
            }
        }

        int minIndex = 0;
        for (int i = 0; i < res.length; i++) {
            minIndex = i;
            for (int k = i + 1; k < res.length; k++) {
                if (res[minIndex] > res[k]) {
                    minIndex = k;
                }
            }
            if (minIndex != i) {
                int temp = res[i];
                res[i] = res[minIndex];
                res[minIndex] = temp;

            }
        }


        return res; // временно
    }

    public static void main(String[] args) {
        int[] input = {3, -1, 0, 5, -7, 2};
        System.out.println(Arrays.toString(filterAndSort(input)));
    }
}

class PraktikaMetodySMassivami5 {
    public static int[] filterAndSort(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                counter++;
            }

        }

        int[] res = new int[counter];
        int k = 0;
        for (int i = 0; i < res.length; i++) {
            if (arr[i] % 2 != 0) {
                res[k] = arr[i];
                k++;
            }
        }

        int maxIndex = 0;
        for (int i = 0; i < res.length; i++) {
            maxIndex = i;
            for (int j = i + 1; j < res.length; j++) {
                if (res[j] > res[maxIndex]) {
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                int temp = res[i];
                res[i] = res[maxIndex];
                res[maxIndex] = temp;
            }
        }


        return res; // временно
    }

    public static void main(String[] args) {
        int[] input = {5, 2, 7, 8, 3, 4};
        System.out.println(Arrays.toString(filterAndSort(input)));
    }
}


class PraktikaMetodySMassivami6 {
    public static int[] abc(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                counter++;
            }
        }
        int[] res = new int[counter];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                res[j] = arr[i];
                j++;
            }
        }
/*
1 Вариант сортировки по возрастанию
        for (int n:res){
            Arrays.sort(res);
        }
*/
        //2 Вариант сортировки:
        int minIndex = 0;
        for (int i = 0; i < res.length; i++) {
            minIndex = i;

            for (int k = i + 1; k < res.length; k++) {
                if (res[minIndex] > res[k]) {
                    minIndex = k;
                }

                if (minIndex != i) {
                    int temp = res[i];
                    res[i] = res[minIndex];
                    res[minIndex] = temp;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] input = {9, 4, 2, 7, 6, 3, 8};
        System.out.println(Arrays.toString(abc(input)));
    }
}

class MaxInRows {
    public static int[] abc(int[][] arr) {

        int[] maxValues = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];

                }
            }
            maxValues[i] = max;
        }
        return maxValues;
    }

    public static void main(String[] args) {
        int[][] array = {{3, 5, 9, 1}, {7, 2, 8, 4}, {6, 0, -2, 10}};
        System.out.println(Arrays.toString(abc(array)));
    }
}


class RemoveNegatives {
    public static int[] removeNegatives(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                counter++;
            }
        }
        int[] res = new int[counter];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                res[j] = arr[i];
                j++;
            }
        }

        return res; // пока заглушка
    }

    public static void main(String[] args) {
        int[] array = {3, -1, 0, -7, 5, -2, 8};
        System.out.println(Arrays.toString(removeNegatives(array)));
    }
}

class Povtorenie {
    public static void abc(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int[] arr = {3, -1, 7, -5, 10};
        abc(arr);
    }
}

class Povtorenie2 {
    public static void abc(int[] arr) {
        boolean sorted = true; // считаем, что массив отсортирован

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                sorted = false; // нашли нарушение
                break;
            }
        }

        if (sorted) {
            System.out.println("Массив отсортирован по возрастанию");
        } else {
            System.out.println("Массив не отсортирован по возрастанию");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        abc(arr1);
        int[] arr2 = {1, 3, 2, 4, 5};
        abc(arr2);
    }
}

class Overloading1 {

    public static void print(String s) {
        System.out.println(s);
    }

    public static void print(int n) {
        System.out.println(n);
    }

    public static void print(String s, int n) {
        System.out.println(n);
    }

    public static void main(String[] args) {
        Overloading1 p = new Overloading1();
        p.print("Hello");
        p.print(123);
        p.print("Java", 3);

    }
}

class Overloading2 {
    private String model;
    private int year;

    // Конструктор без аргументов
    public Overloading2() {
        model = "Unknown";
        year = 0;
    }

    // Конструктор с именем
    public Overloading2(String model) {
        this.model = model;
        year = 2000;
    }

    // Конструктор с именем и возрастом
    public Overloading2(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void printInfo() {
        System.out.println("Model: " + model + ", Year: " + year);
    }

    public static void main(String[] args) {
        Overloading2 p = new Overloading2();
        Overloading2 p3 = new Overloading2("Python");
        Overloading2 p2 = new Overloading2("Java", 3);

        p.printInfo();
        p2.printInfo();
        p3.printInfo();

    }
}

class Povtorenie1 {
    public static int sumArr(int[] n) {
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] > 0) {
                sum += n[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 5, -3, 7, -1, 4};
        System.out.println(sumArr(nums));

    }
}

class PositiveStats {
    int sum;
    int count;

    PositiveStats(int sum, int count) {
        this.sum = sum;
        this.count = count;
    }
}

class Povtorenie3 {
    public static PositiveStats getPositiveStats(int[] arr) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sum += arr[i];
                count++;
            }
        }
        return new PositiveStats(sum, count);
    }

    public static void main(String[] args) {
        int[] nums = {-2, 5, -3, 7, -1, 4};
        PositiveStats stats = getPositiveStats(nums);

        System.out.println("Сумма положительных: " + stats.sum);
        System.out.println("Количество положительных: " + stats.count);
    }
}


class ArrayStats {
    int positiveSum;
    int positiveCount;
    int negativeSum;
    int negativeCount;

    ArrayStats(int positiveSum, int positiveCount, int negativeSum, int negativeCount) {
        this.positiveSum = positiveSum;
        this.positiveCount = positiveCount;
        this.negativeSum = negativeSum;
        this.negativeCount = negativeCount;
    }

    void printStats() {
        System.out.println("Сумма положительных: " + positiveSum + "\nКоличество положительных: " + positiveCount + "\nСумма отрицательных: " + negativeSum + "\nКоличество отрицательных: " + negativeCount);

    }
}

class Povtorenie4 {
    public static ArrayStats getArrayStats(int[] arr) {
        int positiveSum = 0;
        int positiveCount = 0;
        int negativeSum = 0;
        int negativeCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positiveSum += arr[i];
                positiveCount++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                negativeSum += arr[i];
                negativeCount++;
            }
        }
        return new ArrayStats(positiveSum, positiveCount, negativeSum, negativeCount);
    }

    public static void main(String[] args) {
        int[] nums = {-3, 5, -2, 7, -1, 4};
        ArrayStats stats = getArrayStats(nums);
        stats.printStats();
    }
}


class PositiveStats1 {
    int sumPosEv;
    int countPosEv;
    double avgPosEv;

    public PositiveStats1(int sumPosEv, int countPosEv, double avgPosEv) {
        this.sumPosEv = sumPosEv;
        this.countPosEv = countPosEv;
        this.avgPosEv = avgPosEv;
    }

    public void printStats() {
        System.out.println("Сумма положительных: " + sumPosEv + "\nКоличество положительных: " + countPosEv + "\nСреднее положительных: " + avgPosEv);
    }

}


class Povtorenie5 {
    public static PositiveStats1 getPositiveStats(int[] arr) {
        int sumPosEv = 0;
        int countPosEv = 0;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                countPosEv++;
                sumPosEv += arr[i];
            }
        }
        double avgPosEv = (double) sumPosEv / countPosEv;
        avgPosEv = Math.round(avgPosEv * 100) / 100.0;

        return new PositiveStats1(sumPosEv, countPosEv, avgPosEv);
    }

    public static void main(String[] args) {
        int[] nums = {-3, 5, -2, 7, -1, 4};
        PositiveStats1 stats1 = getPositiveStats(nums);
        stats1.printStats();
    }

}

class Print {
    int sum;
    int minPos;

    public Print(int sum, int minPos) {
        this.sum = sum;
        this.minPos = minPos;
    }

    public void printInfo() {
        System.out.println("Сумма отрицательных: " + sum + "\nМинимальное положительное: " + minPos);
    }
}

class Povtorenie6 {
    public static Print getPrint(int[] arr) {
        int sum = 0;
        int minPos = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                sum += arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] < minPos) {
                minPos = arr[i];
            }
        }
        if (minPos == Integer.MAX_VALUE) {
            System.out.println("Минимальное положительное: отсутствует");
            minPos = 0;
        }
        return new Print(sum, minPos);

    }

    public static void main(String[] args) {
        int[] nums = {-5, 12, -3, 7, -1, 4};
        Print pr = getPrint(nums);
        pr.printInfo();
    }
}

class Povtorenie7 {

    public static void updateList(ArrayList<String> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите действие: " + "\n1.Удалить имя; " + "\n2. Добавить имя в конец списка;" + "\n3.Заменить выбранное имя на Дмитрий");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Введите имя, которое " + "хотите удалить (список доступных к удалению имен" + list + ")");
                String nameRem = scanner1.nextLine();

                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).equals(nameRem)) {
                        list.remove(i);
                    }
                }
                System.out.println("Список после изменений: " + list.toString());

                break;
            case 2:
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Введите имя для добавления в конец списка: ");
                String nameSet = scanner2.nextLine();
                list.add(list.size(), nameSet);
                System.out.println("Список после изменений: " + list.toString());
                break;
            case 3:
                Scanner scanner3 = new Scanner(System.in);
                System.out.println("Введите имя для замены: ");
                String nameSet2 = scanner3.nextLine();
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).equals(nameSet2)) {
                        list.set(i, "Дмитрий");
                    }

                }
                System.out.println("Список после изменений: " + list.toString());
                break;

        }
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("Алексей", "Мария", "Иван", "Ольга", "Петр"));
        updateList(list);
    }
}

class PrintRes {
    int max;
    int sum;

    public PrintRes(int max, int sum) {
        this.max = max;
        this.sum = sum;
    }

    public void printInfo() {
        System.out.println("Максимальное значение массива: " + max + "\nСумма значений массива: " + sum);
    }
}


class Povtorenie8 {
    public static PrintRes getPrintRes(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return new PrintRes(max, sum);
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};
        PrintRes pr = getPrintRes(arr);
        pr.printInfo();
    }

}

class Povtorenie9 {
    public static void printEvenNumbers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7, 4, 6, 2, 4, 6};
        printEvenNumbers(arr);
    }

}

class Povtorenie10 {

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            res[i] = arr1[i];
        }
        int j = arr2.length + 1;
        for (int i = 0; i < arr2.length; i++) {
            res[j++] = arr2[i];
        }
        return res;


    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9};
        System.out.println(Arrays.toString(mergeArrays(arr1, arr2)));
    }
}

class PrintRes1 {
    double avrVar;
    List<Integer> greaterThatAvr;

    PrintRes1(double avrVar, List<Integer> greaterThatAvr) {
        this.avrVar = avrVar;
        this.greaterThatAvr = greaterThatAvr;
    }

    public void printInfo() {
        System.out.println("Среднее значение: " + avrVar + "\nЗначения больше среднего: " + greaterThatAvr);
    }
}

class Povtorenie11 {
    public static PrintRes1 getPrintRes1(int[] arr) {
        int sum = 0;
        int greaterThatAvr = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        double avrVar = (double) sum / arr.length;

        List<Integer> greaterThatAvrList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > avrVar) {
                greaterThatAvrList.add(arr[i]);
            }
        }
        return new PrintRes1(avrVar, greaterThatAvrList);
    }

    public static void main(String[] args) {
        int[] arr = {4, 8, 6, 2, 10};
        PrintRes1 pr = getPrintRes1(arr);
        pr.printInfo();

    }
}

class Product {
    private String name;
    private double price;

    public void SetName(String name) {
        this.name = name;
    }

    public void SetPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;

    }


}

class ProductCatalog {
    List<Product> products = new ArrayList<>();

    public void addProduct(String name, double price) {
        Product product = new Product(name, price);
        products.add(product);
    }

    public void removeProduct(String name) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(name)) {
                products.remove(i);
                break;
            }
        }
    }

    public void showProducts() {
        System.out.println("List of products: ");
        for (Product product : products) {
            System.out.println("name: " + product.getName() + ", price: " + product.getPrice());
        }
    }

    public void filterByPrice(double minPrice) {
        for (Product product : products) {
            if (product.getPrice() > minPrice) {
                System.out.println(product.getName());
            }
        }
    }

    public static void main(String[] args) {
        ProductCatalog productCatalog = new ProductCatalog();
        productCatalog.addProduct("Cabbage", 12);
        productCatalog.addProduct("Carrot", 11.2);
        productCatalog.addProduct("Potato", 12.2);
        productCatalog.addProduct("Tomato", 6.52);
        productCatalog.addProduct("Onion", 7.2);
        productCatalog.filterByPrice(7);
        productCatalog.showProducts();
        productCatalog.removeProduct("Cabbage");
        productCatalog.showProducts();


    }
}

class DivisionRepeatTask {
    public static void main(String[] args) {
        int a = 10;
        int b = 0; // попробуй менять на 0, 2, -5

        try {
            int res = a / b;
            System.out.println(res);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль!");
        }
    }
}

class ReadFileRepeatTask {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("phonebooklist.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

    }

}


class MapRepeatTask {
    public static void main(String[] args) {
        Map<String, Integer> people = new HashMap<>();

        // TODO: добавить 3 записи

        // TODO: вывести все записи (имя и возраст)

        people.put("Lev", 22);
        people.put("Alex", 13);
        people.put("Oleg", 17);

        for (Map.Entry<String, Integer> entry : people.entrySet()) {
            String name = entry.getKey();
            int age = entry.getValue();

            if (age >= 15) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}


class ArrayTask {
    public static void findMinMaxSum (int [] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println("min: " + min + " max: " + max + " sum: " + sum);
    }


    public static void main(String[] args) {
        int[] arr = {5, 12, -3, 7, 0, 22, -15};
        findMinMaxSum(arr);

        // TODO: реализовать поиск min, max, sum
    }
}


class MapTask {
    public static void countName (List<String> names) {
        Map<String, Integer> map = new TreeMap<>();

        for (String name : names) {
            map.merge(name, 1,(oldValue, newValue) -> oldValue + newValue);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }


    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Alice", "Bob", "Alice", "Tom", "Bob", "Alice"
        );
        countName(names);

        // TODO: посчитать количество повторений имён
    }
}



 class ArraySignCounter {
    public static void counterNubers (int [] arr){
        int biggerThen_0 =0;
        int lessThen_0 = 0;
        int equals_0 = 0;

        for (int i : arr){
            if (i == 0){
                equals_0++;
            }
            if (i > 0){
                biggerThen_0++;
            }
            if (i < 0){
                lessThen_0++;
            }
        }
        System.out.println(biggerThen_0 + " " + lessThen_0 + " " + equals_0);
    }

    public static void main(String[] args) {
        int[] arr = {5, -2, 0, 7, -9, 0, 3};
        counterNubers (arr);
        // твой код здесь
    }
}




 class WordCounter {
    public static void counterLetter (List<String> words) {
        Map<String, Integer> map = new TreeMap<>();

        for (String word : words) {
            String firstLetter = word.substring(0, 1);

            map.merge(firstLetter, 1, Integer::sum);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "blueberry");
        counterLetter(words);
        // твой код здесь
    }
}
