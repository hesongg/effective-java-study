package study.chapter7.item42;

import java.util.*;
import java.util.function.DoubleBinaryOperator;

public class Main {

    public static void main(String[] args) {
        var list = Arrays.asList("ssssssss", "ssss", "sss");

        simple(list);
        System.out.println(list);
    }

    static void anonymousClass(List<String> list) {

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });
    }

    static void lambda(List<String> list) {
        Collections.sort(list, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
    }

    static void simple(List<String> list) {
        Collections.sort(list, Comparator.comparingInt(String::length));

        list.sort(Comparator.comparingInt(String::length));
    }

    enum Operation {
        PLUS("+", (x, y) -> x + y /*+ ZERO*/) { // ZERO compile error

            @Override
            public double apply(double x, double y) {
                return x + y + ZERO;
            }
        };

        public static final double ZERO = 0;

        private final String symbol;
        private final DoubleBinaryOperator operator;

        Operation(String symbol, DoubleBinaryOperator operator) {
            this.symbol = symbol;
            this.operator = operator;
        }

        public abstract double apply(double x, double y);
    }
}
