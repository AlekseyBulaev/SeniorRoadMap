package chapter3.longproblem3;

import java.util.Arrays;

public enum Suite {
    NONE(-1),
    CLUB(0),
    HEART(1),
    SPADE(2),
    DIAMOND(3);

    private int index;

    Suite(int index) {
        this.index = index;
    }

    private int getIndex() {
        return index;
    }

    public static Suite getSuite(int index) {
        return Arrays.stream(Suite.values())
                .filter(x -> x.getIndex() == index)
                .findFirst()
                .orElse(Suite.NONE);
    }
}
