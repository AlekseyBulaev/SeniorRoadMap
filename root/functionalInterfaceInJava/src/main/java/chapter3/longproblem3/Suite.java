package chapter3.longproblem3;

import java.util.Arrays;

public enum Suite {
    NONE("none"),
    CLUB("c"),
    HEART("h"),
    SPADE("s"),
    DIAMOND("d");

    private String value;

    Suite(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Suite getbyOrdinal(int arg) {
        return Arrays.stream(Suite.values()).filter(x-> x.ordinal()==arg).findFirst().orElse(Suite.NONE);
    }

    public static Suite getSuite(String value) {
        return Arrays.stream(Suite.values())
                .filter(x -> x.getValue().equals(value))
                .findFirst()
                .orElse(Suite.NONE);
    }
}
