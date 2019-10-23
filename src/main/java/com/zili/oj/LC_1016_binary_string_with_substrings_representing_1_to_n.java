package com.zili.oj;

public class LC_1016_binary_string_with_substrings_representing_1_to_n {
    public boolean queryString(String S, int N) {
        for (int i = 1; i <= N; i++) {
            if (!S.contains(Integer.toBinaryString(i))) {
                return false;
            }
        }

        return true;
    }
}
