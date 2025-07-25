package GPT_Task;

public class Massive {


    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int num : numbers) {
            sum += num;

/*
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            System.out.println("Result sum of numbers: " + sum);
*/
        }
        System.out.println(sum);
    }
}

class Massive2 {
    public static void main(String[] args) {
        int[] values = {10, 25, 3, 99, 7};
        int max = values[0];
        int max1 = values[0];
        int maxIndex = 0;
        int maxIndex1 = 0;

  /*      for (int num:values){
            if (num > max){
                max = num;
            }
            if (num == max){
                maxIndex = num;
            }
        }
        System.out.println("Индекс максимального значения:" + maxIndex);
        System.out.println("Результат от использования for each: " + max);

  */
        for (int i = 0; i < values.length; i++) {
            if (values[i] > max1) {
                max1 = values[i];
                if (values[i] == max1) {
                    maxIndex1 = i;
                }
            }
        }
        System.out.println("Индекс максимального значения:" + maxIndex1);
        System.out.println("Результат от использования for : " + max1);

    }
}

class Massive3 {
    public static void main(String[] args) {
        int counter = 0;
        int[] data = {2, 5, 8, 11, 14};
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 == 0) {
                counter++;
            }

        }
        System.out.println(counter);
    }
}

class Massive4 {
    public static void main(String[] args) {
        int[] data = {3, 6, 9, 12, 15};
        int sum = 0;
        for (int d : data) {
            if (d % 2 != 0) {
                sum += d;
            }
        }
        System.out.println(sum);
    }
}

class Massive5 {
    public static void main(String[] args) {
        int[] data = {-5, 12, 0, -3, 7, -1};
        int positiveCount = 0;
        int negativeCount = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > 0) {
                positiveCount++;
            }
            if (data[i] < 0) {
                negativeCount++;
            }
        }
        System.out.println(positiveCount);
        System.out.println(negativeCount);

    }
}

class Massive6 {
    public static void main(String[] args) {
        int[] data = {15, -3, 22, 0, -7, 8};
        int min = data[0];
        int min1 = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }
        for (int d : data) {
            if (d < min1) {
                min1 = d;
            }
        }
        System.out.println(min);
        System.out.println(min1);
    }
}

class Massive7 {
    public static void main(String[] args) {
        int[] data = {10, 20, 30, 40};
        int sum = 0;

        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        System.out.print(sum / data.length);
    }
}

class Massive8 {
    public static void main(String[] args) {
        int[] data = {10, 5, 20, 8, 30};
        int max = data[0];
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > max) {
                secondMax = max;
                max = data[i];
            } else if (data[i] > secondMax && data[i] != max) {
                secondMax = data[i];
            }
        }
        System.out.println(secondMax);
    }
}

class Massive9 {
    public static void main(String[] args) {
        int[] data = {5, -3, 12, -1, 0, 7};
        for (int i = 0; i < data.length; i++) {
            if (data[i] < 0) {
                data[i] = 0;
            }
        }

        System.out.print("[");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]);
            if (i < data.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

class Massive10 {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5};
        int[] data1 = {3, 7, 5, 9};

        boolean isSorted = true;
        boolean isSorted1 = true;

        for (int i = 1; i < data.length; i++) {
            if (data[i] < data[i - 1]) {
                isSorted = false;
                break; // можно выйти раньше
            }
        }

        if (isSorted) {
            System.out.println("Массив отсортирован по возрастанию");
        } else {
            System.out.println("Массив не отсортирован");
        }

        for (int i = 1; i < data1.length; i++) {
            if (data1[i] < data1[i - 1]) {
                isSorted1 = false;
                break;
            }
        }
        if (isSorted1) {
            System.out.println("Массив отсортирован по возрастанию");
        } else {
            System.out.println("Массив не отсортирован");
        }
    }
}

