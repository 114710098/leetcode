package com.zili.oj;

import org.junit.Test;
import static org.junit.Assert.*;

public class LC_0605_can_place_flowersTest {

    @Test
    public void canPlaceFlowers() {
        LC_0605_can_place_flowers o = new LC_0605_can_place_flowers();
        assertTrue(o.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1));
        assertFalse(o.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2));
        assertTrue(o.canPlaceFlowers(new int[]{0, 0, 1, 1, 1}, 1));
        assertTrue(o.canPlaceFlowers(new int[]{0, 0, 1, 0, 0}, 2));
        assertTrue(o.canPlaceFlowers(new int[]{0, 0, 0}, 2));
        assertTrue(o.canPlaceFlowers(new int[]{ 0}, 1));
    }
}