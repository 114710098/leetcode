package com.zili.oj;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC_0925_long_pressed_name_20191023040056Test {

    @Test
    public void isLongPressedName() {
        LC_0925_long_pressed_name_20191023040056 o = new LC_0925_long_pressed_name_20191023040056();
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