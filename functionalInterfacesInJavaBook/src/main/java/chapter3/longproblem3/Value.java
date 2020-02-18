package chapter3.longproblem3;

import java.util.Arrays;

public enum Value {
    NONE(-1),
    TWO(0),
    THREE(1),
    FOUR(2),
    FIFE(3),
    SIX(4),
    SEVEN(5),
    EIGHT(6),
    NINE(7),
    TEN(8),
    JACK(9),
    QUEEN(10),
    KING(11),
    ACE(12);

    private int index;

    Value(int index) {
        this.index = index;
    }

    private int getIndex() {
        return index;
    }

    public static Value getValue(int index) {
        return Arrays.stream(Value.values())
                .filter(x -> x.getIndex() == index)
                .findFirst()
                .orElse(Value.NONE);
    }

}
