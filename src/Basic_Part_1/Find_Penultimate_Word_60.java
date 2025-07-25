package Basic_Part_1;

import java.util.Scanner;

public class Find_Penultimate_Word_60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        char[] chars = word.toCharArray();

        String str = "Луна\n" +
                "Океан\n" +
                "Звезда\n" +
                "Дерево\n" +
                "Книга\n" +
                "Море\n" +
                "Город\n" +
                "Птица\n" +
                "Солнце\n" +
                "Река\n" +
                "Цветок\n" +
                "Дом\n" +
                "Ветер\n" +
                "Камень\n" +
                "Облако\n" +
                "Мост\n" +
                "Листья\n" +
                "Песок\n" +
                "Зима\n" +
                "Радуга";
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == chars[i]) {}
            System.out.print (charArray[i]);
        }
    }
}
