package chapter3.longproblem3;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Hand {
    private Set<Card> hand;

    public Hand() {
        this.hand = generate();
    }

    private Set<Card> generate() {
        Set<Card> cards = new HashSet<>();
        while(cards.size()<5) {
            cards.add(new Card(new Random().nextInt(12), new Random().nextInt(4)));
        }
        return cards;
    }

    public Set<Card> getHand() {
        return hand;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        hand.forEach(x -> {
            result.append(x.getValue().getValue()).append(x.getSuite().getValue());
        });
        return result.toString();
    }
}
