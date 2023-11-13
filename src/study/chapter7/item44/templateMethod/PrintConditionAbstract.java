package study.chapter7.item44.templateMethod;

abstract class PrintConditionAbstract {

    public void printAndResult(String str) {
        boolean andResult = firstCondition(str) && secondCondition(str);
        System.out.println("and result boolean : " + andResult);
    }

    abstract boolean firstCondition(String str);
    abstract boolean secondCondition(String str);
}
