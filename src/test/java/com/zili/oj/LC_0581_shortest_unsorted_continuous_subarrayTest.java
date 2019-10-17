package com.zili.oj;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC_0581_shortest_unsorted_continuous_subarrayTest {

    @Test
    public void findUnsortedSubarray() {
        LC_0581_shortest_unsorted_continuous_subarray o = new LC_0581_shortest_unsorted_continuous_subarray();
        assertEquals(0, o.findUnsortedSubarray(new int[]{}));
        assertEquals(5, o.findUnsortedSubarray(new int[]{2, 6, 4, 8, 10, 9, 15}));
        assertEquals(0, o.findUnsortedSubarray(new int[]{1, 2, 3, 4, 5, 6, 7}));
        assertEquals(3, o.findUnsortedSubarray(new int[]{1, 2, 5, 4, 3, 6, 7}));
        assertEquals(5, o.findUnsortedSubarray(new int[]{2, 1, 5, 4, 3, 6, 7}));
        assertEquals(5, o.findUnsortedSubarray(new int[]{5, 4, 3, 2, 1}));
    }
}