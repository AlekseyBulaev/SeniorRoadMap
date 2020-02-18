package chapter3.longproblem3;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        Set<Hand> hands = generate();
        hands.stream().forEach(System.out::println);
    }

    public static Set<Hand> generate() {
        Set<Hand> hands = new HashSet<>();
        while(hands.size()<5) {
            hands.add(new Hand(new Random().nextInt(12), new Random().nextInt(4)));
        }
        return hands;
    }

}
