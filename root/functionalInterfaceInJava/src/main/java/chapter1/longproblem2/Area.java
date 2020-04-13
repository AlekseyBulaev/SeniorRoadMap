package chapter1.longproblem2;

@FunctionalInterface
public interface Area {
    double compute(Integer... arg);
    default int numberOfSides() {
        return 4;
    }
}
