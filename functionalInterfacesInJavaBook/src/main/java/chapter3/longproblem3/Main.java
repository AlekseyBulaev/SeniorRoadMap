package chapter3.longproblem3;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static Predicate<Hand> straight = x -> {
        List<Integer> list = x.getCards().stream().map(Card::getValue).map(Value::ordinal).sorted().collect(Collectors.toList());
        Integer first = list.get(0);
        for(int i = 1; i < list.size(); i++) {
            if(1 + first != 0 +list.get(i)){
                return false;
            }
            first = list.get(i);
        }
        return true;
    };

    public static Predicate<Hand> flash = x -> {
        String compare = x.getCards().stream().findFirst().orElseThrow(null).getSuite().getValue();
        AtomicBoolean result = new AtomicBoolean(true);
        x.getCards().forEach(card -> {
            if(!card.getSuite().getValue().equals(compare)){
                result.set(false);
            }
        });
        return result.get();
    };

    public static Predicate<Hand> fullHouse = x -> {
        Set<Value> values = new HashSet<>();
        AtomicInteger count = new AtomicInteger();
       Value compare = x.getCards().stream().findFirst().orElseThrow(null).getValue();
        x.getCards().forEach(card -> {
            values.add(card.getValue());
            if(card.getValue()==compare) {
                count.getAndIncrement();
            }
        });
        return values.size() == 2 && count.get() <= 3 && count.get() >= 2;
    };

    public static void main(String[] args) {
        simulateStraight();
        simulateFlash();
        simulateFullHouse();
    }

    private static void simulateStraight() {
        int count = 0;
        Hand hand;
        while (straight.negate().test(hand = new Hand())) {
            count++;
        }
        System.out.println("Straight: [" + hand + "] gets after " + count +"  times");
    }

    private static void simulateFlash() {
        int count = 0;
        Hand hand;
        while (flash.negate().test(hand = new Hand())) {
            count++;
        }
        System.out.println("Flash: [" + hand + "] gets after " + count +"  times");
    }

    private static void simulateFullHouse() {
        int count = 0;
        Hand hand;
        while (fullHouse.negate().test(hand = new Hand())) {
            count++;
        }
        System.out.println("FullHouse: [" + hand + "] gets after " + count +"  times");
    }
}
