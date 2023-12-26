package study.chapter9.item61;

import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        integerComparatorTest();
    }

    static void integerComparatorTest() {
        Comparator<Integer> naturalOrder =
                (i, j) -> (i < j) ? -1 : (i == j ? 0 : 1);

        var result = naturalOrder.compare(Integer.valueOf(42), Integer.valueOf(42));

        //기대 값 0, 하지만 결과는 1
        System.out.println(result);
    }
}
