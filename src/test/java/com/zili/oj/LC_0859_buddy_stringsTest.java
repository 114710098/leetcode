package com.zili.oj;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC_0859_buddy_stringsTest {

    @Test
    public void buddyStrings() {
        LC_0859_buddy_strings o = new LC_0859_buddy_strings();
        assertTrue(o.buddyStrings("ab", "ba"));
        assertFalse(o.buddyStrings("ab", "ab"));
        assertTrue(o.buddyStrings("aa", "aa"));
        assertTrue(o.buddyStrings("aaaaaaabc", "aaaaaaacb"));
        assertFalse(o.buddyStrings("", "aa"));
        assertFalse(o.buddyStrings("abcaa", "abcbb"));
    }
}