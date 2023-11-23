package study.chapter8.item52;

import java.math.BigInteger;
import java.util.*;

public class Main {

    public static String classify(Set<?> s) {
        return "집합";
    }
    public static String classify(List<?> l) {
        return "리스트";
    }
    public static String classify(Collection<?> c) {
        return "그 외";
    }

    public static String classifyVer2(Collection<?> c) {
        return c instanceof Set ? "집합2"
                : c instanceof List ? "리스트2"
                : "그 외2";
    }

    public static void main(String[] args) {
        Collection<?>[] collections = {
                new HashSet<String>(),
                new ArrayList<BigInteger>(),
                new HashMap<String, String>().values()
        };

        for (Collection<?> c : collections) {
            System.out.println(classify(c));
        }

        for (Collection<?> c : collections) {
            System.out.println(classifyVer2(c));
        }

        Set<Integer> set = new TreeSet<>();
        List<Integer> list = new ArrayList<>();

        for (int i = -3; i < 3; i++) {
            list.add(i);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(list);
            list.remove(i);
        }
        System.out.println(list);
    }
}
