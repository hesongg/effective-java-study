package study.chapter7.item44;

import java.util.function.BiPredicate;

public class PrintConditionBiPredicate {

    public PrintConditionBiPredicate(BiPredicate<String, String> condition) {
        this.condition = condition;
    }

    public void printAndResult(String str1, String str2) {
        boolean andResult = condition.test(str1, str2);
        System.out.println("and result boolean : " + andResult);
    }

    BiPredicate<String, String> condition;
}
