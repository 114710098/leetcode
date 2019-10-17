package com.zili.oj;

public class LC_1221_split_a_string_in_balanced_strings {
    public int balancedStringSplit(String s) {
        int ans = 0;
        int N = s.length();
        int nL=0;
        int nR=0;
        for (int i = 0; i < N; i++) {
            char c = s.charAt(i);
            if(c=='L') nL += 1;
            if(c=='R') nR += 1;
            if (nL == nR && nL != 0) {
                ans += 1;
                nL = 0;
                nR = 0;
            }
        }
        if(nL!=0||nR!=0) return 0;
        return ans;
    }
}
