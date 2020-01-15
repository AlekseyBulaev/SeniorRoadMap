package chapter1.problem3;

import java.util.ArrayList;
import java.util.List;

public class ListManipulatorImpl {
    public static void main(String[] args) {

        ListManipulator<String> sListAdd = new ListManipulator<String>() {
            @Override
            public void manipulate(List<String> arg, String s) {
                arg.add(s);
            }
        };

        ListManipulator<Integer> iListAdd = new ListManipulator<Integer>() {
            @Override
            public void manipulate(List<Integer> arg, Integer integer) {
                arg.add(integer);
            }
        };

        ListManipulator<Integer> iListRmv = new ListManipulator<Integer>() {
            @Override
            public void manipulate(List<Integer> arg, Integer integer) {
                arg.remove(integer);
            }
        };
    }
}
