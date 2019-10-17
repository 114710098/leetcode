package com.zili.oj;

import java.util.Arrays;

public class LC_0581_shortest_unsorted_continuous_subarray {
    public int findUnsortedSubarray(int[] nums) {
        int[] a = Arrays.copyOf(nums, nums.length);
        Arrays.sort(a);
        int i=0;
        for(i=0;i<a.length;i++)
            if(nums[i]!=a[i]) break;

        int j = 0;
        for (j=a.length-1;j>i;j--)
            if(nums[j]!=a[j]) break;

        return j - i + 1;
    }
}
