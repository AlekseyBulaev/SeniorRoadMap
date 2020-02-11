package chapter2.problem3;

public class ListManipulatorLambdaImplementation {
    ListManipulatorLambda<String> sListAdd = (x, y) -> x.add(y);
    ListManipulatorLambda<Integer> iListAdd = (x, y) -> x.add(y);
    ListManipulatorLambda<Integer> iListRmv = (x, y) -> x.remove(y);
}
