package com.zili.oj;

import java.util.Arrays;

// NOTE:
// 1. invalid input (e.g.: nums=null, nums.length<2)
// 2. negative int
// 3. int overflow

public class LC_0001_two_sum {
    private static int[] twoSum(int[] nums, int target) {
        int N = nums.length;
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                System.out.println(nums[i] + "+" + nums[j]);
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int target = 11;

        int[] a = LC_0001_two_sum.twoSum(nums, target);
        System.out.println(Arrays.toString(a));
    }
}
