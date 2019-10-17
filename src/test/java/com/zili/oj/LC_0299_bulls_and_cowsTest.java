package com.zili.oj;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC_0299_bulls_and_cowsTest {
    @Test
    public void getHint() {
        LC_0299_bulls_and_cows o = new LC_0299_bulls_and_cows();
        assertEquals("1A3B",o.getHint("1807", "7810"));
        assertEquals("1A1B", o.getHint("1123", "0111"));
        assertEquals("1A0B", o.getHint("11", "10"));
    }
}