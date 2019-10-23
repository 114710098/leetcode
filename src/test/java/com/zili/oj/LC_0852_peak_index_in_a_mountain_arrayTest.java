package com.zili.oj;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC_0852_peak_index_in_a_mountain_arrayTest {

    @Test
    public void peakIndexInMountainArray() {
        LC_0852_peak_index_in_a_mountain_array o = new LC_0852_peak_index_in_a_mountain_array();
        assertEquals(1, o.peakIndexInMountainArray(new int[]{0,1,0}));
        assertEquals(1, o.peakIndexInMountainArray(new int[]{0, 2, 1, 0}));
        assertEquals(1, o.peakIndexInMountainArray(new int[]{0, 3, 2, 1, 0}));
        assertEquals(2, o.peakIndexInMountainArray(new int[]{0, 1, 3, 2, 1, 0}));
        assertEquals(3, o.peakIndexInMountainArray(new int[]{0, 1, 2, 3, 2, 1, 0}));
        assertEquals(2, o.peakIndexInMountainArray(new int[]{3, 4, 5, 1}));
    }
}