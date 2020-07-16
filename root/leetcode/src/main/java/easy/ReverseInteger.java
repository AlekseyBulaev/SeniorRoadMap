package easy;

public class ReverseInteger {
    public static int reverse(int x) {
        long result = 0;
        while (x != 0) {
            result = x % 10 + result * 10;
            x /= 10;
        }
        result = result > Integer.MAX_VALUE ?  0 : result < Integer.MIN_VALUE ? 0 : result ;
        return (int) result;
    }
}
