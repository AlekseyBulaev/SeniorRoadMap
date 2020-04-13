package chapter3.longproblem3;

import java.util.Objects;

public class Card {
    private Value value;
    private Suite suite;

    public Card(int value, int suite) {
        this.value = Value.getbyOrdinal(++value);
        this.suite = Suite.getbyOrdinal(++suite);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return value == card.value &&
                suite == card.suite;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, suite);
    }

    public Value getValue() {
        return value;
    }

    public Suite getSuite() {
        return suite;
    }
}
