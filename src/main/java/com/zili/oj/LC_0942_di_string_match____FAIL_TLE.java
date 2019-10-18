package com.zili.oj;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_0942_di_string_match____FAIL_TLE {
    public int[] diStringMatch(String S) {
        f = false;
        int N = S.length();
        int[] a = new int[N + 1];
        for (int i = 0; i <= N; i++) a[i] = i;
        List<int[]> ans = new ArrayList<>();
        dfs(a, 0, S, ans);
//        for(int[] x:ans) System.out.println(Arrays.toString(x));
        return ans.get(0);
    }

    private void swap(int[] a, int x, int y) {
        System.out.printf("swap: a[%d], a[%d]\n", x, y);
        int tmp = a[x];
        a[x] = a[y];
        a[y] = tmp;
    }

    private boolean f=false;
    private void dfs(int[] a, int off, String S, List<int[]> ans) {
        if(f) return;
        System.out.println("off=" + off);
        int N = a.length;
        if (off == N) {
            ans.add(Arrays.copyOf(a, a.length));
            System.out.println("found one path: " + Arrays.toString(a));
            f=true;
            return;
        }
        for (int i = off; i < N; i++) {
            if (off > 0) System.out.printf("checking: a[%d]=%d, a[%d]=%d  ", off - 1, a[off - 1], i, a[i]);
            if (off < N && off > 0) {
                if (S.charAt(off - 1) == 'I') {
                    if (a[off - 1] > a[i]) {
                        System.out.println("skip");
                        continue;
                    }
                } else {
                    if (a[off - 1] < a[i]) {
                        System.out.println("skip");
                        continue;
                    }
                }
            }
            System.out.println("OK");
            swap(a, off, i);
            dfs(a, off + 1, S, ans);
            swap(a, off, i);
        }
    }
}

