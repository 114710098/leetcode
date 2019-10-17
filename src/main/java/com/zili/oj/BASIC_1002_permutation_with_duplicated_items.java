package com.zili.oj;

import javax.sound.midi.Soundbank;
import java.util.*;

public class BASIC_1002_permutation_with_duplicated_items {
    public List<int[]> perm(int[] a) {
        List<int[]> ans = new ArrayList<>();
        helper(a, 0, ans);
        return ans;
    }

    private void swap(int[] a, int x, int y) {
        int tmp = a[x];
        a[x] = a[y];
        a[y] = tmp;
    }

    private void helper(int[] a, int off, List<int[]> ans) {
//        System.out.println(Arrays.toString(a));
        int N = a.length;
//        System.out.println("off=" + off);
        if (off == N - 1) {
            ans.add(Arrays.copyOf(a, a.length));
//            System.out.println("found new perm");
            return;
        }

        Set<Integer> s = new HashSet<>();
        for (int i = off; i < N; i++) {
//            System.out.println("swap: " + off + ", " + i);
            if (s.contains(a[i])) { //if a[i]的值在头部待过
//                System.out.println("skip a["+i+"]="+a[i]);
                continue;
            }
            s.add(a[i]);
            swap(a, off, i);
            helper(a, off + 1, ans);
            swap(a, off, i);
        }
    }
}
