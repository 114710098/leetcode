package com.zili.oj;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC_0371_sum_of_two_intTest {

    @Test
    public void getSum() {
        LC_0371_sum_of_two_int o = new LC_0371_sum_of_two_int();
        assertEquals(5, o.getSum(2, 3));
        assertEquals(1, o.getSum(-2, 3));
        assertEquals(0, o.getSum(2, -2));
        assertEquals(5, o.getSum(0, 5));
    }
}