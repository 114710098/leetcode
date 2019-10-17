package com.zili.oj;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LC_0219_contains_duplicate_II {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        System.out.println("input=" + Arrays.toString(nums));
        if(nums.length<2) return false;
        if(k<=0) return false;
        int N = nums.length;
        int dis = N;

        //for n=nums[i], map stores <n,i>
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int n = nums[i];
            System.out.println("processing "+n);
            if (m.containsKey(n))  dis = Math.min(dis, i - m.get(n));
            m.put(n, i);
        }

        System.out.println("min-distance=" + dis);
        if(dis==N) return false;
        return dis <= k;
    }
}

