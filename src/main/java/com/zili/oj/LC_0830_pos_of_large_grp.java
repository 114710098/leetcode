package com.zili.oj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_0830_pos_of_large_grp {
    public static List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> a = new ArrayList<>();
        int i=1;
        int grpVal = S.charAt(0);
        int grpLen = 1;
        int N = S.length();
        while (i < N - 2) {
            if (S.charAt(i) == grpVal) {
                grpLen += 1;
                System.out.println("group extends");
                System.out.println("grpLen=" + grpLen);
                System.out.println("grpVal=" + String.valueOf(grpVal));
                System.out.println();
            } else {
                if (grpLen > 2) {
                    a.add(new ArrayList<Integer>(Arrays.asList(i, i - grpLen + 1)));
                }
                grpLen = 1;
                grpVal = S.charAt(i);
                System.out.println("new group");
                System.out.println("grpLen=" + grpLen);
                System.out.println("grpVal=" + String.valueOf(grpVal));
                System.out.println();
            }
            i += 1;
        }
        if (grpLen > 2) {
            a.add(new ArrayList<Integer>(Arrays.asList(i, i - grpLen + 1)));
        }
        return a;
    }
}
