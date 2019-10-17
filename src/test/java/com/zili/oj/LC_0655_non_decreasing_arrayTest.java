package com.zili.oj;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC_0655_non_decreasing_arrayTest {

    @Test
    public void checkPossibility() {
        LC_0655_non_decreasing_array o = new LC_0655_non_decreasing_array();
        assertTrue(o.checkPossibility(new int[]{4, 2, 3}));
        assertFalse(o.checkPossibility(new int[]{4, 3, 2}));
        assertTrue(o.checkPossibility(new int[]{2}));
        assertTrue(o.checkPossibility(new int[]{1, 2, 3}));
        assertFalse(o.checkPossibility(new int[]{3, 4, 2, 3}));
    }
}