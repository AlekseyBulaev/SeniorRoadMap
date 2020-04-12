package chapter3.problem3;

import java.util.function.BiPredicate;

public class BiPredicateLogic {
    public static BiPredicate<Integer, Integer> biPredicate = (x, y) -> y < x;

    public static void main(String[] args) {
        System.out.println(biPredicate.and((x, y) -> x > 2).negate().test(5, 10));
        System.out.println(biPredicate.and((x, y) -> x > 2).negate().test(1, 0));
        System.out.println(biPredicate.and((x, y) -> x > 2).negate().test(2, 10));
        System.out.println(biPredicate.and((x, y) -> x > 2).negate().test(5, 3));
    }
}
