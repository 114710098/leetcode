package com.zili.oj;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC_0804_unique_morse_code_wordsTest {

    @Test
    public void uniqueMorseRepresentations() {
        LC_0804_unique_morse_code_words o = new LC_0804_unique_morse_code_words();
        assertEquals(2, o.uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"}));
        assertEquals(0, o.uniqueMorseRepresentations(new String[]{}));
        assertEquals(1, o.uniqueMorseRepresentations(new String[]{"abc", "abc"}));
    }
}