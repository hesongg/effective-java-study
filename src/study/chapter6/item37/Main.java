package study.chapter6.item37;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toSet;
import static study.chapter6.item37.Fruit.Color.*;

public class Main {

    public static void main(String[] args) {
        //set
        var fruits = List.of(new Fruit("바나나", YELLOW), new Fruit("사과", RED),
                new Fruit("딸기", RED), new Fruit("키위", GREEN));

        Set<Fruit>[] fruitSet = new Set[Fruit.Color.values().length];

        for (int i = 0; i < fruitSet.length; i++) {
            fruitSet[i] = new HashSet<>();
        }

        for (Fruit p : fruits) {
            fruitSet[p.color.ordinal()].add(p);
        }

        for (int i = 0; i < fruitSet.length; i++) {
            System.out.printf("%s: %s%n", Fruit.Color.values()[i], fruitSet[i]);
        }

        //enumMap
        Map<Fruit.Color, Set<Fruit>> fruitEnumMap = new EnumMap<>(Fruit.Color.class);

        for (Fruit.Color c : Fruit.Color.values()) {
            fruitEnumMap.put(c, new HashSet<>());
        }

        for (Fruit f : fruits) {
            fruitEnumMap.get(f.color).add(f);
        }

        System.out.println(fruitEnumMap);

        //Stream
        System.out.println(fruits.stream().collect(groupingBy(f -> f.color,
                () -> new EnumMap<>(Fruit.Color.class),
                toSet())));

        //stream 최적화 확인
        var fruits2 = List.of(new Fruit("바나나", YELLOW), new Fruit("사과", RED));

        System.out.println(fruits2.stream().collect(groupingBy(f -> f.color,
                () -> new EnumMap<>(Fruit.Color.class),
                toSet())));

        Map<Fruit.Color, Set<Fruit>> fruitEnumMap2 = new EnumMap<>(Fruit.Color.class);

        for (Fruit.Color c : Fruit.Color.values()) {
            fruitEnumMap.put(c, new HashSet<>());
        }
        for (Fruit f : fruits2) {
            fruitEnumMap.get(f.color).add(f);
        }
        System.out.println(fruitEnumMap);
    }
}
