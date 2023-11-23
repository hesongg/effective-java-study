package study.chapter8.item53;

import java.util.ArrayList;
import java.util.List;

public class HeapPollution {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        unsafeAdd(strings, Integer.valueOf(42));

//        safeAdd(strings, Integer.valueOf(42)); // 제네릭 사용하여 컴파일 오류로 런타임 오류 방지

        String s = strings.get(0); // 런타임에 ClassCastException 발생
    }

    private static void unsafeAdd(List list, Object o) { // 경고 : Raw use of parameterized class 'List'
        list.add(o); // 경고: Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
    }

    // 제네릭 메소드를 사용하여 타입 안전성 보장
    private static <T> void safeAdd(List<T> list, T o) {
        list.add(o);
    }
}