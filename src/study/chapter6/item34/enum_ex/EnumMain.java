package study.chapter6.item34.enum_ex;

import java.util.*;

public class EnumMain {
    public static void main(String[] args) {
//        System.out.println(Apple.RED == Orange.TEMPLE); //컴파일 오류 발생. 타입 다른 경우 비교조차 안됨

        // Object 메소드 구현
        System.out.println(Apple.RED);
        System.out.println(Apple.RED.equals(Apple.GREEN));
        System.out.println(Apple.RED.hashCode());

        //Comparable compareTo 구현
        System.out.println(Apple.RED.compareTo(Apple.GREEN));
        System.out.println(Arrays.stream(Rainbow.values()).sorted(Comparator.reverseOrder()).toList());

        //values() 구현
        System.out.println(Arrays.stream(Rainbow.values()).toList());

        //enum 내에서 추상 메서드 overriding
        System.out.println(Operation.TIMES.apply(10, 5));

        //valueOf()
        System.out.println(Operation.valueOf("PLUS") == Operation.PLUS);

        //fromString() 구현 -> MINUS
        System.out.println(Operation.fromString("-"));

        //전략 열거 타입 패턴
        System.out.println(ElectronicProducts.GALAXY.getLink());
        System.out.println(ElectronicProducts.IPHONE.getLink());
    }

}
