package com.zili.oj;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC_1207_unique_occurrencesTest {

    @Test
    public void uniqueOccurrences() {
        LC_1207_unique_occurrences o = new LC_1207_unique_occurrences();
        assertTrue(o.uniqueOccurrences(new int[]{1,2,2,1,1,3}));
        assertTrue(o.uniqueOccurrences(new int[]{-3,0,1,-3,1,1,1,-3,10,0}));
        assertFalse(o.uniqueOccurrences(new int[]{1,2}));
        assertTrue(o.uniqueOccurrences(new int[]{}));
    }
}