package chapter3.longproblem1;

import java.util.function.Predicate;

public class Palindrome {
    public static Predicate<String> isPalindrome = x -> {
        StringBuilder reverse = new StringBuilder(x).reverse();
        return x.equals(reverse.toString());
    };

    public static void main(String[] args) {
        System.out.println(isPalindrome.test("kayak"));
        System.out.println(isPalindrome.test("anna"));
        System.out.println(isPalindrome.test("apple"));
    }
}
