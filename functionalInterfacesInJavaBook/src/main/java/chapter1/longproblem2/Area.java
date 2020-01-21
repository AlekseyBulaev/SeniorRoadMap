package chapter1.longproblem2;

@FunctionalInterface
public interface Area {
    int compute();
    default int numberOfSides() {
        return 4;
    }
}
