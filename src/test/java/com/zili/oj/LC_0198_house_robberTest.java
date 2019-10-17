package com.zili.oj;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC_0198_house_robberTest {

    @Test
    public void rob() {
        LC_0198_house_robber o = new LC_0198_house_robber();
        assertEquals(0, o.rob(new int[]{ }));
        assertEquals(3, o.rob(new int[]{ 3}));
        assertEquals(3, o.rob(new int[]{1, 3}));
        assertEquals(4, o.rob(new int[]{1, 2, 3, 1}));
        assertEquals(12, o.rob(new int[]{2, 7, 9, 3, 1}));
        assertEquals(35, o.rob(new int[]{2, 17, 1, 2, 18}));
    }
}