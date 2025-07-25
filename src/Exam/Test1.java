package Exam;

import java.util.Arrays;

public class Test1 {
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        System.out.println(max(1, 2));
    }
}

class Test2 {
    public static void positeOrNegative(int a) {
        if (a % 2 == 0) {
            System.out.println(a + " is positive");
        } else {
            System.out.println(a + " is negative");
        }
    }

    public static void main(String[] args) {
        Test2.positeOrNegative(54);
    }
}

class Test3 {
    public static int massive(int[] a) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = {3, 7, -2, 9, 5};
        int result = massive(numbers);
        System.out.println(result);
    }
}

class Test4 {
    public static int abc(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                sum += a[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = {3, -7, 4, -2, 6};
        int result = abc(numbers);
        System.out.println(result);
    }
}

class Test5 {
    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;  // нашли нарушение порядка
            }
        }
        return true;  // все элементы упорядочены
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 3, 7, 9};
        int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(isSorted(a));
        System.out.println(isSorted(b));
    }

}

class Test6 {
    public static int findFirstIndex(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 2, 5};
        System.out.println(findFirstIndex(arr, 2));  // 1
        System.out.println(findFirstIndex(arr, 5));  // 4
        System.out.println(findFirstIndex(arr, 10)); // -1
    }
}

class Test7 {
    public static int counterPositivesNumbers(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(counterPositivesNumbers(arr));
    }
}

class Test8 {
    // Метод возвращает новый массив с элементами в обратном порядке
    public static int[] reverseArray(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] reversedArr = reverseArray(arr);
        System.out.println(Arrays.toString(reversedArr)); // [4, 3, 2, 1]
    }
}

class Test9 {
    public static int sumOddIndices(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                sum += array[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        System.out.println(sumOddIndices(arr));
    }
}

class Test10 {
    public static boolean hasDuplicates(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main (String[]args){
        int[] a = {1, 2, 3, 4, 5};          // → false
        int[] b = {2, 4, 6, 4, 8};          // → true (два 4)
        System.out.println(hasDuplicates(a));
        System.out.println(hasDuplicates(b));

    }
}

