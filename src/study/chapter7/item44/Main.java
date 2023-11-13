package study.chapter7.item44;

import study.chapter7.item44.templateMethod.PrintConditionTemplate;

public class Main {

    public static void main(String[] args) {
        PrintConditionTemplate template = new PrintConditionTemplate();
        template.printAndResult("test");

        PrintConditionPredicate predicate = new PrintConditionPredicate(s -> s != null && !s.equals(""), "test"::equals);
        predicate.printAndResult("test");

        PrintConditionBiPredicate biPredicate = new PrintConditionBiPredicate(String::equals);
        biPredicate.printAndResult("test", "test");
    }
}
