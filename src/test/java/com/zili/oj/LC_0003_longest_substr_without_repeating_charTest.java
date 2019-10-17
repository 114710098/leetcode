package com.zili.oj;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC_0003_longest_substr_without_repeating_charTest {

    @Test
    public void lengthOfLongestSubstring() {
        LC_0003_longest_substr_without_repeating_char o = new LC_0003_longest_substr_without_repeating_char();
        assertEquals(3, o.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, o.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, o.lengthOfLongestSubstring("pwwkew"));
    }
}