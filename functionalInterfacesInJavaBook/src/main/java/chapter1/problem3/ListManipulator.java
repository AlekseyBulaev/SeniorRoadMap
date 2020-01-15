package chapter1.problem3;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
public interface ListManipulator<T> {
    void manipulate(List<T> arg, T t);
    default List<T> create(){
        return new ArrayList<T>();
    }
}
