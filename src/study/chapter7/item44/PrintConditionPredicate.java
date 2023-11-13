package study.chapter7.item44;

import java.util.function.Predicate;

public class PrintConditionPredicate {

    public PrintConditionPredicate(Predicate<String> firstCondition,
                                   Predicate<String> secondCondition) {
        this.firstCondition = firstCondition;
        this.secondCondition = secondCondition;
    }

    public void printAndResult(String testString) {
        boolean andResult = firstCondition.and(secondCondition).test(testString);
        System.out.println("and result boolean : " + andResult);
    }

    Predicate<String> firstCondition;
    Predicate<String> secondCondition;
}
