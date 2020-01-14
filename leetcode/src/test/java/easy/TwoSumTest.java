package easy;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static easy.TwoSum.twoSum;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.runners.Parameterized.*;

@RunWith(Parameterized.class)
public class TwoSumTest {
    private Integer[] arr;
    private Integer[] target;
    private Integer[] result;

    public TwoSumTest(Integer[] arr, Integer[] target, Integer[] result) {
        this.arr = arr;
        this.target = target;
        this.result = result;
    }

    @Parameters
    public static Collection data() {
        return Arrays.asList(new Integer[][][]{
                {{2, 7, 11, 15}, {9}, {0, 1}},
                {{2, 7, 11, 15}, {13},{0, 2}}
        });
    }
    @Test
    public void twoSumTest() {
        assertEquals(result, twoSum(arr, target[0]));
    }
}
