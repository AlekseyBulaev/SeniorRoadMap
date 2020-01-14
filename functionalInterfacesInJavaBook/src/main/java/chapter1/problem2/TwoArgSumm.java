package chapter1.problem2;

import org.w3c.dom.ls.LSOutput;

public class TwoArgSumm {

    public static void main(String[] args) {
        Summer<Integer> intSum = new Summer<Integer>() {
            @Override
            public Integer sum(Integer arg1, Integer arg2) {
                return arg1 + arg2;
            }
        };

        Summer<Double> doubleSum = new Summer<Double>() {
            @Override
            public Double sum(Double arg1, Double arg2) {
                return  arg1 + arg2;
            }
        };

        Summer<Long> longSum = new Summer<Long>() {
            @Override
            public Long sum(Long arg1, Long arg2) {
                return arg1 + arg2;
            }
        };

        System.out.println(intSum.sum(Integer.MIN_VALUE, Integer.MAX_VALUE));
        System.out.println(doubleSum.sum(Double.MIN_VALUE, Double.MAX_VALUE));
        System.out.println(longSum.sum(Long.MIN_VALUE, Long.MAX_VALUE));
    }
}
