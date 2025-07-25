package Basic_Part_1;

public class Unique_Three_Digit_Numbers_39 {
    public static void main(String[] args) {
        int amount = 0;
        for (int i = 1; i <=4; i++){
            for (int j = 1; j <=4; j++){
                for (int k = 1; k <=4; k++){
                    if (k != j && k != i && i !=j){
                        amount++;
                        System.out.println(i + " " + j + " " + k);


                    }
                }
            }
        }
        System.out.println(amount);
    }
}
