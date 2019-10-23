package com.zili.oj;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC_0925_long_pressed_nameTest {

    @Test
    public void isLongPressedName() {
        LC_0925_long_pressed_name o = new LC_0925_long_pressed_name();
        assertTrue(o.isLongPressedName("alex", "aaleex"));
        assertTrue(o.isLongPressedName("alex", "alex"));
        assertTrue(o.isLongPressedName("alex", "alexx"));
        assertTrue(o.isLongPressedName("leelee", "lleeelee"));
        assertFalse(o.isLongPressedName("saeed", "ssaaedd"));
        assertFalse(o.isLongPressedName("alex", "alx"));
        assertFalse(o.isLongPressedName("alex", ""));
        assertFalse(o.isLongPressedName("pyplrz", "ppyypllr"));
    }
}