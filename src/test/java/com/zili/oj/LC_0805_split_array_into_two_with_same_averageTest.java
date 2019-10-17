package com.zili.oj;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC_0805_split_array_into_two_with_same_averageTest {

    @Test
    public void splitArraySameAverage() {
        LC_0805_split_array_into_two_with_same_average o = new LC_0805_split_array_into_two_with_same_average();
        assertTrue(o.splitArraySameAverage(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
        assertFalse(o.splitArraySameAverage(new int[]{1, 2}));
    }
}