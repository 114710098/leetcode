package com.zili.oj;

import java.util.LinkedHashSet;

public class LC_0392_is_subsequence {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        for (Character c : s.toCharArray()) {
            i = t.indexOf(c, i);
            if (i < 0) return false;
            i += 1;
        }
        return true;
    }
}