class Massive11 {
    /*    public static void main(String[] args) {
            int[] data = {4, 8, 15, 16, 23, 42};
            int target = 15;
            for (int d : data) {
                if (d == target) {
                    System.out.println("Число 15 найдено в массиве.");
                    break;
                }
            }

        } Это не правильный вариант (он то рабочий) с точки зрения clean coda */
    public static void main(String[] args) {
        int[] data = {4, 8, 15, 16, 23, 42};
        int target = 15;
        boolean found = false;

        for (int d : data) {
            if (d == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Число " + target + " найдено в массиве.");
        } else {
            System.out.println("Число " + target + " не найдено в массиве.");
        }
    }
}

class Massive12 {
    public static void main(String[] args) {
        int[] data = {4, 8, 15, 8, 23, 8, 42};
        int target = 8;
        int count = 0;
        for (int d : data) {
            if (d == target) {
                count++;
            }
        }
        System.out.println("Число " + target + " встречается " + count + " раз(а) в массиве.");
    }
}

class Massive13 {
    public static void main(String[] args) {
        int[] data = {10, 20, 30, 40, 50};
        int[] reversed = new int[data.length];

        for (int i = 0; i < data.length; i++) {
            reversed[i] = data[data.length - 1 - i];
        }

        for (int i = 0; i < reversed.length; i++) {
            System.out.print(reversed[i] + " ");
        }
    }
}

class Massive14 {
    public static void main(String[] args) {
        int[] data = {5, 10, 15, 20, 25, 30};
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            if (i % 2 == 0) {
                sum += data[i];
            }
        }
        System.out.println(sum);
    }
}

class Massive14_1 {
    public static void main(String[] args) {
        int[] data = {5, -10, 15, 20, -25, 30};
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            if (i % 2 == 0 && data[i] > 0) {
                sum += data[i];
            }
        }
        System.out.println(sum);
    }
}

class Massive15 {
    public static void main(String[] args) {
        int[] data = {10, 20, 30, 40, 50};

        int sum = 0;
        int avarageCount = 0;
        int elementsCount = 0;

        for (int i = 0; i < data.length; i++) {
            sum += data[i];


        }
        avarageCount = sum / data.length;
        for (int d : data) {
            if (d > avarageCount) {
                elementsCount++;
            }
        }
        System.out.println(sum);
        System.out.println(avarageCount);
        System.out.println(elementsCount);
    }
}

class Massive16 {
    public static void main(String[] args) {
        int[] data = {4, 9, 2, 9, 3, 9};
        int max = data[0];
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > max) {
                secondMax = max;
                max = data[i];
            }
        }
        int lastMaxIndex = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == max) {
                lastMaxIndex = i;
            }
        }
        System.out.println(max);
        System.out.println(lastMaxIndex);
        System.out.println(secondMax);
    }
}

class Massive17 {
    public static void main(String[] args) {
        int[] data = {4, 9, 2, 9, 3, 9};
        int idex = 0;
        int max = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];

            } else if (data[i] == max) {
                idex = i;
            }
        }
        System.out.println(idex);
    }
}

class Massive18 {
    public static void main(String[] args) {
        int[] data = {7, 3, 5, 2, 9, 8};
        int idex = 0;
        int min = data[0];
        for (int i = 0; i < data.length; i++) {
            if (i % 2 != 0 && data[i] < min) {
                min = data[i];
                idex = i;
            }


        }
        System.out.println(min);
        System.out.println(idex);
    }
}

class Massive19 {
    public static void main(String[] args) {
        int[] data = {7, 3, 5, 2, 9, 8};
        int idex = 0;
        int min = data[0];
        for (int i = 0; i < data.length; i++) {
            if (i % 2 == 0 && data[i] < min) {
                min = data[i];
                idex = i;
            }
        }
        System.out.println(min);
        System.out.println(idex);
    }
}

