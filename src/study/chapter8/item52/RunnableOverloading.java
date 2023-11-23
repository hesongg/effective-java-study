package study.chapter8.item52;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableOverloading {

    public static void main(String[] args) {
        new Thread(System.out::println).start();

        ExecutorService exe = Executors.newFixedThreadPool(1);
//        exe.submit(System.out::println); // 컴파일 오류 발생
    }
}
