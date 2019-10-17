package com.zili.oj;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LC_0392_is_subsequenceTest {
    @Test
    public void isSubsequence() {
        LC_0392_is_subsequence o = new LC_0392_is_subsequence();
        assertTrue(o.isSubsequence("", "ahbgdc"));
        assertTrue(o.isSubsequence("", ""));
        assertTrue(o.isSubsequence("a", "a"));
        assertFalse(o.isSubsequence("a", ""));
        assertFalse(o.isSubsequence("ab", "a"));
        assertTrue(o.isSubsequence("abc", "ahbgdc"));
        assertTrue(o.isSubsequence("ace", "abcde"));
        assertFalse(o.isSubsequence("aec", "abcde"));
        assertFalse(o.isSubsequence("axc", "ahbgdc"));
    }
}