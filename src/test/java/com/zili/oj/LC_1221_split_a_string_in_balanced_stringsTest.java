package com.zili.oj;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC_1221_split_a_string_in_balanced_stringsTest {

    @Test
    public void balancedStringSplit() {
        LC_1221_split_a_string_in_balanced_strings o = new LC_1221_split_a_string_in_balanced_strings();
        assertEquals(4, o.balancedStringSplit("RLRRLLRLRL"));
        assertEquals(3, o.balancedStringSplit("RLLLLRRRLR"));
        assertEquals(1, o.balancedStringSplit("LLLLRRRR"));
        assertEquals(0, o.balancedStringSplit("LL"));
        assertEquals(0, o.balancedStringSplit("LLR"));
        assertEquals(0, o.balancedStringSplit(""));
    }
}