package chapter2.longproblem3;

public class SumFromZeroImplementation {
    public static SumFromZero sum = x -> {
        int result = 0;
        for (int i = 0; i <= x; i++) {
            result +=i;
        }
        return result;
    };

    public static void main(String[] args) {
        System.out.println(sum.sum(-1));
        System.out.println(sum.sum(0));
        System.out.println(sum.sum(1));
        System.out.println(sum.sum(2));
        System.out.println(sum.sum(5));
        System.out.println(sum.sum(10));
        System.out.println(sum.sum(15));
        System.out.println(sum.sum(30));
    }
}
