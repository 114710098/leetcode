package com.zili.oj;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC_0720_longest_word_in_dictTest {

    @Test
    public void longestWord() {
        LC_0720_longest_word_in_dict o = new LC_0720_longest_word_in_dict();
//        assertEquals("world", o.longestWord(new String[]{"w", "wo", "wor", "worl", "world"}));
//        assertEquals("apple", o.longestWord(new String[]{"a", "banana", "app", "appl", "ap", "apply", "apple"}));
        assertEquals("aps", o.longestWord(new String[]{"a", "banana", "aps", "appl", "ap", "apply", "apple"}));
        assertEquals("ax", o.longestWord(new String[]{"a", "banana", "aps", "appl", "ax", "apply", "apple"}));
        assertEquals("", o.longestWord(new String[]{}));
    }
}