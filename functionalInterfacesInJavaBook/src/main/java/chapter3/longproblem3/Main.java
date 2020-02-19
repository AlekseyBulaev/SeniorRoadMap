package chapter3.longproblem3;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static Predicate<Hand> straight = x -> {
        List<Integer> list = x.getHand().stream().map(Card::getValue).map(Value::ordinal).sorted().collect(Collectors.toList());
        Integer first = list.get(0);
        for(int i = 1; i < list.size(); i++) {
            if(1 + first != 0 +list.get(i)){
                return false;
            }
            first = list.get(i);
        }
        return true;
    };

    public static void main(String[] args) {
        simulateStraight();
    }

    private static void simulateStraight() {
        int count = 0;
        Hand hand;
        while (straight.negate().test(hand = new Hand())) {
            count++;
        }
        System.out.println("Straight: [" + hand + "] gets after " + count +"  times");
    }
}
