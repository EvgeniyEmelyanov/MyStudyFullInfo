package Basic_Part_1;

public class Multiplication_Table_7 {
    public static void umn (int a) {
        for (int i = 0; i <= 9; i++) {
            System.out.println(a + " x " + (i + 1) + " = " + (a * (i + 1)));
        }
    }

    public static void main(String[] args) {
        Multiplication_Table_7.umn (8);
    }


}
