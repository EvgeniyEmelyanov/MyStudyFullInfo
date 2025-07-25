package Basic_Part_1;

public class Divisible_by_3_5_Both_50 {
    public static void main(String[] args) {
        System.out.println("Делится на 3: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                if (i==99) {
                    System.out.print(i + ".");
                }else {
                    System.out.print(i + ",");
                }
            }
        }
        System.out.println("\nДелится на 5: ");
            for (int i = 1; i <= 100; i++) {
                if (i % 5 == 0) {
                    if (i==100) {
                        System.out.print(i + ".");
                    }else {
                        System.out.print(i + ",");
                    }

                }
            }
                    System.out.print("\nДелится на 3 и на 5: ");
        for (int i = 1; i <= 100; i++) {
                    if (i % 3 ==0 && i % 5 == 0) {
                        if (i==90) {
                            System.out.print(i + ".");
                        }else {
                            System.out.print(i + ",");
                        }
                    }
        }
    }
}
