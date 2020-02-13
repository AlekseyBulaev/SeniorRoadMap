package chapter3.problem2;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.function.Predicate;

public class ImplementLogic {
    static Predicate<Integer> first = (x -> x < 100);
    static Predicate<Integer> second = (x -> x%2 == 1);
    static Predicate<Integer> third = (x -> x > 20);

    public static void main(String[] args) {
        System.out.println("Test logic for 100 = " + first.and(second).negate().and(third).test(100));
        System.out.println("Test logic for 99  = " + first.and(second).negate().and(third).test(99));
        System.out.println("Test logic for 20  = " + first.and(second).negate().and(third).test(20));
        System.out.println("Test logic for 21  = " + first.and(second).negate().and(third).test(21));
        System.out.println("Test logic for 50  = " + first.and(second).negate().and(third).test(50));
        System.out.println("Test logic for 51  = " + first.and(second).negate().and(third).test(51));
    }
}
