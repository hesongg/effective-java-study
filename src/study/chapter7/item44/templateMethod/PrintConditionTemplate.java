package study.chapter7.item44.templateMethod;

public class PrintConditionTemplate extends PrintConditionAbstract {
    @Override
    boolean firstCondition(String str1) {
        return str1 != null && str1.equals("");
    }

    @Override
    boolean secondCondition(String str2) {
        return "str2".equals(str2);
    }
}
