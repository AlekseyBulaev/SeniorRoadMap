package chapter1.longproblem1;

@FunctionalInterface
public interface ToString<T> {
    String convert(T t);
}
