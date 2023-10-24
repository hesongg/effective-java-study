package study.chapter6.item34.staticint_ex;

public class StaticInt {
    public static final int APPLE_RED = 0;
    public static final int APPLE_GREEN = 1;

    public static final int ORANGE_TEMPLE = 0;
    public static final int ORANGE_BLOOD = 1;

    public static void main(String[] args) {
        System.out.println(APPLE_RED == ORANGE_TEMPLE); //true 이다. -> 개발자가 의도하지않은 결과 발생
    }
}
