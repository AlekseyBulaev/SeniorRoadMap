package chapter3.longproblem3;

import java.util.Arrays;

public enum Value {
    NONE("none"),
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIFE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("T"),
    JACK("J"),
    QUEEN("Q"),
    KING("K"),
    ACE("A");

    private String value;

    Value(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Value getbyOrdinal(int arg) {
        return Arrays.stream(Value.values()).filter(x-> x.ordinal()==arg).findFirst().orElse(Value.NONE);
    }

    public static Value getValue(String value) {
        return Arrays.stream(Value.values())
                .filter(x -> x.getValue().equals(value))
                .findFirst()
                .orElse(Value.NONE);
    }

}
