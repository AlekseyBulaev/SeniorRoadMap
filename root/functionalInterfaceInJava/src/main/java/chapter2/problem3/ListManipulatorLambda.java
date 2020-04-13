package chapter2.problem3;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
public interface ListManipulatorLambda<T> {
    void manipulate(List<T> arg, T t);
}
