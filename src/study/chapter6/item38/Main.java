package study.chapter6.item38;

public class Main {

    public static void main(String[] args) {

        //interface 구현한 enum
        test(BasicOperation.class, 5.0, 3.0);


    }

    private static <T extends Enum<T> & Operation> void test(Class<T> opEnumType, double x, double y) {
        for (Operation op : opEnumType.getEnumConstants()) {
            System.out.printf("%f %s %f = %f\n", x, op, y, op.apply(x, y));
        }
    }
}
