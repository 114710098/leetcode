package com.zili.oj;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC_1021_remove_outermost_parenthesesTest {

    @Test
    public void removeOuterParentheses() {
        LC_1021_remove_outermost_parentheses o = new LC_1021_remove_outermost_parentheses();
        assertEquals("()()()()(())", o.removeOuterParentheses("(()())(())(()(()))"));
        assertEquals("()()()", o.removeOuterParentheses("(()())(())"));
        assertEquals("", o.removeOuterParentheses("()()"));
    }
}