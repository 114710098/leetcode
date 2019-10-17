package com.zili.oj;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC_0414_3rd_max_numTest {

    @Test
    public void thirdMax() {
        LC_0414_3rd_max_num o = new LC_0414_3rd_max_num();
        assertEquals(1, o.thirdMax(new int[]{3, 2, 1}));
        assertEquals(2, o.thirdMax(new int[]{2, 1}));
        assertEquals(1, o.thirdMax(new int[]{2, 3, 2, 1}));
        assertEquals(-2147483648, o.thirdMax(new int[]{1, 2, -2147483648}));
    }
}