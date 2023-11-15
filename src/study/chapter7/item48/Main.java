package study.chapter7.item48;

import java.util.ArrayList;
import java.util.SplittableRandom;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        int size = 10000000;

        // ThreadLocalRandom 성능 테스트
        long start = System.currentTimeMillis();
        IntStream.range(0, size).parallel().forEach(i -> ThreadLocalRandom.current().nextInt());
        long end = System.currentTimeMillis();
        System.out.println("ThreadLocalRandom Time: " + (end - start) + " ms");

        // SplittableRandom 성능 테스트
        start = System.currentTimeMillis();
        SplittableRandom splittableRandom = new SplittableRandom();
        IntStream.range(0, size).parallel().forEach(i -> splittableRandom.split().nextInt());
        end = System.currentTimeMillis();
        System.out.println("SplittableRandom Time: " + (end - start) + " ms");
    }
}
