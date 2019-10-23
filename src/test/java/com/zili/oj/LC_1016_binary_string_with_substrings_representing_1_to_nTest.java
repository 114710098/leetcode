package com.zili.oj;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC_1016_binary_string_with_substrings_representing_1_to_nTest {

    @Test
    public void queryString() {
        LC_1016_binary_string_with_substrings_representing_1_to_n o = new LC_1016_binary_string_with_substrings_representing_1_to_n();
        assertTrue(o.queryString("0110", 3));
        assertFalse(o.queryString("0110", 4));
    }
}