/*
class Massive20 {
    public static void main(String[] args) {
        int[] data = {9, -3, 12, 4, 6, 18, 7};
        int min = data[0];
        int idex = 0;

        for (int i = 0; i < data.length; i += 2) {
            if (data[i] > 0 && data[i] % 3 == 0) {
                min = data[i];
                idex = i;
            }

        }
        System.out.println(min);
        System.out.println(idex);
    }
}*/ //ВАРИАНТ ПРЕДЛОЖЕННЫЙ GPT
class Massive20 {
    public static void main(String[] args) {
        int[] data = {9, -3, 12, 4, 6, 18, 7};
        int min = Integer.MAX_VALUE;
        int index = -1;

        for (int i = 0; i < data.length; i += 2) {
            if (data[i] > 0 && data[i] % 3 == 0) {
                if (data[i] < min) {
                    min = data[i];
                    index = i;
                }
            }
        }

        if (index != -1) {
            System.out.println(min);
            System.out.println(index);
        } else {
            System.out.println("Нет подходящих элементов.");
        }
    }
}

class Massive21 {
    public static void main(String[] args) {
        int[] data = {4, 7, 2, 8, 6, 3, 10};
        int max = 0;
        int index = -1;
        for (int i = 0; i < data.length; i++) {
            if (i % 2 != 0 && data[i] % 2 == 0 && data[i] > max) {
                max = data[i];
                index = i;
            }

        }
        if (index != -1) {
            System.out.println(max);
            System.out.println(index);
        } else {
            System.out.println("Нет подходящих элементов.");
        }
    }
}

class Massive22 {
    public static void main(String[] args) {
        int[] data = {4, 7, 3, 8, 5, 6};
        int min = Integer.MAX_VALUE;
        boolean found = false;
        for (int i = 0; i < data.length; i++) {
            if (i % 2 == 0 && data[i] % 2 != 0 && data[i] < min) {
                min = data[i];
                found = true;

            }
        }
        if (found) {
            System.out.println(min);
        } else {
            System.out.println("Нет подходящих элементов.");
        }

    }
}

class Massive23 {
    public static void main(String[] args) {
        int[] data = {4, -1, 5, -3, 2, -8};
        int min = Integer.MAX_VALUE;
        int index = -1;
        boolean found = false;
        for (int i = 0; i < data.length; i++) {
            if (i % 2 == 0 && data[i] > 0 && data[i] < min) {
                index = i;
                found = true;

            }
        }
        if (index != -1 && found) {
            System.out.println(index);
        } else
            System.out.println("Нет подходящих элементов.");
    }
}

class Massive24 {
    public static void main(String[] args) {
        int[] data = {-5, 3, -2, 4, 6, -8};
        int num = 0;
        int index = -1;
        for (int i = 0; i < data.length; i++) {
            if (i % 2 != 0 && data[i] > 0 && data[i] % 2 == 0) {
                num = data[i];
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println(index);
        } else System.out.println("Нет подходящих элементов.");

    }
}

class Massive25 {
    public static void main(String[] args) {
        int[] data = {4, -3, 5, -7, 2, -8};
        int sum = 0;
        int sum1 = 0;
        for (int i = 1; i < data.length; i += 2) {
            if (data[i] < 0) {
                sum += data[i];
            }
        }
        System.out.println(sum);

        for (int i = 0; i < data.length; i++) {
            if (i % 2 != 0 && data[i] < 0) {
                sum1 += data[i];
            }
        }
        System.out.println(sum1);
    }
}

class Massive26 {
    public static void main(String[] args) {
        int[] data = {4, -1, 6, -3, 7, 2, 8};
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < data.length; i++) {
            if (i % 2 == 0 && data[i] > 0 && data[i] % 2 == 0) {
                sum += data[i];
            }
        }

        for (int i = 0; i < data.length; i += 2) {
            if (data[i] > 0 && data[i] % 2 == 0) {
                sum1 += data[i];
            }
        }
        System.out.println(sum);
        System.out.println(sum1);
    }
}

class Massive27 {
    public static void main(String[] args) {
        int[] data = {4, 7, 3, 8, 9, 2, 11};
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < data.length; i += 2) {
            if (data[i] % 2 != 0 && data[i] > max) {
                max = data[i];
                index = i;
            }
        }
        if (index != -1) {
            System.out.println(max);
            System.out.println(index);
        } else {
            System.out.println("Нет подходящих элементов.");
        }

    }
}

