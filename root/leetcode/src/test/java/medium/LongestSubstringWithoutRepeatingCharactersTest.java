package medium;

import org.junit.jupiter.api.Test;

import static medium.LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    void lengthOfLongestSubstringTest() {
        assertEquals(3, lengthOfLongestSubstring("abcabcabc"));
    }

    @Test
    void lengthOfLongestSubstringTest2() {
        assertEquals(1, lengthOfLongestSubstring(" "));
    }

    @Test
    void lengthOfLongestSubstringTest3() {
        assertEquals(3, lengthOfLongestSubstring("dvdf"));
    }
}