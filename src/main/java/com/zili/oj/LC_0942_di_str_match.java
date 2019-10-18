package com.zili.oj;

import java.util.Arrays;

public class LC_0942_di_str_match {
    public int[] diStringMatch(String S) {
        int N = S.length() + 1;
        int[] ans = new int[N];
        //a=[0,1,2,...,N-1]
        int lo =0;
        int hi =N-1;
        for (int i = N-2; i >= 0; i--) {
            char c=S.charAt(i);
            if (c == 'I') {
                ans[i+1] = hi--;
            } else {
                ans[i+1] = lo++;
            }
        }
        ans[0] = lo;
//        System.out.println(Arrays.toString(ans));
        return ans;
    }
}
