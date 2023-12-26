package study.chapter9.item60;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        doubleTest();

        bigDecimalTest();
    }

    static void doubleTest() {
        double double1 = 1.03;
        double double2 = 0.42;

        //result = 0.6100000000000001
        System.out.println(double1 - double2);
    }

    static void bigDecimalTest() {
        BigDecimal bg1 = BigDecimal.valueOf(1.03);
        BigDecimal bg2 = BigDecimal.valueOf(0.42);

        //result = 0.61
        System.out.println(bg1.subtract(bg2));
    }
}
