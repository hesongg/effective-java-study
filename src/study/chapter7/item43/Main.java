package study.chapter7.item43;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        var map = new HashMap<String, Integer>();
        map.put("key", 2);

        //lambda
        map.merge("key", 4, (count, incr) -> count + incr);

        //method reference
        map.merge("key", 4, Integer::sum);

        map.forEach((k, v) -> System.out.printf("key : %s, value : %s", k, v));
    }
}
