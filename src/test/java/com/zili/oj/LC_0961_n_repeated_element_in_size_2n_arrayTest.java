package com.zili.oj;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC_0961_n_repeated_element_in_size_2n_arrayTest {

    @Test
    public void repeatedNTimes() {
        LC_0961_n_repeated_element_in_size_2n_array o = new LC_0961_n_repeated_element_in_size_2n_array();
        assertEquals(2,o.repeatedNTimes(new int[]{1,2,2}));
        assertEquals(3,o.repeatedNTimes(new int[]{1,2,3,3}));
        assertEquals(2,o.repeatedNTimes(new int[]{2,1,2,5,3,2}));
        assertEquals(5,o.repeatedNTimes(new int[]{5,1,5,2,5,3,5,4}));
    }
}