package chapter4;

import java.util.function.Function;

public class Main {

    public static Function<A, B> fromAtoB = a -> new B(a.d, a.s, "" + a.i);

    public static Function<B, A> fromBtoA = b -> new A(b.a, b.b, Integer.parseInt(b.c));

    public static void main(String[] args) {
        A a = new A(10.0, "string", 1);
        B b = new B(5.5, "new string", "10");

        System.out.println(fromAtoB.apply(a));
        System.out.println(fromBtoA.apply(b));
    }
}
