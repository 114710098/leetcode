package com.zili.oj;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC_0219_contains_duplicate_IITest {

    @Test
    public void containsNearbyDuplicate() {
        LC_0219_contains_duplicate_II o = new LC_0219_contains_duplicate_II();
        assertFalse(o.containsNearbyDuplicate(new int[]{}, 0));
        assertFalse(o.containsNearbyDuplicate(new int[]{1}, 0));
        assertFalse(o.containsNearbyDuplicate(new int[]{1,2}, 1));
        assertFalse(o.containsNearbyDuplicate(new int[]{1,2}, 1));
        assertTrue(o.containsNearbyDuplicate(new int[]{99,99}, 2));
        assertTrue(o.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
        assertTrue(o.containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));
        assertFalse(o.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2));
    }
}