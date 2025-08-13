package Povtorenie_s_GPT.Comparator;

import java.util.*;

class ComparatorTask1 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "a", "merge", "map", "code");

        // TODO: отсортировать по длине ↑, при равенстве по алфавиту


        Comparator<String> byLengthAsc = Comparator.comparingInt(String::length);

        Comparator<String> byLengthAlpha = byLengthAsc.thenComparing(Comparator.naturalOrder());

        words.sort(byLengthAlpha);


        System.out.println(words);
    }
}

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return name + "=" + score;
    }
}

class ComparatorTask2 {
    public static void main(String[] args) {
        List<Player> players = Arrays.asList(
                new Player("Alice", 20),
                new Player("Bob", 25),
                new Player("Charlie", 20)
        );

        // TODO: отсортировать по score ↓, при равенстве по name ↑

        Comparator<Player> playerComparator = Comparator.comparingInt((Player p) -> p.score).reversed();
        Comparator<Player> sortByName = playerComparator.thenComparing(p -> p.name);

        players.sort(sortByName);


        System.out.println(players);
    }
}




class ComparatorPractice1 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "a", "merge", "map", "code");

        // TODO: твой компаратор здесь


        System.out.println(words);
    }
}
