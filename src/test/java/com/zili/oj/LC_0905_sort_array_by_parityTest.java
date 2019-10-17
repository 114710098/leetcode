package com.zili.oj;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC_0905_sort_array_by_parityTest {

    @Test
    public void sortArrayByParity() {
        LC_0905_sort_array_by_parity o = new LC_0905_sort_array_by_parity();
        assertArrayEquals(new int[]{4,2,3,1}, o.sortArrayByParity(new int[]{1,2,3,4}));
        assertArrayEquals(new int[]{4,2,1,3}, o.sortArrayByParity(new int[]{3,1,2,4}));
        assertArrayEquals(new int[]{1,3,5}, o.sortArrayByParity(new int[]{1,3,5}));
        assertArrayEquals(new int[]{2,4,6}, o.sortArrayByParity(new int[]{2,4,6}));
        assertArrayEquals(new int[]{}, o.sortArrayByParity(new int[]{}));
    }
}