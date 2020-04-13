package chapter1.longproblem3;

@FunctionalInterface
public interface ListValue<X extends Car> {

    int compute(Car car);

    default int getPresentYear() {
        return 2020;
    }
}
