package chapter4;

public class A {
    Double d;
    String s;
    Integer i;

    public A(Double d, String s, Integer i) {
        this.d = d;
        this.s = s;
        this.i = i;
    }

    @Override
    public String toString() {
        return "A: " + d + " " + s + " " + i;
    }
}
