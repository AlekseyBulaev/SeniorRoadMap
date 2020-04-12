package chapter2.longproblem1;

import chapter1.longproblem1.ToString;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToStringLambdaImplementation {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("First", "Second", "Third", "Fourth");
        Map<String, Integer> map = new HashMap<>();
        map.put("First", 1);
        map.put("Second", 2);
        map.put("Third", 3);
        map.put("Fourth", 4);

        System.out.println(l2s.convert(list));
        System.out.println(m2s.convert(map));
    }

    public static ToStringLambda<List<String>> l2s = x -> {
        StringBuilder builder = new StringBuilder();
        x.forEach(item -> builder.append(item).append(','));
        return builder.toString();
    };

    public static ToString<Map<String, Integer>> m2s = x -> {
        StringBuilder builder = new StringBuilder();
        x.forEach((key, value) -> builder.append(key).append(':').append(value).append(','));
        return builder.toString();
    };
}
