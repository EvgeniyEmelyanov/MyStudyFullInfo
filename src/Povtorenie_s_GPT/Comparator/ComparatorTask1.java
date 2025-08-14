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

        Comparator<String> sortByLength = Comparator.comparingInt((String s) -> s.length()).reversed();
        Comparator<String> sortByName = sortByLength.thenComparing(Comparator.naturalOrder());

        words.sort(sortByName);

        System.out.println(words);
    }
}


class ComparatorPractice2 {
    public static void main(String[] args) {
        List<Player> players = Arrays.asList(
                new Player("Alice", 20),
                new Player("Bob", 25),
                new Player("Charlie", 20),
                new Player("Bob", 15)
        );

        // TODO: компаратор: name ↓, при равенстве score ↑
        // Подсказка: Comparator.comparing(p -> p.name) ... thenComparing(...)

        Comparator<Player> sortByAlphabet = Comparator.comparing((Player p) -> p.name).reversed();
        Comparator<Player> sortByScore = sortByAlphabet.thenComparing(p -> p.score).reversed();

        players.sort(sortByScore);

        System.out.println(players);
    }
}

class ComparatorTask3 {
    public static void main(String[] args) {
        Map<String, Integer> freq = new HashMap<>();
        freq.put("java", 5);
        freq.put("code", 5);
        freq.put("map", 2);
        freq.put("merge", 3);

        List<Map.Entry<String, Integer>> list = new ArrayList<>(freq.entrySet());

        // TODO: собрать компаратор: value ↓, затем key ↑
        // TODO: отсортировать list
        // TODO: вывести list (key=value)

        Comparator<Map.Entry<String, Integer>> sortVal = Comparator.comparingInt((Map.Entry<String, Integer> e) -> e.getValue())
                .reversed();
        Comparator<Map.Entry<String, Integer>> sortByName = sortVal.thenComparing((Map.Entry<String, Integer> e) -> e.getKey());
        list.sort(sortByName);

        System.out.println(list);


    }

}


class ComparatorTask4TopK {
    public static void main(String[] args) {
        Map<String, Integer> freq = new HashMap<>();
        freq.put("java", 5);
        freq.put("code", 5);
        freq.put("map", 2);
        freq.put("merge", 3);

        int k = 2;

        List<Map.Entry<String, Integer>> list = new ArrayList<>(freq.entrySet());
        // TODO: отсортировать list: value ↓, затем key ↑
        // TODO: вывести первые k записей формата key=value

        Comparator<Map.Entry<String, Integer>> sortVal = Comparator.comparingInt((Map.Entry<String, Integer> e) -> e.getValue()).reversed();
        Comparator<Map.Entry<String, Integer>> sortByName = sortVal.thenComparing(Map.Entry::getKey);

        list.sort(sortByName);

        for (int i = 0; i < k && i < list.size(); i++) {
            Map.Entry<String, Integer> e = list.get(i);
            System.out.println(e.getKey() + "=" + e.getValue());


        }
    }
}