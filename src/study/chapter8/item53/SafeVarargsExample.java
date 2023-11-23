package study.chapter8.item53;

public class SafeVarargsExample {

    //@SafeArgs 없으면 Possible heap pollution from parameterized vararg type
    @SafeVarargs
    public static <T> void printItemsVarargs(T... items) {
        for (T item : items) {
            System.out.println(item);
        }
    }

    public static void printItems(String... items) {
        for (String item : items) {
            System.out.println(item);
        }
    }
}
