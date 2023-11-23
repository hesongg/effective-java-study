package study.chapter8.item52;

// T : class level generic
public class Test<T> {

    private T testField;

    //method level generic
    public <F> F testGeneric(F test) {
        return test;
    }

    public T getTestField() {
        return testField;
    }

    public void setTestField(T testField) {
        this.testField = testField;
    }
}
