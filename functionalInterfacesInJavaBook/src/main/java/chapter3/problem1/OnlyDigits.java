package chapter3.problem1;

import java.util.function.Predicate;

public class OnlyDigits {
    public static void main(String[] args) {
        Predicate<String> onlyDigits = x -> x.matches("^[0-9]*$");

        System.out.println("onlyDigits? in \"noDigits\" = " + onlyDigits.test("noDigits"));
        System.out.println("onlyDigits? in \"some1Digits23\" = " + onlyDigits.test("some1Digits23"));
        System.out.println("onlyDigits? in \"123456\" = " + onlyDigits.test("123456"));
    }
}
