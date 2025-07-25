package Basic_Part_1;

public class Swap_Variables_15 {
    public static void abc (int i, int j) {
        int a;
        a = i;
        i = j;
        j = a;
        System.out.println(i +" " +j);
    }
    public static void main(String[] args) {
        Swap_Variables_15 swap = new Swap_Variables_15();
        swap.abc(5,8);
        System.out.println(swap);
    }
}
