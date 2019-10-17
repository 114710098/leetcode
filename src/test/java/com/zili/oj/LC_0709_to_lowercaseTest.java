package com.zili.oj;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC_0709_to_lowercaseTest {

    @Test
    public void toLowerCase() {
        assertEquals("abc", LC_0709_to_lowercase.toLowerCase("abc"));
        assertEquals("abc", LC_0709_to_lowercase.toLowerCase("ABC"));
        assertEquals("abc", LC_0709_to_lowercase.toLowerCase("aBc"));
        assertEquals("abc", LC_0709_to_lowercase.toLowerCase("ABc"));
        assertEquals("a123bc", LC_0709_to_lowercase.toLowerCase("A123Bc"));
        assertEquals("123", LC_0709_to_lowercase.toLowerCase("123"));
        assertEquals("", LC_0709_to_lowercase.toLowerCase(""));
    }
}