package chapter4;

public class B {
    Double a;
    String b;
    String c;

    public B(Double a, String b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "B: " + a + " " + b + " " + c;
    }
}
