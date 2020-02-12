package chapter2.longproblem1;

@FunctionalInterface
public interface ToStringLambda<T> {
    String convert(T t);
}
