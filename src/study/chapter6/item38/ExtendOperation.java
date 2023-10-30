package study.chapter6.item38;

public enum ExtendOperation implements Operation {

    TIMES("*") {
        @Override
        public double apply(double x, double y) {
            return x * y;
        }
    },
    DIVIDE("/"){
        @Override
        public double apply(double x, double y) {
            return x / y;
        }
    };

    private final String symbol;

    ExtendOperation(String symbol) {
        this.symbol = symbol;
    }
}
