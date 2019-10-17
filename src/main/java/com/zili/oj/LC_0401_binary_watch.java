package com.zili.oj;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_0401_binary_watch {
    public List<String> readBinaryWatch(int num) {
        boolean[] bins = new boolean[10];
        for (int i = 0; i < 10; i++) bins[i] = false;
        for (int i = 0; i < num; i++) bins[i] = true;
        List<boolean[]> combs = comb(bins);
        List<String> ans = new ArrayList<>();
        for(boolean[] i :combs){
            translate(i, ans);
        }
        return ans;
    }

    private List<boolean[]> comb(boolean[] a) {
        return null;
    }

    private void translate(boolean[] bins, List<String> ans) {
    }
}
