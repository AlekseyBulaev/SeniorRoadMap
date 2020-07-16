package easy;

import org.junit.jupiter.api.Test;

import static easy.ReverseInteger.reverse;
import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest {

    @Test
    void reverseTest() {
        assertEquals(123, reverse(321));
        assertEquals(-123, reverse(-321));
        assertEquals(0, reverse(1534236469));
    }
}