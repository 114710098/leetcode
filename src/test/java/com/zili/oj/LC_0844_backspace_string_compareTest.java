package com.zili.oj;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC_0844_backspace_string_compareTest {

    @Test
    public void backspaceCompare() {
        LC_0844_backspace_string_compare o = new LC_0844_backspace_string_compare();
        assertTrue(o.backspaceCompare("ab#c", "ad#c"));
        assertTrue(o.backspaceCompare("", ""));
        assertTrue(o.backspaceCompare("ab#d#c", "ad#c"));
        assertTrue(o.backspaceCompare("adb#", "ad"));
        assertTrue(o.backspaceCompare("#ab#c", "ad#c"));
        assertTrue(o.backspaceCompare("##", "#"));
        assertFalse(o.backspaceCompare("a#c", "ac"));
        assertFalse(o.backspaceCompare("ad#c", "ab#cd"));
    }
}