package study.chapter6.item34.enum_ex;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public enum Operation {
    PLUS("+") {
        @Override
        public double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS("-") {
        @Override
        public double apply(double x, double y) {
            return x - y;
        }
    },
    TIMES("*") {
        @Override
        public double apply(double x, double y) {
            return x * y;
        }
    },
    DIVIDE("/") {
        @Override
        public double apply(double x, double y) {
            return x / y;
        }
    };

    private static final Map<String, Operation> stringToEnum = Arrays.stream(values())
            .collect(Collectors.toMap(Operation::getSymbol, Function.identity()));

    public static Operation fromString(String symbol) {
        return stringToEnum.getOrDefault(symbol, PLUS);
    }


    private final String symbol;

    private String getSymbol() {
        return symbol;
    }

    Operation(String symbol) {
        this.symbol = symbol;
    }

    public abstract double apply(double x, double y);
}