class Massive28 {
    public static void main(String[] args) {
        int[] data = {5, 4, 3, 8, 6, 7};
        int min = Integer.MAX_VALUE;
        int min1 = Integer.MAX_VALUE;
        int index = -1;
        int index1 = -1;

        for (int i = 0; i < data.length; i++) {
            if (i % 2 != 0 && data[i] % 2 == 0 && data[i] < min) {
                min = data[i];
                index = i;
            }
        }
        if (index != -1) {
            System.out.println(index);
        } else {
            System.out.println("Нет подходящих элементов.");
        }

        for (int i = 1; i < data.length; i += 2) {
            if (data[i] % 2 == 0 && data[i] < min1) {
                min1 = data[i];
                index1 = i;
            }
        }
        if (index1 != -1) {
            System.out.println(index1);
        } else {
            System.out.println("Нет подходящих элементов.");
        }

    }
}

class Massive29 {
    public static void main(String[] args) {
        int[] data = {3, 5, 8, 1, 4, 9, 6};
        int firstEvenIndex = -1;
        int lastEvenIndex = -1;

        // Находим индекс первого чётного
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 == 0) {
                firstEvenIndex = i;
                break;
            }
        }

        // Находим индекс последнего чётного
        for (int i = data.length - 1; i >= 0; i--) {
            if (data[i] % 2 == 0) {
                lastEvenIndex = i;
                break;
            }
        }

        if (firstEvenIndex == -1 || lastEvenIndex == -1 || firstEvenIndex == lastEvenIndex) {
            System.out.println("Недостаточно чётных чисел.");
        } else {
            int sum = 0;
            for (int i = firstEvenIndex + 1; i < lastEvenIndex; i++) {
                sum += data[i];
            }
            System.out.println(sum);
        }
    }
}

class Massive30 {
    public static void main(String[] args) {
        int[] data = {3, 8, 5, 10, 7, 2};
        int sum = 0;
        int countOddElements = 0;
        int counter = 0;


        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 != 0) {
                sum += data[i];
                countOddElements++;

            }

        }
        double avg = (double) sum / countOddElements;

        for (int i = 0; i < data.length; i++) {
            if (avg < data[i]) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}

class Massive31 {
    public static void main(String[] args) {
        int[] data = {3, 8, 5, 10, 7, 2};
        int firstEvenIndex = -1;
        int lastEvenIndex = -1;

        //Ищем индекс первого четного элемента
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 == 0) {
                firstEvenIndex = i;
                break;
            }
        }

        // Ищем индекс последнего четного элемента
        for (int i = data.length - 1; i >= 0; i--) {
            if (data[i] % 2 == 0) {
                lastEvenIndex = i;
                break;
            }
        }

        int sum = 0;

        if (firstEvenIndex == -1 || lastEvenIndex == -1 || firstEvenIndex == lastEvenIndex) {
            System.out.println("Недостаточно чётных элементов.");
        } else {
            for (int i = firstEvenIndex + 1; i < lastEvenIndex; i++) {
                sum += data[i];
            }
            System.out.println(sum);
        }
    }
}
class Massive32 {
    public static void main(String[] args) {
        int[] data = {-2, 5, 7, 4, 9, -1, 6};
        int indexFirstPositiveNumber = -1;
        int indexLastPositiveNumber = -1;

        for (int i = 0; i < data.length; i++) {
            if (data[i] > 0) {
                indexFirstPositiveNumber = i;
                break;
            }
        }

        for (int i = data.length - 1; i >= 0; i--) {
            if (data[i] > 0) {
                indexLastPositiveNumber = i;
                break;
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = indexFirstPositiveNumber+1; i < indexLastPositiveNumber; i++) {
            if (data[i] %2 !=0 && data[i] > max) {
                max = data[i];
            }
        }

        System.out.println("Максимальное нечётное число среди идексов " + indexFirstPositiveNumber+
                 " и " + indexLastPositiveNumber + " это - " + max);

    }
}