package chapter1.longproblem1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToStringImpl {
    public static void main(String[] args) {
        ToString<List<String>> l2s = new ToString<List<String>>() {
            @Override
            public String convert(List<String> strings) {
                StringBuilder result = new StringBuilder();
                strings.forEach(s -> result.append(s).append(","));
                return result.toString();
            }
        };

        ToString<Map<String, Integer>> m2s = new ToString<Map<String, Integer>>() {
            @Override
            public String convert(Map<String, Integer> stringIntegerMap) {
                StringBuilder result = new StringBuilder();
                stringIntegerMap.forEach((s, integer) -> result.append(s).append(":").append(integer).append(","));
                return result.toString();
            }
        };

        List<String> list = Arrays.asList("First", "Second", "Third", "Fourth");
        Map<String, Integer> map = new HashMap<>();
        map.put("First", 1);
        map.put("Second", 2);
        map.put("Third", 3);
        map.put("Fourth", 4);

        System.out.println(l2s.convert(list));
        System.out.println(m2s.convert(map));

    }
}
