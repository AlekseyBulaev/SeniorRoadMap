package chapter3.longproblem3;

import java.util.Objects;

public class Hand {
    private Value value;
    private Suite suite;

    public Hand(int value, int suite) {
        this.value = Value.getValue(value);
        this.suite = Suite.getSuite(suite);
    }

    @Override
    public String toString() {
        return "Hand{" +
                "value=" + value +
                ", suite=" + suite +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hand hand = (Hand) o;
        return value == hand.value &&
                suite == hand.suite;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, suite);
    }
}
