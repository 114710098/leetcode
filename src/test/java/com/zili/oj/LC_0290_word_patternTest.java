package com.zili.oj;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC_0290_word_patternTest {

    @Test
    public void wordPattern() {
        LC_0290_word_pattern o = new LC_0290_word_pattern();
        assertTrue(o.wordPattern("abba", "dog cat cat dog"));
        assertFalse(o.wordPattern("abba", "dog cat cat fish"));
        assertFalse(o.wordPattern("aaaa", "dog cat cat dog"));
        assertFalse(o.wordPattern("abba", "dog dog dog dog"));
    }
}